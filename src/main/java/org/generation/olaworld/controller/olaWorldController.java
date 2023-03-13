package org.generation.olaworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



// Define que a classe é controller e rest.
@RestController
//define a url do servidor
@RequestMapping ("/hello-world")
public class olaWorldController {

	//mapeia solicitações http
	@GetMapping
	public String helloWorld() {
		return "Hello world!";
	}
	
	@GetMapping("/bsm")
	public String bsm(){
		return "BSMs:" +
			   "Atenção aos detalhes" +
		       "Orientação ao futuro" +
		       "Proatividade";
	}
	
	@GetMapping("/objetivos")
	public String objetivos() {
		return "Melhorar a proatividade" +
	           "Aumentar a persistência";
	}

}
