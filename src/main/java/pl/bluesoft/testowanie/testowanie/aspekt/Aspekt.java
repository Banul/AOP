package pl.bluesoft.testowanie.testowanie.aspekt;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
@EnableAspectJAutoProxy

public class Aspekt {

	public Aspekt() {
		System.out.println("konstruktor aspektu!");
	}
	
	//@Around("execution(* pl.bluesoft.testowanie.testowanie.obiektTestowy.ObiektTestowy.obiektTestowyPrint())")
	@Around("@annotation(LogSth)")
	public void print() throws Exception {
		System.out.print("aspekt wykonuje sie!!!");
//		Exception e = new Exception();
//		throw e;
	}
}
