package main.java.com.ioc.spring.annoation;

import java.lang.annotation.*;

/**
 * @author xdc
 * created by 2019/9/9
 * @describe 自定义属性的依赖注入
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface IocResource {
}
