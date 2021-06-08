package cc.y2ex.ioc.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author Yanci丶
 * @date 2021-06-08
 */
@Component
public class Y2exInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {

	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println("ZeroInstantiationAwareBeanPostProcessor------实例化前操作， beanName:"+beanName);
//		if ("user".equals(beanName)){
//			System.out.println("Y2exInstantiationAwareBeanPostProcessor 处理中------");
//			return new CustomMode2();
//		}
		return null;
	}
}
