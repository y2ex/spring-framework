package cc.y2ex.ioc.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author Yanci丶
 * @date 2021-06-08
 */
@Component
public class CustomInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {

	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println("CustomInstantiationAwareBeanPostProcessor------实例化前操作， beanName:"+beanName);
//		if ("user".equals(beanName)){
//			System.out.println("CustomBeanPostProcessor 处理中------");
//			return new CustomMode1();
//		}
		return null;
	}
}
