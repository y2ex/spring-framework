package cc.y2ex.aop;

import cc.y2ex.aop.config.MainConfig;
import cc.y2ex.aop.learn.Calculate;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Yanci丶
 * @date 2021-07-01
 */
public class Y2exAopMainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);

		Calculate calculate = (Calculate) ctx.getBean("calculate");

		//int retVal = calculate.mod(2,4);
		calculate.div(6,2);
	}
}
