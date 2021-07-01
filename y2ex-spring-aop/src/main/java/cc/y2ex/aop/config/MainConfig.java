package cc.y2ex.aop.config;

import cc.y2ex.aop.aspect.Y2exLogAspect;
import cc.y2ex.aop.learn.Calculate;
import cc.y2ex.aop.learn.Y2exCalculate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Yanci丶
 * @date 2021-07-01
 */
@Configuration
@EnableAspectJAutoProxy(exposeProxy = true)
public class MainConfig {

	@Bean
	public Calculate calculate() {
		return new Y2exCalculate();
	}

	@Bean
	public Y2exLogAspect y2exLogAspect() {
		return new Y2exLogAspect();
	}
}
