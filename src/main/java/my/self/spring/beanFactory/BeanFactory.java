package my.self.spring.beanFactory;

public interface BeanFactory {

    /**
     * 通过name获取bean
     * @param beanName bean名称
     * @return bean实例
     */
    public Object getBean(String beanName);
}
