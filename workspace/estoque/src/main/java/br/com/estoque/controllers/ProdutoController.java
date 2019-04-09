package br.com.estoque.controllers;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.estoque.daos.ProdutoDao;
import br.com.estoque.models.Produto;
import br.estoque.validadores.ValidadorProduto;


@Controller
@Transactional
public class ProdutoController {

	@Autowired
	private ProdutoDao produtoDao;
	
	@InitBinder
	public void InitBinder(WebDataBinder binder){
	    binder.addValidators(new ValidadorProduto());
	}
	
	//@RequestMapping("produtos/form")
	@RequestMapping("/Cad")
	public ModelAndView Cadastro(Produto protudo) {
		System.out.println("Entrando na form da ProdutoController");
		ModelAndView modelAndView = new ModelAndView("produtos/cadastramento");
		
		
		return modelAndView;
	}
	
	@RequestMapping("/produtos")
	public ModelAndView gravar(@Valid Produto produto, BindingResult result, RedirectAttributes redirectAttributes) {
	
		if(result.hasErrors()) {

			return Cadastro(produto);
		}
		
		produtoDao.save(produto);
		System.out.println("Cadastrando produto");
		
		ModelAndView modelAndView = new ModelAndView("redirect:Cad");
		/*Flash Scope - É um escopo rápido, onde os objetos adicionados duram apenas o tempo de 1 request para outro.*/
		redirectAttributes.addFlashAttribute("sucesso", "Produto Cadastrado com sucesso!");
		return modelAndView;
	}
}
