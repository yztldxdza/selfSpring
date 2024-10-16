package my.self.spring.beanFactory;

import my.self.spring.beanDefinition.AnnotateBeanDefinition;
import my.self.spring.beanDefinition.BeanDefinitionRegistry;
import my.self.spring.beanFactory.impl.DefaultListableBeanFactory;

public class GenericApplicationContext implements BeanDefinitionRegistry {

    private DefaultListableBeanFactory factory;

    public GenericApplicationContext() {
        this.factory = new DefaultListableBeanFactory();
    }

    @Override
    public void registerBeanDefinition(String beanName, AnnotateBeanDefinition beanDefinition) {
        this.factory.registerBeanDefinition(beanName, beanDefinition);
    }
}
