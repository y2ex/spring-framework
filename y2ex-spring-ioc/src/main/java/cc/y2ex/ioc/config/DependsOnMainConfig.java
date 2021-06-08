package cc.y2ex.ioc.config;

import cc.y2ex.ioc.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Yanci丶
 * @date 2021-06-08
 */
@ComponentScan("cc.y2ex")
public class DependsOnMainConfig {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);

		System.out.println("-------------------");
		Object userFactoryBean = applicationContext.getBean("user");
		System.out.println(userFactoryBean);
		System.out.println(applicationContext.getBean("user"));
		System.out.println(applicationContext.getBean("order"));

		System.out.println(applicationContext.getBean("order"));
		System.out.println(applicationContext.getBean("member"));
		System.out.println(applicationContext.getBean("member"));
	}
}
