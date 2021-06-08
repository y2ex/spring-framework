package cc.y2ex.ioc.beans;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @author Yanci丶
 * @date 2021-06-08
 */
//@Component
public class Zero implements InitializingBean {
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Zero 初始化");
	}
}
