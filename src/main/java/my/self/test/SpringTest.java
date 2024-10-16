package my.self.test;

import my.self.spring.applicationContext.AnnotationConfigApplicationContext;
import my.self.test.config.AppConfig;

public class SpringTest {
    public static void main(String[] args) {
        // 创建 applicationContext（注解的形式）
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        // 获取 bean
        // applicationContext.getBean("");
    }
}
