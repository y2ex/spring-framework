package cc.y2ex.ioc.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author Yanci丶
 * @date 2021-06-07
 */
//@Scope("prototype")
@Component
//@DependsOn("member")
public class User implements InitializingBean {

	private String username;

	@Value("123456")
	private String password;

	@Override
	public String toString() {
		return "User{" +
				"username='" + username + '\'' +
				", password='" + password + '\'' +
				'}';
	}

	public void init(){
		System.out.println("user init 初始化");
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("user afterPropertiesSet 初始化");
	}

	@PostConstruct
	public void initMethodPostConstruct(){
		System.out.println("user initMethodPostConstruct 初始化");
	}

}
