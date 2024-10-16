package my.self.spring.applicationContext;

import my.self.spring.beanDefinition.AnnotateBeanDefinitionReader;

public class AnnotationConfigApplicationContext
// extends AbstractApplicationContext
// implements ApplicationContext
{

    private AnnotateBeanDefinitionReader reader;

    // 如果有人调用这个无参构造，必须先调用父类的无参构造
    public AnnotationConfigApplicationContext() {
        this.reader = new AnnotateBeanDefinitionReader();
    }

    public AnnotationConfigApplicationContext(Class<?> componentClass) {
        // 1、读取 componentClass 也就是 扫描路径 所在的类 AppConfig
        //    定义一个阅读器专门读取 AnnotateBeanDefinitionReader

        this();

        // 2、先把这个类 AppConfig 注册到 BeanFactory 中（BeanDefinition + registerBeanDefinition + FactoryBean）

        register(componentClass);

        // 3、扫描这个路径，然后提取出这个路径下所有的Bean，然后注册到 BeanFactory 中（单例Bean的初始化）
    }

    // 注册Bean
    private void register(Class<?> componentClass) {
        this.reader.register(componentClass);
    }
}
