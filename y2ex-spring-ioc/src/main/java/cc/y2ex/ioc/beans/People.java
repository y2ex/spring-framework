package cc.y2ex.ioc.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Yanci丶
 * @date 2021-06-07
 */
@Scope("prototype")
@Component
public class People {

	private Integer age;

	private String name;
}
