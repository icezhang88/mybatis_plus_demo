package com.example.generator;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.Test;

/**
 * MP代码生成器
 *
 * @author liushiqiang
 * @date 2018/07/24 11:35
 */
public class GeneratorServiceEntity {

    private static final String BASE_PACKAGE = "com.example.project";//项目基础包名称(需要修改)
    private static final String PROJECT_NAME = "market-2c-common";//项目名称(需要修改)
    private static final String PROJECT_PATH = System.getProperty("user.dir")+"/";//项目在硬盘上的基础路径
    private static final String JAVA_PATH = "/src/main/java"; //java文件路径
    private static final String RESOURCES_PATH = "/src/main/resources";//资源文件路径
    private static final String TEST_PATH = "/src/test/java";//test文件路径


    private static final String JDBC_DIVER_CLASS_NAME = "com.mysql.jdbc.Driver";
    private static final Boolean SERVICE_NAME_STARTWHITH_I = false; //user -> UserService, 设置成true: user -> IUserService
    private static final String TABLE_PRE_FIX = "tl_";//表名前缀(需要修改)


    //JDBC配置，请修改为你项目的实际配置
    private static final String JDBC_URL = "jdbc:mysql://127.0.0.1:3306/market_2c_member";
    private static final String JDBC_USERNAME = "root";
    private static final String JDBC_PASSWORD = "l930202";


    private static final String AUTHOR = "liushiqiang";//@author



    @Test
    public void generateCode() {
        generateByTables(SERVICE_NAME_STARTWHITH_I, BASE_PACKAGE, "tl_order", "tl_order_payment");
    }

    private void generateByTables(boolean serviceNameStartWithI, String packageName, String... tableNames) {

        AutoGenerator mpg = new AutoGenerator();

        // 选择 freemarker 引擎，默认 Veloctiy
        // mpg.setTemplateEngine(new FreemarkerTemplateEngine());

        //全局配置
        GlobalConfig config = new GlobalConfig();
        config.setActiveRecord(true)//开启ActiveRecord特性
                .setEnableCache(false)//不使用xml二级缓存
                .setAuthor(AUTHOR)
                .setOutputDir(PROJECT_PATH + TEST_PATH)
                .setFileOverride(true);

        //数据源配置
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL)
                .setUrl(JDBC_URL)
                .setUsername(JDBC_USERNAME)
                .setPassword(JDBC_PASSWORD)
                .setDriverName(JDBC_DIVER_CLASS_NAME);

        //策略配置
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig
                .setCapitalMode(true)
                .setTablePrefix(TABLE_PRE_FIX)
                .setEntityLombokModel(false)
                .setDbColumnUnderline(true)
                .setNaming(NamingStrategy.underline_to_camel)
                .setInclude(tableNames);//修改替换成你需要的表名，多个表名传数组

        // 包配置
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent(packageName);
        //packageConfig.setModuleName("test");
        packageConfig.setController("controller");
        packageConfig.setXml("impl.impl");

        if (!serviceNameStartWithI) {
            config.setServiceName("%sService");
        }

        //写入配置
        mpg.setGlobalConfig(config)
                .setDataSource(dataSourceConfig)
                .setStrategy(strategyConfig)
                .setPackageInfo(packageConfig)
                .execute();
    }

    private void generateByTables(String packageName, String... tableNames) {
        generateByTables(true, packageName, tableNames);
    }
}
