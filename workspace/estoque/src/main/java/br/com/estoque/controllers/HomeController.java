package br.com.estoque.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.estoque.models.Produto;




@Controller
public class HomeController {
	
	@RequestMapping("/")
	public ModelAndView index() {
	  
		Produto produto = new Produto();
        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("produto", produto);
        return modelAndView;
	}

}
