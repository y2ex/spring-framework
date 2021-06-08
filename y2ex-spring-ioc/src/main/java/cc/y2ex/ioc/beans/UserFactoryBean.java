package cc.y2ex.ioc.beans;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Yanci丶
 * @date 2021-06-07
 */
@Scope("prototype")
@Component
public class UserFactoryBean implements FactoryBean<Object> {

	@Override
	public Object getObject() throws Exception {
		return new User();
	}

	@Override
	public Class<?> getObjectType() {
		return User.class;
	}
}
