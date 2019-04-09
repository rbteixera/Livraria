package br.com.estoque.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	private int conta=0;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	 public String loginForm() {
		System.out.println("Vou entrar na tela de login = "+conta++);
		 return "loginForm";
	 }
}
