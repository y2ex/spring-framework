package cc.y2ex.ioc.config;

import cc.y2ex.ioc.MainConfig;
import cc.y2ex.ioc.beans.Member;
import cc.y2ex.ioc.beans.Order;
import cc.y2ex.ioc.beans.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Yanci丶
 * @date 2021-06-08
 */
public class BeanPostProcessorMainConfig {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
		Object bean = applicationContext.getBean("user");
		System.out.println(bean);
		User user = (User) applicationContext.getBean("user");
		System.out.println(user.toString());

		Order order = (Order) applicationContext.getBean("order");
		System.out.println(order);
		order.getMemberInfo();
	}
}
