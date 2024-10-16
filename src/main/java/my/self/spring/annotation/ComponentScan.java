package my.self.spring.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 这是一个Java注解，名为ComponentScan，用于标记需要扫描的组件类型。它有以下两个特性：
 *
 * @ Retention(RetentionPolicy.RUNTIME)：表示这个注解在运行时仍然可见，可以被反射机制读取到。这意味着在程序运行过程中，可以通过Java的反射API来获取到这个注解的信息。
 *
 * @ Target(ElementType.TYPE)：表示这个注解可以应用在类（Type）级别上。也就是说，你可以在类定义的上方使用@ComponentScan注解。
 *
 * 注解的主体public @interface ComponentScan定义了一个名为ComponentScan的注解，它有一个方法value()，返回类型为字符串。
 * 这个方法默认值为空字符串，但可以被开发者自定义。通常情况下，开发者会在这个值中指定需要扫描的包名或者类名，以便于Spring框架自动发现和管理组件。
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ComponentScan {
    String value() default "";
}
