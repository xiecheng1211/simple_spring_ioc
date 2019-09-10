package main.java.com.ioc.spring.annoation;

import java.lang.annotation.*;

/**
 * @author xdc
 * created by 2019/9/9
 * @describe 自定义服务的依赖注入
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface IocService {
    String name() default "";
}
