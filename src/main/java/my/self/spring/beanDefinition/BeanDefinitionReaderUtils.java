package my.self.spring.beanDefinition;

public class BeanDefinitionReaderUtils {

    /**
     * 注册beanDefinition 到BeanFactory
     * 面向接口编程，入参为抽象类型
     * @param beanDefinition bean定义
     * @param registry 注册器
     */
    public static void registerBeanDefinition(AnnotateBeanDefinition beanDefinition,
                                              BeanDefinitionRegistry registry) {
        // 具体使用时转为子类型
        String beanName = ((AnnotateGenericBeanDefinition)beanDefinition).getClazz().getSimpleName();
        registry.registerBeanDefinition(beanName,beanDefinition);
    }
}
