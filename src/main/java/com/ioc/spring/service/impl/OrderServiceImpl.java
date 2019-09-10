package main.java.com.ioc.spring.service.impl;

import main.java.com.ioc.spring.annoation.IocService;
import main.java.com.ioc.spring.service.OrderService;

/**
 * @author xdc
 * created by 2019/9/9
 */
@IocService
public class OrderServiceImpl implements OrderService {

    @Override
    public String findOrder(String username) {
        return "用户:" + username + " :订单编号为001";
    }

}
