package com.example.config;


import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @email: 1418084893@qq.com
 * @author: wisejay
 */
@Configuration
public class ShiroConfig{

    //配置Shiro的Web过滤器，拦截浏览器请求并交给SecurityManager处理
    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean(@Qualifier("securityManager") DefaultWebSecurityManager securityManager){
        ShiroFilterFactoryBean bean = new ShiroFilterFactoryBean();
        //设置securityManager
        bean.setSecurityManager(securityManager);
        //配置拦截链 使用LinkedHashMap,因为LinkedHashMap是有序的，shiro会根据添加的顺序进行拦截
        Map<String, String> map = new LinkedHashMap<>();
        bean.setLoginUrl("/");
        map.put("/","anon");
        map.put("/static/**","anon");
        map.put("/login","anon");
        map.put("/**","authc");
        bean.setFilterChainDefinitionMap(map);
        return bean;
    }

    //配置Shiro核心 安全管理器 SecurityManager
    @Bean
    public DefaultWebSecurityManager securityManager(@Qualifier("myRealm")MyRealm myRealm){
        DefaultWebSecurityManager manager = new DefaultWebSecurityManager();
        //将自定义的realm交给SecurityManager管理
        manager.setRealm(myRealm);
        return manager;
    }

    //创建Realm对象
    @Bean
    public MyRealm myRealm(){
        return new MyRealm();
    }
}