package com.example.project.config;

import com.baomidou.mybatisplus.entity.GlobalConfiguration;
import com.baomidou.mybatisplus.mapper.LogicSqlInjector;
import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.plugins.PerformanceInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


/**
 * MybatisPlusConfig配置文件
 *
 * @author liushiqiang
 * @date 2018/07/24 11:27
 */
@Configuration
@MapperScan(basePackages="com.example.project.mapper")
public class MybatisPlusConfig {

    /**
     * mybatis-plus分页插件<br>
     * 文档：http://mp.baomidou.com<br>
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        // 开启 PageHelper 的支持
        paginationInterceptor.setLocalPage(true);

        return paginationInterceptor;
    }

    /**
     * 配置逻辑删除 需要在entity里面指定字段添加@TableLogic注解
     * @return
     */
    /*@Bean
    public GlobalConfiguration globalConfiguration() {
        GlobalConfiguration conf = new GlobalConfiguration(new LogicSqlInjector());
        conf.setLogicDeleteValue("9");
        conf.setLogicNotDeleteValue("1");
        return conf;
    }*/

    /**
     * SQL执行效率插件
     */
    @Bean
    @Profile({"dev","test","local"})// 设置 dev test local 环境开启
    public PerformanceInterceptor performanceInterceptor() {
        PerformanceInterceptor interceptor = new PerformanceInterceptor();
        interceptor.setFormat(true);
        return interceptor;
    }

}
