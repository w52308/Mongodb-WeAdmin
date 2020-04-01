package com.qxw.mongodb;

import static com.qxw.bean.CommonConstants.CONF_MONGODB_OMMSPC_DATABASE;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.qxw.bean.CommonConstants;
import com.qxw.utils.ClusterConfigProperties;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.net.SocketFactory;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;

/**
 * mongo配置
 *
 * @author qinxuewu
 * @version 1.00
 * @time 29/11/2018 下午 1:34
 * @email 870439570@qq.com
 */
@Configuration
public class MongoConfig {
    private final Logger LOGGER = LoggerFactory.getLogger(getClass());
    
    @Value("${mongo.host.port}")
    private String HOST_PORT;
    
    @Value("${mongo.user.pass.db}")
    private String USER_PASS_DB;
    
    @Value("${mongoDB.admin.database}")
    private String adminDB;
    
    @Value("${mongoDB.ommspc.database}")
    private String ommSpcDB;
    
    @Value("${mongoDB.video.database}")
    private String videoDB;
    
    @Bean
    public MongoClient mongoClient() {
        LOGGER.debug("*********初始化mongodb*************************");
        MongoClient mongoClient = null;
        try {
            LOGGER.info("begin init mongo db client.");
            
            // 定义连接服务器参数
            MongoClientOptions options = buildMongoClientOptions();
            
            LOGGER.info("MongoClientOptions is {}", options.toString());
            
            // 获取mongo服务的连接
            List<ServerAddress> serverAdddresses = getMongoServerAddresses();
            if (CollectionUtils.isEmpty(serverAdddresses)) {
                LOGGER.warn("no mongo server found.");
            }
            
            // 获取认证凭据
            List<MongoCredential> mongoCredentials = getMongoCredentials();
            
            // 连接mongo
            mongoClient = new MongoClient(serverAdddresses, mongoCredentials, options);
            
            // 这里这个方法主要是为了检测有没有可用的mongo的服务节点，如果没有可用的服务节点或者鉴权失败则抛出MongoTimeoutException
            mongoClient.getConnectPoint();
            // 连接到ADMIN数据库
            /*adminDB = mongoClient.getDB(adminDB);
            ommSpcDB = mongoClient.getDB(ommSpcDB);
            videoDB = mongoClient.getDB(videoDB);*/
            LOGGER.debug("Connect mongo finished.");
        } catch (Exception e) {
            LOGGER.error("MongoDBManager init() failed {}", ExceptionUtils.getStackTrace(e));
        }
        LOGGER.info("*********** mongoClient 偏好为=「」" + mongoClient.getReadPreference().toString());
        return mongoClient;
    }
    
    /**
     * 获取mongo的服务
     * <功能详细描述>
     *
     * @return mongo服务列表
     * @see [类、类#方法、类#成员]
     */
    private List<ServerAddress> getMongoServerAddresses() {
        PropertiesConfiguration properties = ClusterConfigProperties.getInstance().getProperties();
        String mongoIp = properties.getString("mongoIp");
        String[] ips = mongoIp.split(";");
        List<ServerAddress> list = new ArrayList<ServerAddress>();
        for (int i = 0; i < ips.length; i++) {
            // 定义服务器地址ip:port
            ServerAddress serverAddress = new ServerAddress(ips[i]);
            list.add(serverAddress);
        }
        
        return list;
    }
    
    /**
     * <一句话功能简述>
     * <功能详细描述>
     *
     * @return 认证凭据
     * @see [类、类#方法、类#成员]
     */
    private List<MongoCredential> getMongoCredentials() {
        PropertiesConfiguration properties = ClusterConfigProperties.getInstance().getProperties();
        // 获取用户名
        String user = properties.getString(CommonConstants.CONF_MONGODB_SSL_USER);
        MongoCredential credential = MongoCredential.createMongoX509Credential(user);
        List<MongoCredential> mongoCredentials = new ArrayList<MongoCredential>();
        mongoCredentials.add(credential);
        return mongoCredentials;
    }
    
    /**
     * 根据配置文件生成连接mongo服务器参数
     * <功能详细描述>
     *
     * @return MongoClientOptions
     * @see [类、类#方法、类#成员]
     */
    private MongoClientOptions buildMongoClientOptions() {
        // 定义连接服务器参数
        MongoClientOptions.Builder builder = new MongoClientOptions.Builder();
        
        builder.sslInvalidHostNameAllowed(true);
        builder.sslEnabled(true);
        builder.socketFactory(getSocketFactory());
        PropertiesConfiguration properties = ClusterConfigProperties.getInstance().getProperties();
        builder.connectionsPerHost(10);
        builder.socketTimeout(30000);
        builder.maxWaitTime(5000);
        builder.threadsAllowedToBlockForConnectionMultiplier(10);
        builder.socketKeepAlive(true);
        
        // 设置选择服务的链接超时时间
        builder.serverSelectionTimeout(10000);
        return builder.build();
    }
    
    private SocketFactory getSocketFactory() {
        PropertiesConfiguration properties = ClusterConfigProperties.getInstance().getProperties();
        String certPath = properties.getString(CommonConstants.CONF_MONGODB_SSL_CERT_PATH);
        String hostName = properties.getString(CommonConstants.CONF_MONGODB_SSL_HOST_NAME);
        
        InputStream is = null;
        InputStream trustIs = null;
        SocketFactory socketFactory = null;
        try {
            String mongoPwd = "qHBdcPkzGetbD/btn9cE9w==";
            
            KeyStore key = KeyStore.getInstance("PKCS12");
            is = new FileInputStream(getMongoClientCAFile(certPath, hostName));
            key.load(is, mongoPwd.toCharArray());
            
            KeyStore trustKey = KeyStore.getInstance("JKS");
            trustIs = new FileInputStream(getMongoRootCAFile(certPath));
            trustKey.load(trustIs, mongoPwd.toCharArray());
            
            KeyManagerFactory kmf = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
            kmf.init(key, mongoPwd.toCharArray());
            
            TrustManagerFactory tmf = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            tmf.init(trustKey);
            
            SSLContext sslContext = SSLContext.getInstance("TLSv1.2");
            sslContext.init(kmf.getKeyManagers(), tmf.getTrustManagers(), null);
            socketFactory = sslContext.getSocketFactory();
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException | UnrecoverableKeyException | KeyManagementException e) {
            LOGGER.error("get socket factory fail.{}", ExceptionUtils.getStackTrace(e));
        } finally {
            closeQuietly(is);
            closeQuietly(trustIs);
        }
        return socketFactory;
    }
    
    private File getMongoClientCAFile(String certPath, String hostName) {
        String filePath = certPath + hostName + "C.p12";
        File clientCAFile = new File(filePath);
        if (!clientCAFile.exists() || !clientCAFile.isFile()) {
            LOGGER.warn("mongo client ca file[" + filePath + "] not exists.");
            throw new IllegalStateException("mongo client ca file[" + filePath + "] not exists.");
        }
        return clientCAFile;
    }
    
    private File getMongoRootCAFile(String certPath) {
        String filePath = certPath + "root-ca.jks";
        File rootCAFile = new File(filePath);
        if (!rootCAFile.exists() || !rootCAFile.isFile()) {
            LOGGER.warn("mongo root ca file[" + filePath + "] not exists.");
            throw new IllegalStateException("mongo root ca file[" + filePath + "] not exists.");
        }
        return rootCAFile;
    }
    
    public void closeQuietly(Closeable closeable) {
        try {
            if (closeable != null) {
                closeable.close();
            }
        } catch (IOException var2) {
        }
        
    }
}
