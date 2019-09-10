package main.java.com.ioc.spring.service.impl;

import main.java.com.ioc.spring.annoation.IocResource;
import main.java.com.ioc.spring.annoation.IocService;
import main.java.com.ioc.spring.service.OrderService;
import main.java.com.ioc.spring.service.UserService;

/**
 * @author xdc
 * created by 2019/9/9
 */
@IocService(name = "userbiz")
public class UserServiceImpl implements UserService {

    @IocResource
    private OrderService orderServiceImpl;

    @Override
    public String findOrder(String username) {
        return orderServiceImpl.findOrder(username);
    }

}
