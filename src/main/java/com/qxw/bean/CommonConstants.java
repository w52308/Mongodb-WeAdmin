/*
 * 文 件 名:  CommonConstants.java
 * 版    权:  Huawei Technologies Co., Ltd. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 *
 * 修改时间:  2014-2-24
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */

package com.qxw.bean;

import java.text.DecimalFormat;

/**
 * 通用常量类
 *
 * @version [版本号, 2014-2-24]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public interface CommonConstants {
    /**
     * 算法信息存储路径
     */
    String ALGORITHM_ROOT = "/VCM/algorithm";
    
    /**
     * 检索算法存储路径
     */
    String MCS_ALGORITHM_ROOT = "/VCM/mcsPlugin";
    
    /**
     * MCS NVN agent根路径
     */
    String MCS_NNAGENT_ROOT = "/MCS-Cluster-DCoS";
    
    /**
     * mcsAgent信息基路径
     */
    String MCS_AGENT_ROOT = "/VCM/Service";
    
    /**
     * zk加密信息存储路径
     */
    String ENCRYPT_PATH = "/VCM/nodes/sc/switch";
    
    /**
     * 人员名单库/车辆名单库索引盐值路径
     */
    String SALT_DATA = "/VCM/nodes/sc/0001";
    
    /**
     * 统一特征提取配置路径
     */
    String FEATURE_EXTRACT_PATH = "/VCM/config/feature";
    
    /**
     * 布控能力配置路径
     */
    String SUSPECT_CAPABILITY_PATH = "/VCM/config/suspectCapability";
    
    /**
     * 动态配置检索字段
     */
    String HWDATASTANDARD_PATH = "/HWDataStandard";
    
    /**
     * 动态字典表配置文件
     */
    String DATADICTIONARY_PATH = "/Data";
    
    /**
     * 特殊符号正斜杆
     */
    String COMMON_POSITIVE_DIAGONAL = "/";
    
    /**
     * 特殊符号下划线
     */
    String COMMON_UNDERLINE = "_";
    
    /**
     * URL-HTTP头
     */
    String HTTP_URL_HEADER = "http://";
    
    /**
     * DPC端口号
     */
    String DPC_PORT = "12323";
    
    /**
     * 限制传入的参数大小，防止内存溢出
     */
    int LIMIT_POST_SIZE = 5 * 1024 * 1024;
    
    /**
     * 错误码的前缀
     */
    String RESULTCODE_PRE = "30870";
    
    /**
     * 字符串常量0
     */
    String STRING_CONSTANTS_ZERO = "0";
    
    /**
     * 字符串常量1
     */
    String STRING_CONSTANTS_ONE = "1";
    
    /**
     * 字符串常量2
     */
    String STRING_CONSTANTS_TWO = "2";
    
    /**
     * 1,车牌类型黑名单
     */
    String PLATE_TYPE_BLACK = "0";
    
    /**
     * 2,车牌类型白名单
     */
    String PLATE_TYPE_WHIGHT = "1";
    
    /**
     * 老人体算法
     */
    String OLD_BODY_ALROGITHM = "0100";
    
    /**
     * mongodb ip
     */
    String CONF_MONGODB_IP = "mongoDB.ip";
    
    /**
     * mongodb admin database
     */
    String CONF_MONGODB_ADMIN_DATABASE = "mongoDB.admin.database";
    
    /**
     * mongodb omm_spc database
     */
    String CONF_MONGODB_OMMSPC_DATABASE = "mongoDB.ommspc.database";
    
    /**
     * mongodb omm_spc database
     */
    String CONF_MONGODB_VIDEO_DATABASE = "mongoDB.video.database";
    
    /**
     * mongodb user
     */
    String CONF_MONGODB_SSL_USER = "mongossl.userName";
    
    /**
     * mongodb SSL PWD
     */
    String CONF_MONGODB_SSL_TRUST_CODE = "mongossl.trustPwd";
    
    /**
     * mongodb SSL PWD iv
     */
    String CONF_MONGODB_SSL_TRUST_CODE_IV = "mongossl.trustIv";
    
    /**
     * mongodb SSL CERT PATH
     */
    String CONF_MONGODB_SSL_CERT_PATH = "mongossl.certPath";
    
    /**
     * mongodb SSL HOST NAME
     */
    String CONF_MONGODB_SSL_HOST_NAME = "mongossl.hostName";
    
    /**
     * solr SSL CERT PATH
     */
    String CONF_SOLR_SSL_CERT_PATH = "solrssl.certPath";
    
    /**
     * solr SSL HOST NAME
     */
    String CONF_SOLR_SSL_TRUST_CODE = "solrssl.trustPwd";
    
    /**
     * solr SSL HOST NAME
     */
    String CONF_SOLR_SSL_TRUST_CODE_IV = "solrssl.trustIv";
    
    /**
     * 服务器实际建立的连接数量
     */
    String CONF_MONGODB_CONNECTIONSPERHOST = "mongoDB.option.connectionsPerHost";
    
    /**
     * 保持与数据库之间的连接。如果保持连接，</br>
     * 则与数据库的连接一旦建立，就不会关闭，那么后续的数据库访问就不需要重新建立连接了。</br>
     */
    String CONF_MONGODB_SOCKETKEEPALIVE = "mongoDB.option.socketKeepAlive";
    
    /**
     * mongo服务节点群选择可用服务的超时时间
     */
    String CONF_MONGODB_SERVERSELECTIONTIMEOUT = "mongoDB.option.serverSelectionTimeout";
    
    /**
     * 数据库连接读取和写入数据的timeout
     */
    String CONF_MONGODB_SOCKETTIMEOUT = "mongoDB.option.socketTimeout";
    
    /**
     * 一个线程访问数据库的时候，在成功获取到一个可用数据库连接之前的最长等待时间。
     */
    String CONF_MONGODB_MAXWAITTIME = "mongoDB.option.maxWaitTime";
    
    /**
     * 每个连接上可以排队等待的线程数量
     */
    String CONF_MONGODB_THREADSALLOWED = "mongoDB.option.threadsAllowedToBlockForConnectionMultiplier";
    
    /**
     * 查询历史告警，每页显示的最大告警数量。
     */
    String ALARM_HISTORYQUERYPERPAGESIZE = "alarm.historyQueryPerPageSize";
    
    /**
     * 告警和过车数据有效期(该字段在V1R3C00中遗失了,暂时不使用它)
     */
    String ALARM_DATA_EXPIRE_DAYS = "VCM.SDB.SDB.AlarmDataExpireDays";
    
    /**
     * 数字常量-1
     */
    int NUMBER_CONSTANTS_NEGATIVE_ONE = -1;
    
    /**
     * 生成序列ID的最大范围
     */
    int NUMBER_CONSTANTS_MAXSEQUENCE = 99999;
    
    /**
     * 数字常量0
     */
    int NUMBER_CONSTANTS_0 = 0;
    
    /**
     * 数字常量1
     */
    int NUMBER_CONSTANTS_1 = 1;
    
    /**
     * 数字常量2
     */
    int NUMBER_CONSTANTS_2 = 2;
    
    /**
     * 数字常量4
     */
    int NUMBER_CONSTANTS_3 = 3;
    
    /**
     * 数字常量4
     */
    int NUMBER_CONSTANTS_4 = 4;
    
    /**
     * 数字常量5
     */
    int NUMBER_CONSTANTS_5 = 5;
    
    /**
     * 数字常量32
     */
    int NUMBER_CONSTANTS_32 = 32;
    
    /**
     * 数字常量255
     */
    int NUMBER_CONSTANTS_255 = 255;
    
    /**
     * 数字常量360
     */
    int NUMBER_CONSTANTS_360 = 360;
    
    /**
     * MP下载图片token有限时间 单位秒
     */
    int MP_VALIDATE_TOKEN_TIME = 2 * 60 * 60;
    
    /**
     * 数字常量1000
     */
    int NUMBER_CONSTANTS_1000 = 1000;
    
    /**
     * 0.5
     */
    float FLOAT_0_POINT_5 = 0.5f;
    
    /**
     * 开始时间
     */
    String NODE_STARTTIME = "start-time";
    
    /**
     * 结束时间
     */
    String NODE_ENDTIME = "end-time";
    
    /**
     * 查询指定页码
     */
    String NODE_PAGENO = "page-no";
    
    /**
     * 每页显示数量
     */
    String NODE_PERPAGESIZE = "page-size";
    
    /**
     * 通用返回错误消息内容
     */
    String NODE_RESULT_ERRORMSG = "errmsg";
    
    /**
     * 通用返回消息码
     */
    String NODE_RESULT_CODE = "code";
    
    /**
     * 通用返回消息结果
     */
    String NODE_RESULT = "result";
    
    /**
     * 通用返回节点
     */
    String NODE_RESPONSE = "response";
    
    /**
     * 请求节点
     */
    String NODE_REQUEST = "request";
    
    /**
     * 摄像机组list（原来叫卡口）
     */
    String NODE_CAMERA_GROUP_LIST = "bayonetList";
    
    /**
     * 摄像机组sn（原来叫卡口）
     */
    String NODE_CAMERA_GROUP_SN = "bayonetSn";
    
    /**
     * 摄像机组（原来叫卡口）
     */
    String NODE_CAMERA_GROUP = "bayonet";
    
    /**
     * 告警集合
     */
    String NODE_ALARMLIST = "alarm-list";
    
    /**
     * 摄像机列表
     */
    String NODE_CAMERAS = "cameras";
    
    /**
     * 失败的订阅内容
     */
    String NODE_FAILSUBS = "failSubs";
    
    /**
     * 失败任务订阅列表
     */
    String NODE_FAILSUB = "failSub";
    
    /**
     * 统计
     */
    String NODE_STATISTICS = "statistics";
    
    /**
     * 消息
     */
    String NODE_MESSAGE = "message";
    
    /**
     * 1,人脸黑名单
     */
    String FACE_TYPE_BLACK = "1";
    
    /**
     * 人脸id节点
     */
    String NODE_PEOPLEID = "peopleId";
    
    /**
     * 人脸状态
     */
    String NODE_PEOPLE_STATE = "state";
    
    /**
     * 人脸状态
     */
    String NODE_FACE_STATE = "face-state";
    
    /**
     * 人脸状态
     */
    String NODE_FACE_STATE_LIST = "face-state-list";
    
    /**
     * 人脸列表节点
     */
    String NODE_PEOPLE = "people";
    
    /**
     * 人脸列表节点
     */
    String NODE_PEOPLELIST = "peopleList";
    
    /**
     * 车牌节点
     */
    String NODE_PLATE = "plate";
    
    /**
     * 文件id
     */
    String NODE_FILE_ID = "fileId";
    
    /**
     * 查询条件
     */
    String NODE_CONDITION = "condition";
    
    /**
     * 当前页
     */
    String NODE_CURPAGE = "curPage";
    
    /**
     * 每页页数
     */
    String NODE_PAGECOUNT = "pageCount";
    
    /**
     * 黑名单组列表节点
     */
    String NODE_GROUPLIST = "grouplist";
    
    /**
     * 黑名单组节点
     */
    String NODE_GROUP = "group";
    
    /**
     * VA2提取特征
     */
    int VA2 = 1;
    
    /**
     * MCS提取特征
     */
    int NO_VA2 = 0;
    
    /**
     * MCSAgent检索&比对&特征提取服务
     */
    String MCS_AGENT_SERVICE_TYPE = "MediaContentSearch";
    
    /**
     * MCSAgent失败重新加入调度缓存时间
     */
    String MCS_AGENT_FAILED_OUT_TIME = "300000";
    
    /**
     * 无可调度路由时MCSAgent重新加入调度缓存时间
     */
    String MCS_AGENT_NONE_FAILED_OUT_TIME = "30000";
    
    /**
     * MCSAgent加入黑名单的失败次数
     */
    String MCS_AGENT_FAILED_TIMES = "3";
    
    /**
     * 人脸比对MCS Agent超时时间
     */
    String FACE_MATCH_MCS_OUT_TIME = "3";
    
    /**
     * 人员库检索MCS Agent超时时间
     */
    String REPOSITORY_SEACH_MCS_OUT_TIME = "10000";
    
    /**
     * MCS Agent特征提取超时时间
     */
    String FEATURE_EXTRACT_MCS_OUT_TIME = "16000";
    
    /**
     * MCS Agent心跳请求超时时间
     */
    String MCS_AGENT_HEARTBEAT_OUT_TIME = "3";
    
    /**
     * MCS Agent心跳间隔时间
     */
    String MCS_AGENT_HEARTBEAT_INTERVAL = "30";
    
    /**
     * MCS Agent服务化调用
     */
    String MCS_AGENT_ROUND_ROBIN = "1";
    
    /**
     * 只调度一台MCS
     */
    String ONE_MCS = "1";
    
    /* * -------------------------------------------- 二级库XML相关 begin -------------------------------------------- */
    
    /**
     * 二级库联网采集 下载开始时间节点
     */
    String NODE_SDB_DOWNLOAD_START_TIME = "download-start-time";
    
    /**
     * 二级库联网采集 下载结束时间节点
     */
    String NODE_SDB_DOWNLOAD_END_TIME = "download-end-time";
    
    /**
     * 二级库联网采集 保存时间节点
     */
    String NODE_SDB_EXPIRE_TIME = "expire-time";
    
    /**
     * 二级库联网采集 案件节点
     */
    String NODE_SDB_CASE_ID = "case-id";
    
    /**
     * 二级库联网采集 监控平台名称节点
     */
    String NODE_SDB_PLATEFORM_NAME = "platform-name";
    
    /**
     * 二级库联网采集 存储路径节点
     */
    String NODE_SDB_FILE_PATH = "file-path";
    
    /**
     * 二级库联网采集 策略信息节点
     */
    String NODE_SDB_DOWNLOADPOLICY = "downloadpolicy";
    
    /**
     * 二级库联网采集 策略ID节点
     */
    String NODE_SDB_DOWNLOADPOLICY_ID = "id";
    
    /**
     * 二级库联网采集 录像开始日期节点
     */
    String NODE_SDB_RECORD_START_DATE = "record-start-date";
    
    /**
     * 二级库联网采集 录像结束日期节点
     */
    String NODE_SDB_RECORD_END_DATE = "record-end-date";
    
    /**
     * 二级库联网采集 策略名称节点
     */
    String NODE_SDB_DOWNLOADPOLICY_NAME = "name";
    
    /**
     * 二级库联网采集 策略名称节点
     */
    String NODE_SDB_DOWNLOADPOLICY_DESCRIPTION = "description";
    
    /**
     * 二级库联网采集 录像类型节点
     */
    String NODE_SDB_RECORD_TYPE = "record-type";
    
    /**
     * 二级库联网采集 智能分析类型节点
     */
    String NODE_SDB_INTELLIGENT_ANALYSIS = "intell-type";
    
    /**
     * 二级库联网采集 智能分析类型节点
     */
    String NODE_SDB_OPERATION_SYSTEM = "operation-system";
    
    /**
     * 二级库联网采集任务状态节点
     */
    String NODE_SDB_DOWNLOADPOLICY_STATUS = "status";
    
    /**
     * 二级库联网采集任务ID节点
     */
    String NODE_SDB_DOWNLOADPOLICY_TASK_ID = "id";
    
    /**
     * 二级库联网采集 策略ID节点
     */
    String NODE_SDB_DOWNLOADPOLICY_REFERCAMERA_ID = "downloadpolicy-id";
    
    /**
     * 二级库联网采集 客户端IP节点
     */
    String NODE_SDB_DOWNLOADPOLICY_CLIENTIP = "client-ip";
    
    /**
     * 二级库联网采集 策略异常信息
     */
    String NODE_SDB_DOWNLOADPOLICY_ERRORDESCRIPTION = "err-desc";
    
    /* * -------------------------------------------- 二级库XML相关 end   -------------------------------------------- */
    
    /* * -------------------------------------------- 告警消息XML相关 begin -------------------------------------------- */
    
    /**
     * 分辨率
     */
    String NODE_RESOLUTION = "resolution";
    
    /**
     * 告警返回信息根节点alarms
     */
    String NODE_ALARMS = "alarms";
    
    /**
     * 任务信息节点
     */
    String NODE_TASKINFO = "task-info";
    
    /**
     * 告警总条数
     */
    String NODE_TOTALCOUNT = "total-count";
    
    /**
     * 告警返回信息告警信息alarm
     */
    String NODE_ALARM = "alarm";
    
    /**
     * 告警返回信息轨迹对象object
     */
    String NODE_OBJECT = "object";
    
    /**
     * 告警返回信息轨迹对象object属性id
     */
    String NODE_ATTRIBUTE_ID = "id";
    
    /**
     * 告警ID
     */
    String NODE_ALARM_ID = "alarm-id";
    
    /**
     * 属性type
     */
    String NODE_ATTRIBUTE_TYPE = "type";
    
    /**
     * 告警返回信息任务ID
     */
    String NODE_TASK_ID = "task-id";
    
    /**
     * 布控Id
     */
    String NODE_SUSPECT_ID = "suspectId";
    
    /**
     * 告警返回信息任务ID
     */
    String NODE_TASK_ID_NEW = "taskId";
    
    /**
     * 告警返回信息任务ID列表
     */
    String NODE_TASK_ID_LIST = "task-list";
    
    /**
     * 告警返回信息摄像机ID
     */
    String NODE_CAMERA_ID = "camera-id";
    
    /**
     * 告警返回信息摄像机名称
     */
    String NODE_CAMERA_NAME = "camera-name";
    
    /**
     * 告警返回信息摄像机地点
     */
    String NODE_CAMERA_ADDRESS = "camera-address";
    
    /**
     * 告警返回信息案件ID
     */
    String NODE_CASEFILE_ID = "case-file-id";
    
    /**
     * 告警返回信息告警发生时间
     */
    String NODE_ALARM_TIME = "alarm-time";
    
    /**
     * 告警返回信息告警类型
     */
    String NODE_RULE = "rule";
    
    /**
     * 告警级别1.紧急 2.严重 3.一般 4.提示
     */
    String NODE_LEVEL = "alarm-level";
    
    /**
     * 匹配车牌号
     */
    String NODE_LPN = "lpn";
    
    /**
     * 告警来源1.摄像机 2.虚拟卡口 3.实体卡口。
     */
    String NODE_ALARMSOURCE = "source";
    
    /**
     * 卡口编码
     */
    String NODE_VSTATIONSN = "vstation-sn";
    
    /**
     * 卡口编码数组
     */
    String NODE_VSTATIONSN_LIST = "vstation-sn-list";
    
    /**
     * 行为分析告警信息节点
     */
    String NODE_BEHAVIORINFO = "ba-info";
    
    /**
     * 人脸识别节点
     */
    String NODE_FRINFO = "fr-info";
    
    /**
     * 人脸ID节点
     */
    String NODE_FRINFO_FACEID = "face-id";
    
    /**
     * 识别结果可信度节点
     */
    String NODE_FRINFO_SCORE = "score";
    
    /**
     * 来源节点，0：黑名单 1：临时库
     */
    String NODE_FRINFO_BASE = "base";
    
    /**
     * 车牌识别信息节点
     */
    String NODE_LPRINFO = "lpr-info";
    
    /**
     * 车牌矩形节点
     */
    String NODE_LPRINFO_PLATE_RECT = "plate-rect";
    
    /**
     * 车牌矩形left节点
     */
    String NODE_LPRINFO_PLATE_RECT_LEFT = "left";
    
    /**
     * 车牌矩形right节点
     */
    String NODE_LPRINFO_PLATE_RECT_RIGHT = "right";
    
    /**
     * 车牌矩形top节点
     */
    String NODE_LPRINFO_PLATE_RECT_TOP = "top";
    
    /**
     * 车牌矩形bottom节点
     */
    String NODE_LPRINFO_PLATE_RECT_BOTTOM = "bottom";
    
    /**
     * 车牌号
     */
    String NODE_LPRINFO_LINCENSEPLATE = "license-plate";
    
    /**
     * 车牌颜色
     */
    String NODE_LPRINFO_PLATECOLOR = "plate-color";
    
    /**
     * 车牌类型
     */
    String NODE_LPRINFO_PLATETYPE = "plate-type";
    
    /**
     * 可信度
     */
    String NODE_LPRINFO_CONFIDENCE = "confidence";
    
    /**
     * 车身亮度
     */
    String NODE_LPRINFO_CARBRIGHT = "car-bright";
    
    /**
     * 车身颜色
     */
    String NODE_LPRINFO_CARCOLOR = "car-color";
    
    /**
     * 方向
     */
    String NODE_LPRINFO_DIRECTION = "car-direction";
    
    /* * -------------------------------------------- 告警消息XML相关 end -------------------------------------------- */
    
    /* * -------------------------------------------- 推送接口 begin -------------------------------------------- */
    /* * --------------------------------------------推送接口 end -------------------------------------------- */
    
    /* * --------------------------------------------虚拟卡口  begin -------------------------------------------- */
    
    /* * --------------------------------------------虚拟卡口 end -------------------------------------------- */
    
    /* * -------------------------------------------- 定时器  begin -------------------------------------------- */
    
    /* * --------------------------------------------定时器 end -------------------------------------------- */
    
    /* * --------------------------------------------虚拟卡口布控  begin -------------------------------------------- */
    
    /**
     * 人脸列表节点
     */
    String NODE_INSPECTION_FACES = "faces";
    
    /**
     * 人脸节点
     */
    String NODE_INSPECTION_FACE = "face";
    
    /* * --------------------------------------------虚拟卡口布控 end -------------------------------------------- */
    
    /* * -------------------------------------------- 二级库系统配置 begin -------------------------------------------- */
    
    /**
     * 默认文档有效期key(老接口/update-configuration中表示资料文件有效期,当前代码逻辑已不使用)
     */
    String ONLINE_FILE_VALIDITY = "VCM.SDB.SDB.OnlineFileValidity";
    
    // 新标准定的数据库字段,将数据库字段根据业务细分
    // 实时过人、过脸、过车数据库数据留存期(3个,行为分析无实时数据)
    /**
     * 违章数据留存期
     */
    String VEHICLE_ITS_DATA_VALIDITY = "VCM.SDB.SDB.VehicleItsDataValidity";
    
    /**
     * 车流量数据留存期
     */
    String VEHICLE_FLOWRATE_DATA_VALIDITY = "VCM.SDB.SDB.VehicleFlowRateDataValidity";
    
    /**
     * 过人数据库留存期
     */
    String HUMAN_DB_DATA_VALIDITY = "VCM.SDB.SDB.HumanDbDataValidity";
    
    /**
     * 过脸数据库留存期
     */
    String FACE_DB_DATA_VALIDITY = "VCM.SDB.SDB.FaceDbDataValidity";
    
    /**
     * 过车数据库留存期
     */
    String LPR_DB_DATA_VALIDITY = "VCM.SDB.SDB.LprDbDataValidity";
    
    // 过人、过脸、过车对应图片数据及半结构化数据留存期(5个)
    /**
     * 过人文件留存期
     */
    String HUMAN_FILE_DATA_VALIDITY = "VCM.SDB.SDB.HumanFileDataValidity";
    
    /**
     * 过脸文件留存期
     */
    String FACE_FILE_DATA_VALIDITY = "VCM.SDB.SDB.FaceFileDataValidity";
    
    /**
     * 过车文件留存期
     */
    String LPR_FILE_DATA_VALIDITY = "VCM.SDB.SDB.LprFileDataValidity";
    
    /**
     * 行为分析告警数据库留存期
     */
    String BA_ALARM_DB_DATA_VALIDITY = "VCM.SDB.SDB.BaAlarmDbDataValidity";
    
    /**
     * 行为分析告警文件留存期
     */
    String BA_ALARM_FILE_DATA_VALIDITY = "VCM.SDB.SDB.BaAlarmFileDataValidity";
    
    /**
     * 长尾算法留存期
     */
    String LONG_TAIL_DATA_VALIDITY = "VCM.SDB.SDB.individualAlgorithmDataValidity";
    
    // 资料文件有效期,数据库记录和实际文件留存期相同(1个)
    /**
     * 资料留存期
     */
    String CASE_FILE_VALIDITY = "VCM.SDB.SDB.CaseFileValidity";
    
    /* * -------------------------------------------- 二级库系统配置 end ---------------------------------------------- */
    
    /* * --------------------------------------------分析资源信息 start -------------------------------------------- */
    
    /* * --------------------------------------------分析资源信息 end -------------------------------------------- */
    
    /**
     * 文档有效期（永久，10000天）
     */
    int VCM_SDB_FILES_EXPIRATION = 10000;
    
    /**
     * VCM类型的服务容器
     */
    int SC_VCM_CONTAINER_TYPE = 1;
    
    /**
     * MP类型的服务容器
     */
    int SC_MP_CONTAINER_TYPE = 2;
    
    /**
     * MP类型的服务容器(外部)
     */
    int SC_MP_OUTER_CONTAINER_TYPE = 2001;
    
    /**
     * SDK类型的服务容器
     */
    int SDK_CONTAINER_TYPE = 3;
    
    /**
     * mongo omm_case_file _objectType字段：容器类型
     */
    String OBJECTTYPE_CONTAINER_TYPE = "CONTAINER_TYPE";
    
    /**
     * 预处理文件存储路径
     */
    String VE_PROCESS_PATH = "ve/process/";
    
    /**
     * 告警文档有效期(老接口/update-configuration中表示过车、过车告警、行为分析告警数据有效期,当前代码逻辑已不使用)
     */
    String ALARM_FILE_VALIDITY = "VCM.SDB.SDB.AlarmFileValidity";
    
    /* * --------------------------------------------ServiceName end -------------------------------------------- */
    
    /**
     * SDK历史版本超级管理员登录账户名称
     */
    String SDKADMINISTRATOR_NAME = "sdkadmin";
    
    /**
     * 超级管理员登录账户名称
     */
    String ADMINISTRATOR_NAME = "admin";
    
    /**
     * 用户组分级特性开关--ZK路径 默认0 启用 1 关闭
     */
    String USERGROUP_PERMISSION_ZKPATH = "/alarmconfig/characterSwitch";
    
    /**
     * 静态库用户组分级特性开关--ZK路径 默认0 启用 1 关闭
     */
    String STATIC_USERGROUP_PERMISSION_ZKPATH = "/alarmconfig/staticCharacterSwitch";
    
    /**
     * 0 单个dpc
     * 1 dpc list或callback方式
     */
    String ALARMTYPE_NODE = "/alarmconfig/alarmtype";
    
    /**
     * 0 http
     * 1 https
     */
    String ALARM_HTTP_MODE = "/alarmconfig/httpmode";
    
    /**
     * 人员黑名单容量限制
     * 30w
     * 90W
     */
    String FACE_BLACK_MAX_LIMIT = "/Cloud/faceblacklimit";
    
    /**
     * 人员布控容量限制
     * 30w
     * 90W
     */
    String FACE_CONTROL_MAX_LIMIT = "/Cloud/facecontrollimit";
    
    /**
     * 车辆黑名单容量限制
     * 5w
     * 30W
     */
    String VEHICLE_BLACK_MAX_LIMIT = "/Cloud/vehicleblacklimit";
    
    /**
     * 推送地址模式：
     * 0.北向对接地址；1.存储服务地址（https模式）；2.存储服务地址（http模式）；
     * 默认为：1
     */
    String VA_IMG_URL_MODE = "/VCM/config/vaImgUrlMode";
    
    /**
     * 是否开启图片token校验：
     * 1.开启（默认）；0.关闭
     */
    String IMG_DOWNLOAD_TOKEN_ENABLE = "/VCM/config/ImgDownloadTokenEnable";
    
    /**
     * 是否返回车牌名单默认组：
     * 1.返回(默认)；0.不返回
     */
    String RETURN_DEFAULT_GROUP = "/VCM/config/ReturnDefaultGroup";
    
    /**
     * 告警是否支持高精度，高精度为原人脸告警阈值可为double类型：
     * 0.不支持 1.支持
     */
    String ALARM_SUPPORT_HIGH_ACCURACY = "/VCM/config/alarmSupportHighAccuracy";
    
    /**
     * 是否开启isNationality 民族字段显示：
     * 1.开启；0.关闭（默认）
     */
    String ZK_IS_NATIONALITY = "/VCM/config/isNationality";
    
    /**
     * 域间检索是否过滤算法：
     * 1.开启；0.关闭（默认）
     */
    String IS_GET_IMAGE_FROM_THIRDURL = "/VCM/config/isGetImageFromThirdUrl";
    
    /**
     * 域间检索是否过滤算法：
     * 1.开启；0.关闭（默认）
     */
    String IS_ALL_ALGORITHM = "/VCM/config/isAllAlgorithm";
    
    /**
     * 环境是否R3升级上来：
     * 0.否，使用thumpicurl，1.是，使用picurlsmall,2.都返回
     */
    String IS_PIC_URL_SMALL = "/VCM/config/isPicUrlSmall";
    
    /**
     * 车辆外域以图搜图接口
     * -1:不配置（默认），0：v1.0，1：v1.1，2：v1.2，3：v1.3，4：v1.4，5：v1.5，6：v1.6，7：v1.7；
     */
    String VERSION_OF_VEHICLE = "/VCM/config/versionOfVehicle";
    
    /**
     * 车辆外域检索接口
     * -1:不配置（默认），0：v1.0，1：v1.1，2：v1.2，3：v1.3，4：v1.4，5：v1.5，6：v1.6，7：v1.7；
     */
    String VERSION_OF_SEARCH_VEHICLE = "/VCM/config/versionOfSearchVehicle";
    
    /**
     * 人脸外域检索接口
     * -1:不配置（默认），0：v1.0，1：v1.1，2：v1.2，3：v1.3，4：v1.4，5：v1.5，6：v1.6，7：v1.7；
     */
    String VERSION_OF_PEOPLEFACE = "/VCM/config/versionOfPeopleface";
    
    /**
     * 极速分析子任务分片时长
     */
    String AMAZING_ANALYZE_TASK_DURATION = "/VCM/config/amazingAnalyzeTaskDuration";
    
    /**
     * 全网智能摄像机图片url访问路径是否优先为vcn
     * 0:false（默认），1:true；
     */
    String ZK_WATCH_PATH_PICFROMVCN = "/VCM/config/PicFromVCN";
    
    /**
     * 下级域的摄像机图片url生成规则
     * 2:生成上级域MP地址 1:优先生成访问上级域的图片url（默认），0：优先生成访问下级域的图片url；
     */
    String ZK_WATCH_PATH_PICFROMLOCALDOAMIN = "/VCM/config/PicFromLocalDomain";
    
    /**
     * 1400摄像机配置节点名称
     */
    String CAMERA_1400_CONFIG = "/VCM/config/1400Config";
    
    /**
     * 域间接口是否需要对摄像机平台编码做转换 0 否， 1 是 ， 默认 0
     */
    String CONVERT_CAMERA_PLATFORM_CODE = "/VCM/config/convertCameraPlatformCode";
    
    /**
     * 是否支持特征值布控 0 false 1 true
     */
    String DOMAIN_FEATURE_SUSPECT = "/VCM/config/domainFeatureSuspectEnable";
    
    /**
     * 域间名单绝对值限制
     */
    String DOMAIN_SYNC_BWDATA_ONCE_NUMBER_LIMIT = "/VCM/config/domainSyncBwdataOnceNumberLimit";
    
    /**
     * 特征值同步是否下发图片 0 false 1 true
     */
    String DOMAIN_SYNC_PICTURE_SWITCH = "/VCM/config/domainSyncPictureSwitch";
    
    /**
     * 特征值同步下发图片 1 true
     */
    String DOMAIN_SYNC_PICTURE_ENABLE = "1";
    
    /**
     * 域间名单绝对值限制默认值
     */
    String DOMAIN_SYNC_BWDATA_ONCE_NUMBER_DEFAULT = "300000";
    
    /**
     * 支持特征值布控 1 true
     */
    String DOMAIN_FEATURE_SUSPECT_ENABLE = "1";
    
    /**
     * 管理员权限
     */
    String ROLE_ADMIN = "ROLE_ADMIN";
    
    /**
     * solr客户端读写socket超时
     */
    String SOLR_SO_TIMEOUT = "solr_so_timeout";
    
    /**
     * solr客户端socket连接超时
     */
    String SOLR_CONNECTION_TIMEOUT = "solr_connection_timeout";
    
    /**
     * solr http client 单node最大连接数
     */
    String SOLR_MAX_CONN_PER_ROUTE = "solr_http_maxconnperroute";
    
    /**
     * solr version字段
     */
    String SOLR_KEY_VERSION = "_version_";
    
    /**
     * 二级库使用默认用户ID
     */
    Long SDB_USER_ID = 0L;
    
    /**
     * 上传超时时间
     */
    int UPLOAD_TIMEOUT_SECONDS = 30 * 60;
    
    /**
     * 数字常量1024
     */
    int NUMBER_CONSTANTS_1024 = 1024;
    
    /**
     * 数字常量128
     */
    int NUMBER_CONSTANTS_128 = 128;
    
    /**
     * 1分钟相应的毫秒数
     */
    long LONG_MS_OF_MIN = 60000;
    
    /**
     * 任务状态
     */
    String NODE_VCKTASK_STATUS = "status";
    
    /**
     * 优先级
     */
    String NODE_VCKTASK_PRIORITY = "priority";
    
    /**
     * 任务类型
     */
    String NODE_VCKTASK_TASKTYPE = "type";
    
    /**
     * 策略ID
     */
    String NODE_VCKTASK_DPPOLICYID = "policy-id";
    
    /**
     * 摄像机ID
     */
    String NODE_VCKTASK_DPCAMERAID = "camera-id";
    
    /**
     * 摄像机互联编码
     */
    String NODE_VCKTASK_DPCAMERACNCODE = "cameraCNCode";
    
    /**
     * 录像下载开始时间
     */
    String NODE_VCKTASK_DPSTARTTIME = "dp-start-time";
    
    /**
     * 录像下载结束时间
     */
    String NODE_VCKTASK_DPENDTIME = "dp-end-time";
    
    /**
     * 任务有效期
     */
    String NODE_VCKTASK_EXPIRETIME = "expire-time";
    
    /**
     * 任务清理期
     */
    String NODE_VCKTASK_CLEARTIME = "clear-time";
    
    /**
     * 任务状态
     */
    String NODE_VCKTASK_TASKID = "task-id";
    
    /**
     * 任务
     */
    String NODE_VCKTASK_TASK = "task";
    
    /**
     * 预留10秒给在排队执行中的录像下载任务，
     * 如果当前时间离任务有效期结束在10秒内，这个录像就不用考虑下载。
     * 因为一个视频的下载整体流程走下来都不至10秒，
     * 当任务扫描线程循环到第三轮扫描，马上就会停止这个下载。
     */
    long LONG_CONSTANTS_10000 = 10000;
    
    /**
     * 视频采集临时文件存储目录
     */
    String IVSDOWNLOAD_TMP_SAVE_PATH = "ivsdownload";
    
    /**
     * 请求mcss获取文件临时存储路径rest接口的URI
     */
    String REQUEST_MCSS_GET_FILE_TMP_SAVEPATH_URI = "/mp_mcss/s2Storage/getFileTmpSavePath.do";
    
    /**
     * 任务列表
     */
    String NODE_VCKTASK_TASKLIST = "task-list";
    
    /**
     * 告警总条数
     */
    String NODE_HASNEXTPAGE = "has-next-page";
    
    /**
     * 任务百分比
     */
    String NODE_VCKTASK_TASK_PERCENT = "percent";
    
    /**
     * 二级库联网采集路径名称
     */
    String NODE_SDB_DOWNLOADPOLICY_DIRNAME = "dir-name";
    
    /**
     * 保存在session中的区域、拌线的搜索条件名称
     */
    // public static final String CURRENT_SEARCH_CONDITION = "CURRENT_SEARCH_CONDITION";
    
    /* ********************元数据操作xml节点begin*************************** */ String NODE_PERCEPTUAL_ELEMENT = "element";
    
    /**
     * 注释内容
     */
    String NODE_PERCEPTUAL_SPACENAME = "spaceName";
    
    /**
     * 注释内容
     */
    String NODE_PERCEPTUAL_TABLENAME = "tableName";
    
    /**
     * 注释内容
     */
    String NODE_PERCEPTUAL_METADATA = "meta-data";
    
    /**
     * 注释内容
     */
    String NODE_PERCEPTUAL_CONDITION = "condition";
    
    /**
     * 查询操作符
     */
    String NODE_PERCEPTUAL_OPER = "oper";
    
    /**
     * 查询字段
     */
    String NODE_PERCEPTUAL_KEY = "key";
    
    /**
     * 注释内容
     */
    String NODE_PERCEPTUAL_VALUE = "value";
    
    /**
     * 查询页码
     */
    String NODE_PERCEPTUAL_PAGE = "page";
    
    /**
     * 查询当前页
     */
    String NODE_PERCEPTUAL_NO = "no";
    
    /**
     * 查询每页返回大小
     */
    String NODE_PERCEPTUAL_SIZE = "size";
    
    /**
     * 查询排序
     */
    String NODE_PERCEPTUAL_SORT = "sort";
    
    /**
     * 查询排序名称
     */
    String NODE_PERCEPTUAL_ORDER_NAME = "ordername";
    
    /**
     * 注释内容
     */
    String NODE_PERCEPTUAL_TOTALCOUNT = "totalCount";
    
    /* ********************元数据操作xml节点end***************************** */
    
    /* ********************摄像机xml节点 begin***************************** */
    
    /**
     * 摄像机编码
     */
    String NODE_CAMERA_INFO_SN = "sn";
    
    /**
     * 摄像机互联编码
     */
    String NODE_CAMERA_INFO_DEVICE_CODE = "device-code";
    
    /**
     * 摄像机名称
     */
    String NODE_CAMERA_INFO_NAME = "name";
    
    /**
     * 摄像机安装高度
     */
    String NODE_CAMERA_INFO_MOUNT_HEIGHT = "mount-height";
    
    /**
     * 摄像机经度
     */
    String NODE_CAMERA_INFO_LONGITUDE = "longitude";
    
    /**
     * 摄像机纬度
     */
    String NODE_CAMERA_INFO_LATITUDE = "latitude";
    
    /**
     * 摄像机地址
     */
    String NODE_CAMERA_INFO_ADDRESS = "address";
    
    /**
     * 摄像机ip
     */
    String NODE_CAMERA_INFO_STREAM_URL = "stream-url";
    
    /**
     * 摄像机方位
     */
    String NODE_CAMERA_INFO_DIRECTION = "direction";
    
    /**
     * 摄像机车道
     */
    String NODE_CAMERA_INFO_LANE = "lane";
    
    /**
     * 摄像机在线状态
     */
    String NODE_CAMERA_INFO_CAMERA_STATE = "camera-state";
    
    /**
     * 摄像机类型
     */
    String NODE_CAMERA_INFO_CAMERA_TYPE = "camera-type";
    
    /**
     * 摄像机用途
     */
    String NODE_CAMERA_INFO_CAMERA_USE = "camera-use";
    
    /**
     * 摄像机功能
     */
    String NODE_CAMERA_INFO_CAMERA_FEATURE = "camera-feature";
    
    /**
     * 摄像机平台名称
     */
    String NODE_CAMERA_INFO_PLAT_NAME = "plat-name";
    
    /**
     * 摄像机分辨率
     */
    String NODE_CAMERA_INFO_RESOLUTION_TYPE = "resolution-type";
    
    /**
     * 摄像机nvr
     */
    String NODE_CAMERA_INFO_NVR = "nvr";
    
    /**
     * 摄像机fieldNo
     */
    String NODE_CAMERA_INFO_FIELD_NO = "field-no";
    
    /**
     * 摄像机主辅码流列表
     */
    String NODE_CAMERA_STREAMINFOLIST = "streamInfoList";
    
    /**
     * 摄像机主辅码流信息
     */
    String NODE_CAMERA_STREAMINFO = "streamInfo";
    
    /**
     * 摄像机节点
     */
    String NODE_CAMERA = "camera";
    
    /**
     * 摄像机列表
     */
    String NODE_CAMERA_LIST = "camera-list";
    
    /**
     * 是不是告警
     */
    String NODE_ALARMCONFIRM = "confirm";
    
    /**
     * 告警返回信息告警是否关闭closed 0取未关闭告警， 1取已关闭告警
     */
    String NODE_CLOSED = "closed";
    
    /* ********************摄像机xml节点 end***************************** */
    
    /**
     * 告警服务器地址 tcp url
     */
    String NODE_TCP_ALARM_URL = "tcp-alarm-url";
    
    /**
     * 告警服务器地址 http url
     */
    String NODE_HTTP_ALARM_URL = "http-alarm-url";
    
    /**
     * 告警返回信息人数统计
     */
    String NODE_OBJECT_COUNT_IN = "object-count-in";
    
    /**
     * 告警返回信息人数统计
     */
    String NODE_OBJECT_COUNT_OUT = "object-count-out";
    
    /**
     * 标记节点(告警是否订阅)
     */
    String NODE_FLAG = "flag";
    
    /**
     * 请求mcss获取摘要存储路径rest接口的URI
     */
    String REQUEST_MCSS_GET_SUMMARY_FILE_URI = "/mp_mcss/video/getSummaryFileUrl.do";
    
    /**
     * 原始文件下载地址
     */
    String DOWNLOAD_URL = "/mp_mcss/caseFile/download.do";
    
    /**
     * 转码文件下载地址
     */
    String DOWNLOADTRANSCODE_URL = "/mp_mcss/caseFile/downloadTranscode.do";
    
    /**
     * 摘要文件下载地址
     */
    String DOWNLOADSUMMARY_URL = "/mp_mcss/caseFile/downloadSummary.do";
    
    /**
     * 预处理文件下载地址
     */
    String DOWNLOADPREPROCESS_URL = "/mp_mcss/caseFile/downloadPreProcess.do";
    
    /**
     * 人脸文件下载地址
     */
    String FACEDOWNLOAD_URL = "/mp_mcss/caseFile/downloadImg.do?fileUuid=";
    
    /**
     * 人脸文件下载地址
     */
    String FACEDOWNLOAD_MP_URL = "/mp_mcss/caseFile/downloadImg.do";
    
    /**
     * VCN图片下载地址
     */
    String VCN_IMAGE = "/mp_mcss/vcn-image.do?fileUuid=";
    
    /**
     * VCN图片下载地址
     */
    String VCN_MP_IMAGE = "/mp_mcss/vcn-image.do";
    
    /**
     * 转码临时文件存储目录
     */
    String TRANSCODE_TMP_SAVE_PATH = "transcode";
    
    /**
     * 视频截断临时文件存储目录
     */
    String CLIP_TMP_SAVE_PATH = "clip";
    
    /**
     * 标准基准时间（称为“历元（epoch）”，即 1970 年 1 月 1 日 00:00:00 GMT）
     */
    String EPOCH_TIME = "1970-01-01 00:00:00";
    
    /**
     * 下载文件（类型：原始视频、原始图片、其他）
     */
    String DOWNLOAD_FILE = "1";
    
    /**
     * 下载视频转码文件
     */
    String DOWNLOAD_TRANSCODE_FILE = "2";
    
    /**
     * 下载视频摘要文件
     */
    String DOWNLOAD_SUMMARY_FILE = "3";
    
    /**
     * 下载预处理文件
     */
    String DOWNLOAD_PREPROCESS_FILE = "4";
    
    /**
     * 下载过车文件
     */
    String DOWNLOAD_LPR_FILE = "9";
    
    /**
     * 1,正在添加
     */
    String FACE_ADD = "1";
    
    /**
     * 2,正在删除
     */
    String FACE_DELETE = "2";
    
    /**
     * 3,正在更新
     */
    String FACE_UPDATE = "3";
    
    /**
     * 4,添加失败
     */
    String FACE_ADD_FAIL = "4";
    
    /**
     * 5,更新失败
     */
    String FACE_UPDATE_FAIL = "5";
    
    /**
     * 6,部分成功
     */
    String FACE_PART_FAIL = "6";
    
    /**
     * 189103008,非人脸图片添加失败
     */
    String FACE_ADD_FAIL_NOFACE = "189103008";
    
    /**
     * 189103001,人脸识别License不可用
     */
    String VA_FR_LICENSE_INVALID = "189103001";
    
    /**
     * 小文件合并接口
     */
    String SMALL_FILE_COMBINE_INTERFCE = "1";
    
    /**
     * 普通文件批量接口
     */
    String COMMON_FILE_UPLOAD_INTERFCE = "2";
    
    /**
     * 精度为小数点后2位时，四舍五入时的最大误差
     */
    float PRECISION = 0.005f;
    
    /**
     * 元数据分析分片时长
     */
    String VIDEO_FRAGMENT_RANGE = "video_fragment_range";
    
    /**
     * 元数据分析分片配额
     */
    String VIDEO_FRAGMENT_DISPATCH_QUOTA = "video_fragment_dispatch_quota";
    
    /**
     * 业务失败重试次数
     */
    String TASK_FAILURE_RETRY = "task_failure_retry";
    
    /**
     * 业务失败重试执行线程数
     */
    String TASK_FAILURE_RETRY_THREAD_NUMBER = "task_failure_retry_thread_number";
    
    /**
     * 录像分片时长key
     */
    String VIDEO_SPLIT_DURATION = "VCM.SDB.SDB.VideoSplitDuration";
    
    /**
     * 时间正则  yyyymmddhhmmss
     */
    String TIME_REGREX
        = "^((([12][0-9][0-9][0-9](0[13578]|1[02])(0[1-9]|[12][0-9]|3[01]))|([12][0-9][0-9][0-9](0[2469]|11)(0[1-9]|[12][0-9]|30)))(20|21|22|23|[0-1][0-9])[0-5][0-9][0-5][0-9])$";
    
    /**
     * -1
     */
    String STRING_CONSTANTS_NEGATIVE_ONE = "-1";
    
    /**
     * 特殊符号冒号
     */
    String COMMON_COLON = ":";
    
    /**
     * 特殊符号逗号
     */
    String COMMON_COMMA = ",";
    
    /**
     * 特殊符号(
     */
    String BRACKET_LEFT = "(";
    
    /**
     * 特殊符号)
     */
    String BRACKET_RIGHT = ")";
    
    /**
     * 特殊符号空格
     */
    String COMMON_SPACE = " ";
    
    /**
     * 线程获取未分析车牌的数量限制
     */
    int GET_UNCARFEATURE_LIMITED = 350;
    
    /* *******************业务空间容量单位转换移位值BEGIN******************************* */
    /**
     * TB需要左移位40转换为Byte
     */
    int CONVERT_INT_UNIT_TB = 40;
    
    /**
     * GB需要左移位30转换为Byte
     */
    int CONVERT_INT_UNIT_GB = 30;
    
    /**
     * MB需要左移位20转换为Byte
     */
    int CONVERT_INT_UNIT_MB = 20;
    
    /* *******************业务空间容量单位转换移位值END******************************* */
    
    /* *******************业务空间容量单位BEGIN******************************* */
    /**
     * TB
     */
    int UNIT_TB = 0;
    
    /**
     * GB
     */
    int UNIT_GB = 1;
    
    /**
     * MB
     */
    int UNIT_MB = 2;
    
    /* *******************业务空间容量单位END******************************* */
    
    /**
     * XLS文件类型
     */
    String FILE_TYPE_XLS = ".xls";
    
    /**
     * mp videosource
     */
    String SERVICE_NAME_VDS = "VDS";
    
    /**
     * 平台类型
     */
    String VIDEO_SOURCE_TYPE = "IVS-C02";
    
    /**
     * VDS断连成功码
     */
    int VDS_KILL_CODE = 21;
    
    /**
     * 按时间统计方式
     */
    String TIME_SEARCH_TYPE = "0";
    
    /**
     * 按摄像机统计方式
     */
    String CAMERA_SEARCH_TYPE = "1";
    
    /**
     * 按年查询方式
     */
    String YEAR_VIEW_MODE = "0";
    
    /**
     * 按月查询方式
     */
    String MONTH_VIEW_MODE = "1";
    
    /**
     * 按日查询方式
     */
    String DAY_VIEW_MODE = "2";
    
    /**
     * 本域接口
     */
    int LOCAL_INTERFACE = 1;
    
    /**
     * 多域接口
     */
    int DOMAIN_INTERFACE = 2;
    
    /**
     * 本域黑名单组
     */
    String LOCAL_BLACK_GROUP = "1";
    
    /**
     * 全域黑名单组
     */
    String DOMAIN_BLACK_GROUP = "2";
    
    /**
     * 系统默认黑名单组ID
     */
    String DEFAULT_BLACK_GROUP_ID = "000000000000000000000000";
    
    /**
     * 系统默认车牌黑名单规格
     */
    int PLATE_BLACK_MAX = 50000;
    
    /**
     * 系统默认人脸黑名单规格
     */
    int FACE_BLACK_MAX = 100000;
    
    /**
     * 系统默认车牌黑名单组规格
     */
    int PLATE_BLACK_GROUP_MAX = 50000;
    
    /**
     * 系统默认单个黑名单图片个数上限
     */
    int BLACK_PIC_MAX = 5;
    
    /**
     * 文件最大长度
     */
    int FILE_MAX_LENGTH = 1024 * 1024 * 5;
    
    /**
     * 车牌黑名单或黑名单组类型
     */
    String PLATE_BLACK_TYPE = "0";
    
    /**
     * 查询最大值
     */
    int SEARCH_MAX_NUMBER = 10000;
    
    /**
     * 分页查询页码最大值
     */
    int MAX_PAGE_NO = 100;
    
    /**
     * 分页查询每页大小最大值
     */
    int MAX_PAGE_SIZE = 100;
    
    /**
     * 删除车辆特征分析结果最大值
     */
    int MAX_DELETE_VEHICLE_SIZE = 100;
    
    /**
     * 单次上传文件的个数校验上限
     */
    long MAX_UPLOAD_FILESIZE = 500L;
    
    /**
     * 单个文件上传的最大大小校验上限
     */
    long MAX_FILESIZE = 10240L;
    
    /**
     * 最大上传速度校验上限
     */
    long MAX_MAXUPLOAD = 10485760L;
    
    /**
     * IVS立即采集摄像机限制数校验上限
     */
    int MAX_IMME_DOWNLOAD_CAMERASLIMIT = 128;
    
    /**
     * 跨天采集天数校验上限
     */
    int MAX_DOWNLOAD_POLICY_OVERDAYS_LIMIT = 9;
    
    /**
     * 历史录像采集过期时长(分钟)校验上限
     */
    int MAX_IMME_DOWNLOAD_TIMEOUT_LIMIT = 180;
    
    /**
     * 默认文档有效期(天)校验上限
     */
    int MAX_ONLINE_FILE_VALIDITY = 9999;
    
    /**
     * 告警和过车数据有效期(天)校验上限
     */
    int MAX_ALARM_FILE_VALIDITY = 9999;
    
    /**
     * 分辨率 4K最大宽度
     */
    int RELUTION_MAX_WIDTH_VALUE = 4096;
    
    /**
     * 分辨率 4K最大高度
     */
    int RELUTION_MAX_HEIGHT_VALUE = 3000;
    
    /**
     * SDK最大承载的任务数为600
     */
    int MAX_LOAD_TASK_NUMBER = 600;
    
    /**
     * 接口中接收列表最大数量
     */
    int MAX_LIST_SIZE = 1000;
    
    /**
     * 请求的最大文件数量
     */
    int REQUEST_MAX_FILE_SIZE = 5;
    
    /**
     * 全网智能相机图片分析模式
     */
    String INTELCAMERA_IMAGE_ANALYZE_MODE = "0";
    
    /**
     * 全网智能相机视频视频
     */
    String INTELCAMERA_VIDEO_ANALYZE_MODE = "1";
    
    /**
     * 是否提取人体特征
     */
    String EXTRACT_HUMAN_FEATURE = "1";
    
    /**
     * 不提取人体特征
     */
    String NO_EXTRACT_HUMAN_FEATURE = "0";
    
    /**
     * 算法业务类型
     */
    String ALGORITHMTASK = "1vN";
    
    /**
     * 单域时从MCS响应中取指定页数据后防止MONGO数据不存在的余量
     */
    int TMP_NUM = 10;
    
    /**
     * 降序排序
     */
    String DESC = "desc";
    
    /**
     * BASE64字串头
     */
    String BASE64HEAD = "data:image/png;base64";
    
    /**
     * 每天的秒数
     */
    long SECOND_PER_DAY = 86400;
    
    /**
     * 每秒的毫秒数
     */
    int MILLIS_PER_SECOND = 1000;
    
    /**
     * VCM和VCN处在不同网段，需要NAT穿越
     */
    String VCN_VCM_NAT_PASS = "1";
    
    /**
     * 下个世纪，表示永不删除
     */
    long NEXT_CENTRY = 4102416000000L;
    
    /**
     * 百分数的分母部分
     */
    double PERCENT_MULTIPLY_BASE = 100.0;
    
    /**
     * 多域scheme
     */
    String WHOLE_DOMAIN_SCHEME = "2";
    
    /**
     * 本域scheme
     */
    String LOCAL_DOMAIN_SCHEME = "1";
    
    /**
     * 多余复杂检索的异步超时时间
     */
    int DOMAIN_SEARCH_SESSION_TIMEOUT_MS = 70000;
    
    /**
     * 人脸特征值
     */
    String FACE_FEATURE = "0";
    
    /**
     * 人体特征值
     */
    String BODY_FEATURE = "1";
    
    /**
     * 骑行人特征值
     */
    String RIDER_FEATURE = "2";
    
    /**
     * 车辆特征值
     */
    String CAR_FEATURE = "3";
    
    /**
     * 名单库人员添加
     */
    String REPO_ADD = "0";
    
    /**
     * 名单库人员删除
     */
    String REPO_DELETE = "1";
    
    /**
     * 名单库人员更新
     */
    String REPO_UPDATE = "2";
    
    /**
     * +     * 名单库信息更新
     * +
     */
    String REPO_INFO_UPDATE = "3";
    
    /**
     * 名单库异步消息
     */
    String REPO_ASYNC = "0";
    
    /**
     * 名单库同步消息
     */
    String REPO_SYNC = "1";
    
    // 多域布控相关常量定义------start------
    /**
     * 上级域同步黑名单或组到下级域：新增
     */
    int ADD_BLACK_DATA = 1;
    
    /**
     * 上级域同步黑名单或组到下级域：删除
     */
    int DELETE_BLACK_DATA = 2;
    
    /**
     * 上级域同步黑名单或组到下级域：更新
     */
    int UPDATE_BLACK_DATA = 3;
    
    /**
     * 上级域同步黑名单或组到下级域：移动黑白名单到另外的黑白单组
     */
    int MOVE_BALCK_DATA = 4;
    
    /**
     * 0表示仅含有本域的内容
     */
    int DTYPE_LOCALDOMAIN = 0;
    
    /**
     * 判断mongo中字段是仅含本级域的内容还是还有多域布控的内容，1表示含有多域的内容
     */
    int DTYPE_MULTIDOMAIN = 1;
    
    /**
     * 默认本级域给某个上级域人脸黑名单预留的最大空间比例
     */
    int FACE_SPACE_MAX_PERCENT_FOR_UPDOMAIN = 20;
    
    /**
     * 智能分析任务查询权限
     */
    int VIEW_RIGHT = 1008;
    
    /**
     * 智能分析任务管理权限
     */
    int MGT_RIGHT = 1009;
    
    /**
     * 黑名单或图片同步状态
     *
     * @version [版本号, 2017-8-23]
     * @see [相关类/方法]
     * @since [产品/模块版本]
     */
    public enum SYNC_STATE {
        /**
         * 未同步
         */
        SYNC_STATE_NOT,
        /**
         * 同步中
         */
        SYNC_STATE_IN,
        /**
         * 同步成功
         */
        SYNC_STATE_SUCCEED,
        /**
         * 同步失败
         */
        SYNC_STATE_FAILED;
    }
    
    // 多域布控相关常量定义------end------
    
    /**
     * HTTP协议类型枚举
     */
    enum HttpProtocolType {
        HTTP("0", "http://"),
        HTTPS("1", "https://");
        
        private String value;
        
        private String header;
        
        private HttpProtocolType(String value, String header) {
            this.value = value;
            this.header = header;
        }
        
        public String getValue() {
            return value;
        }
        
        public String getHeader() {
            return header;
        }
    }
    
    /**
     * ve通过NSS消息返回给SDK的首帧文件,预处理文件,转码文件,截断文件,预处理合并文件的SafeVideo存储路径
     * 格式如 {"safeVideoFile":[{"fno":0,"bno":0,"offset":17711292,"len":177503972}]}
     */
    String VE_CALLBACK_SAFEVIDEO_PATH = "{\"safeVideoFile\"";
    
    /**
     * json或xml节点safeVideoFile
     */
    String NODE_SAFEVIDEOFILE = "safeVideoFile";
    
    /**
     * json或xml节点safeVideoPic
     */
    String NODE_SAFEVIDEOPIC = "safeVideoPic";
    
    /**
     * 域类型：上级域
     */
    int UP_DOMAIN_TYPE = 0;
    
    /**
     * 域类型：本级域
     */
    int CURRENT_DOMAIN_TYPE = 1;
    
    /**
     * 域类型：下级域
     */
    int DOWN_DOMAIN_TYPE = 2;
    
    /**
     * 下载类型：特征值
     */
    int DOWNLOAD_TYPE_FEATURE = 1;
    
    /**
     * 下载类型：图片
     */
    int DOWNLOAD_TYPE_PICTURE = 2;
    
    /**
     * 对比类型：图片
     */
    int DOWNLOAD_COMPARE_TYPE_PICTURE = 3;
    
    /**
     * 对比类型：特征值
     */
    int DOWNLOAD_COMPARE_TYPE_FEATURE = 4;
    
    /**
     * 对比类型：id
     */
    int DOWNLOAD_COMPARE_TYPE_ID = 5;
    
    /**
     * 下载黑名单的监控任务类型：车
     */
    int DOWNLOAD_SUSPECT_TYPE_PLATE = 1;
    
    /**
     * 下载黑名单的监控任务类型：人
     */
    int DOWNLOAD_SUSPECT_TYPE_PEOPLE = 2;
    
    /**
     * 下载黑名单的监控任务类型：人
     */
    int DOWNLOAD_SUSPECT_TYPE_PEOPLE_WHAITE = 3;
    
    /**
     * 下载黑名单的监控任务类型：人
     */
    int DOWNLOAD_SUSPECT_TYPE_PEOPLE_TABEL = 4;
    
    /**
     * MP黑名单下载状态：初始化
     */
    int MP_DOWNLOAD_STAT_INIT = 0;
    
    /**
     * MP黑名单下载状态：下载中
     */
    int MP_DOWNLOAD_STAT_DOWNLOADING = 1;
    
    /**
     * MP黑名单下载状态：下载完成，处理中
     */
    int MP_DOWNLOAD_STAT_PROCESSING = 2;
    
    /**
     * MP黑名单下载状态：完成，但有异常
     */
    int MP_DOWNLOAD_STAT_COMPLETE = 3;
    
    /**
     * MP黑名单下载状态：成功
     */
    int MP_DOWNLOAD_STAT_SUCCEED = 4;
    
    /**
     * MP黑名单下载状态：成功
     */
    int MP_DOWNLOAD_STAT_TIMEOUT = 5;
    
    /**
     * MP黑名单下载状态：失败
     */
    int MP_DOWNLOAD_STAT_FAIL = -1;
    
    /**
     * solr操作失败
     */
    int SOLR_OPERA_FAIL = -1;
    
    /**
     * 黑名单域间同步无图标志,并且是图片布控模式
     */
    String DOWNLOAD_BLACK_WHITE_LIST_NO_IMAGE_IMAGE_DOWNLOAD = "0";
    
    /**
     * 黑名单域间同步无图标志,并且是特征值布控模式
     */
    String DOWNLOAD_BLACK_WHITE_LIST_NO_IMAGE_FEATURE_DOWNLOAD = "2";
    
    /**
     * 布控管理权限
     */
    int SUSPECT_RIGHT = 101101;
    
    /**
     * 域间通信权限
     */
    int DOMAIN_RIGHT = 101701;
    
    /**
     * 检索权限
     */
    int SEARCH_RIGHT = 100701;
    
    /**
     * 算法支持分析的内容的Xpath路径
     */
    String ANALYZE_CONTENT_XPATH = "/plugin-capability/support_analyze_content";
    
    /**
     * 算法插件支持的分析模式的Xpath路径
     */
    String ANALYZE_MODE_XPATH = "/plugin-capability/support_analyze_mode";
    
    /**
     * 算法插件支持的场景的Xpath路径
     */
    String ANALYZE_SENSE_XPATH = "/plugin-capability/support_scense_mode";
    
    /**
     * 算法插件可输出的图片类型的Xpath路径
     */
    String IMAGE_EXPORT = "/plugin-capability/suportImageExport";
    
    /**
     * 查询所有域信息
     */
    String MODE_ALL = "1";
    
    /**
     * 只查询直连域
     */
    String MODE_DIRECT = "2";
    
    /**
     * 只查本域信息
     */
    String MODE_LOCAL = "3";
    
    /**
     * 返回组织信息
     */
    String NEED_GROUP = "0";
    
    /**
     * 不返回组织信息
     */
    String NON_GROUP = "1";
    
    /**
     * Cluster prop中domaincode的key
     */
    String CLUSTER_PORP_DOMAINCODE = "domainCode";
    
    /**
     * 摄像机topic
     */
    String CAMERAS_TOPIC = "CamerasChange";
    
    /**
     * kafka摄像机数据监听Id
     */
    String CAMERAS_LISTENER_ID = "CamerasDataListener";
    
    /**
     * 多域名单同步日志调用链的id
     */
    String DOMAIN_SYN_TRACE_CHAIN = "domain-syn-trace-chain";
    
    /**
     * 一天分钟数
     */
    int ONE_DAY_MINUTE = 1440;
    
    /**
     * 默认相似度阈值
     */
    String DEFAULT_SIMILARITY_THRESHOLD = "85";
    
    /**
     * double保留两位小数点
     */
    DecimalFormat DECIMAL_FORMAT = new DecimalFormat("0.00");
}
