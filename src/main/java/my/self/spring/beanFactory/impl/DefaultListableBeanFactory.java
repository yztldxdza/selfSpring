package my.self.spring.beanFactory.impl;

import my.self.spring.beanDefinition.AnnotateBeanDefinition;
import my.self.spring.beanDefinition.BeanDefinitionRegistry;
import my.self.spring.beanFactory.BeanFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DefaultListableBeanFactory implements BeanDefinitionRegistry, BeanFactory {

    /**
     * 存放BeanDefinition的容器
     */
    private final Map<String, AnnotateBeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>(256);

    /**
     * 注册BeanDefinition
     * @param beanName bean名称
     * @param beanDefinition bean定义
     */
    @Override
    public void registerBeanDefinition(String beanName, AnnotateBeanDefinition beanDefinition) {
        this.beanDefinitionMap.put(beanName, beanDefinition);
    }

    /**
     * 获取Bean
     * @param beanName bean名称
     * @return Bean
     */
    @Override
    public Object getBean(String beanName) {
        return null;
    }
}
