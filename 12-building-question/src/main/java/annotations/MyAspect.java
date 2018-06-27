package annotations;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class MyAspect {

	@Around("execution(* annotations.Builder.getCost())")
	public Object builderAnnotation(ProceedingJoinPoint proceedingJoinPoint){
		System.out.println("Builder: Before invoking getCost()");
		Object value = null;
		try {
			value = proceedingJoinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("BuilderCost: After invoking getName(). Return value: " + value);
		return value;
	}
}
