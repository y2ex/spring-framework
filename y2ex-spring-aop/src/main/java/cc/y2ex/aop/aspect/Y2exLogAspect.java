package cc.y2ex.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;

import java.util.Arrays;

/**
 * @author Yanci丶
 * @date 2021-07-01
 */
@Order
@Aspect
public class Y2exLogAspect {
	@Pointcut("execution(* cc.y2ex.aop.learn.Y2exCalculate.*(..))")
	public void pointCut(){};

	@Before(value = "pointCut()")
	public void methodBefore(JoinPoint joinPoint) throws Throwable {
		String methodName = joinPoint.getSignature().getName();
		System.out.println("target method ["+methodName+"] <before notice>,param"+ Arrays.asList(joinPoint.getArgs()));
	}

	@After(value = "pointCut()")
	public void methodAfter(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		System.out.println("target method ["+methodName+"] <after notice>,param"+Arrays.asList(joinPoint.getArgs()));
	}

	@AfterReturning(value = "pointCut()",returning = "result")
	public void methodReturning(JoinPoint joinPoint, Object result) {
		String methodName = joinPoint.getSignature().getName();
		System.out.println("target method ["+methodName+"] <result notice>,param"+Arrays.asList(joinPoint.getArgs()));
	}

	@AfterThrowing(value = "pointCut()")
	public void methodAfterThrowing(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		System.out.println("target method["+methodName+"] <e notice>,param"+Arrays.asList(joinPoint.getArgs()));
	}
}
