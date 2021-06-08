package cc.y2ex.ioc.beans;

import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Yanci丶
 * @date 2021-06-08
 */
//@Scope("prototype")
@Component
@DependsOn("user")
public class Member {

	private String memberName;
}
