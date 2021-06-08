package cc.y2ex.ioc.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author Yanci丶
 * @date 2021-06-08
 */
@Component
public class Y2exBeanPostProcessor2 implements InstantiationAwareBeanPostProcessor, BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Y2exBeanPostProcessor2------初始化前，beanName："+beanName);
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Y2exBeanPostProcessor2------初始化后，beanName："+beanName);
		return bean;
	}
}
