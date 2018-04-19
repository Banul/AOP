package pl.bluesoft.testowanie.testowanie.aspekt;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@EnableAspectJAutoProxy

public @interface LogSth {
 
}