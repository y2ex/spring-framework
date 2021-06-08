package cc.y2ex.ioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Yanci丶
 * @date 2021-06-07
 */
@Configuration
@ComponentScan("cc.y2ex")
public class MainConfig {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);

		System.out.println("-------------------");
		Object userFactoryBean = applicationContext.getBean("userFactoryBean");
		System.out.println(userFactoryBean);
		System.out.println(applicationContext.getBean("userFactoryBean"));
		System.out.println(applicationContext.getBean("userFactoryBean"));

		System.out.println(applicationContext.getBean("&userFactoryBean"));
		System.out.println(applicationContext.getBean("&userFactoryBean"));
		System.out.println(applicationContext.getBean("&userFactoryBean"));
	}
}
