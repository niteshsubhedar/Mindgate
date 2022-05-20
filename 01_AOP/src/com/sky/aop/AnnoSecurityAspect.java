package com.sky.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.sky.aop.service.Auditable;

@Aspect
@Component
public class AnnoSecurityAspect {

	@Before("execution(* com.sky.aop.ApplicationService.*(..))")
	public void VerifyApplicationForm() {
		System.out.println("In a Anno before Call");
	}

	@After("execution(* com.sky.aop.ApplicationService.*(..))")
	public void processcall() {
		System.out.println("processResults");
	}

	@Before("@annotation(auditable)")
	public void doAccessCheck4(Auditable auditable) {
		System.out.println("Do Access Check 4 " + auditable.value());
	}
}
