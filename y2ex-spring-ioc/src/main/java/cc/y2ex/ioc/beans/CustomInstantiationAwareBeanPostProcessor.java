package cc.y2ex.ioc.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

/**
 * @author Yanci丶
 * @date 2021-06-08
 */
@Component
public class CustomInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor, PriorityOrdered {

	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println("CustomInstantiationAwareBeanPostProcessor------实例化前操作， beanName:"+beanName);
//		if ("user".equals(beanName)){
//			System.out.println("CustomBeanPostProcessor 处理中------");
//			return new CustomMode1();
//		}
		return null;
	}

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		System.out.println("CustomInstantiationAwareBeanPostProcessor------实例化后操作， beanName:"+beanName);
		if (beanName.equals("user")){
			return false;
		}
		return true;
	}

	@Override
	public int getOrder() {
		return 6;
	}
}
