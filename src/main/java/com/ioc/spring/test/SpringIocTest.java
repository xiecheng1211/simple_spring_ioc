package main.java.com.ioc.spring.test;

import main.java.com.ioc.spring.context.SpringContext;
import main.java.com.ioc.spring.service.UserService;

/**
 * @author xdc
 * created by 2019/9/9
 */
public class SpringIocTest {

    public static void main(String[] args)throws Exception {
        String path = "main.java.com.ioc.spring.service.impl";
        SpringContext context = new SpringContext(path);
        UserService userService = (UserService) context.getBean("userbiz");
        System.out.println(userService.findOrder("lyl"));
    }
}
