package pl.bluesoft.testowanie.testowanie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.bluesoft.testowanie.testowanie.obiektTestowy.ObiektTestowy;

@RestController
@RequestMapping(value = "/test")
public class Controller {

	@Autowired
	ObiektTestowy test;

	public Controller() {
		System.out.println("DUPA KONTROLER!");
	}

	@RequestMapping(value = "/a")
	public String testController() throws Exception {

		System.out.println("Wchodze do metody w tescie kontrolera!");
		test.obiektTestowyPrint();
		return "aaa";
	}

}
