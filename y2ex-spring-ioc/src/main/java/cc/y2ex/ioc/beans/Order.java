package cc.y2ex.ioc.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Yanci丶
 * @date 2021-06-08
 */
@Component
public class Order {

	@Value("#{member}")
	private Member member;

	private String orderNo;

	public void getMemberInfo(){
		System.out.println(member);
	}
}
