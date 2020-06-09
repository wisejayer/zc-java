package com.example.config;

import com.example.entity.LoginEntity;
import com.example.service.LoginService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @email: 1418084893@qq.com
 * @author: wisejay
 */
public class MyRealm extends AuthorizingRealm {
    @Autowired
    LoginService loginService;

    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        /*SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.addRole("学生");//添加角色
        info.addStringPermission("student");//添加权限
        return info;*/
        return null;
    }
    //认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
//        String userid = "1840224141";
//        String password = "admin";

        //获取用户token
        UsernamePasswordToken userToken = (UsernamePasswordToken) authenticationToken;
        //从数据库中查询用户
        LoginEntity loginInfo = loginService.login(userToken.getUsername());

        if (loginInfo == null){      //判断用户是否存在
            return null;
        }
        return new SimpleAuthenticationInfo(loginInfo,loginInfo.getPassword(),"");
    }
}
