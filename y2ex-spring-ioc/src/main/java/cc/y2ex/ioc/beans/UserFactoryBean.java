package cc.y2ex.ioc.beans;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author Yanci丶
 * @date 2021-06-07
 */
public class UserFactoryBean implements FactoryBean {
	@Override
	public Object getObject() throws Exception {
		return new User();
	}

	@Override
	public Class<?> getObjectType() {
		return User.class;
	}
}
