package cc.y2ex.ioc.beans;

import cc.y2ex.ioc.processor.Y2exBeanFactoryPostProcessor;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @author Yanci丶
 * @date 2021-06-10
 */
@Component
public class CusY2exBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

	}
}
