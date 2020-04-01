package com.qxw.utils;

import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.FileBasedConfigurationBuilder;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

/**
 * 功能描述
 *
 * @since 2020 -03-31
 */
public class ClusterConfigProperties {
    private static final ClusterConfigProperties ourInstance = new ClusterConfigProperties();
    
    public static ClusterConfigProperties getInstance() {
        return ourInstance;
    }
    
    public static PropertiesConfiguration propConfig = null;
    
    private ClusterConfigProperties() {
    }
    
    public PropertiesConfiguration getProperties() {
        if (propConfig == null) {
            Configurations configs = new Configurations();
            // setDefaultEncoding是个静态方法,用于设置指定类型(class)所有对象的编码方式。
            // 本例中是PropertiesConfiguration,要在PropertiesConfiguration实例创建之前调用。
            FileBasedConfigurationBuilder.setDefaultEncoding(PropertiesConfiguration.class, "UTF-8");
            try {
                String os = System.getProperty("os.name");
                String path = "/usr/local/iGET/config/cluster/clusterConfig.properties";
                if (os.toLowerCase().startsWith("win")) {
                    path = "E:\\Log\\clusterConfig.properties";
                }
                propConfig = configs.properties(path);
            } catch (ConfigurationException e) {
                e.printStackTrace();
            }
        }
        return propConfig;
    }
    
}
