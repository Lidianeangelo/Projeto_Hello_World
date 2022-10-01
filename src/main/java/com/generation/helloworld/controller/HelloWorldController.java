package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

	@GetMapping
	public String helloWorld() {
		return "Hello World! Bem vinda, Lidiane.";
	}
	
	@RestController
	@RequestMapping("/bsm")
	public class bsm {

		@GetMapping
		public String bsm_lista() {
			return "\n BSM-GM - Mentalidade de Crescimento.\n BSM-FO - Orientação ao Futuro.\n BSM-C - Comunicação.";
		}
	

}
	
	@RestController
	@RequestMapping("/objetivo")
	public class objetivo {

		@GetMapping
		public String objetivo_lista() {
			return "\n Objetivo: Desenvolver habilidades para me tornar uma Desenvolvedora Java ";
		}
	

}
}
