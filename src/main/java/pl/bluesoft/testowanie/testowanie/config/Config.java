package pl.bluesoft.testowanie.testowanie.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import pl.bluesoft.testowanie.testowanie.aspekt.Aspekt;
import pl.bluesoft.testowanie.testowanie.controller.Controller;
import pl.bluesoft.testowanie.testowanie.obiektTestowy.ObiektTestowy;

@Configuration
public class Config {

	@Bean
	public ObiektTestowy obiektTestowy() {
		System.out.println("tworze obiekt testowy");
		return new ObiektTestowy();
	}

	@Bean
	public Aspekt myAspect() {
		System.out.println("aaccc");
		return new Aspekt();
	}

	@Bean
	public Controller controller() {
		System.out.println("controller config");
		return new Controller();
	}
}
