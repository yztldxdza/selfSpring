package my.self.spring.beanDefinition;

import my.self.spring.annotation.Scope;

public class AnnotateBeanDefinitionReader {

    private BeanDefinitionRegistry registry;

    // 注册我们的 路径扫描 这个Bean 到 Bean工厂
    public void register(Class<?> componentClass) {
        registerBean(componentClass);
    }

    private void registerBean(Class<?> componentClass) {
        doRegisterBean(componentClass);
    }

    // 实际执行操作的方法都是do开头的
    private void doRegisterBean(Class<?> componentClass) {
        // 把AppConfig 读成一个 BeanDefinition
        AnnotateGenericBeanDefinition beanDefinition = new AnnotateGenericBeanDefinition();

        // 设置类
        beanDefinition.setClazz(componentClass);

        // 设置单例
        if (componentClass.isAnnotationPresent(Scope.class)){
            String scope = componentClass.getAnnotation(Scope.class).value();
            beanDefinition.setScope(scope);
        }else {
            beanDefinition.setScope("singleton");
        }

        // beanDefinition 创建完成后，给beanFactory 进行bean注册

        BeanDefinitionReaderUtils.registerBeanDefinition(beanDefinition,this.registry);
    }

}
