package br.com.estoque.controllers;


import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.estoque.daos.EntradaDao;
import br.com.estoque.daos.ProdutoDao;
import br.com.estoque.models.Entrada;
import br.com.estoque.models.Produto;




@Controller
@RequestMapping("/entrada")
public class EntradaController {

	@Autowired
	private ProdutoDao produtoDao;
	@Autowired
	private EntradaDao entradaDao;
	
	
	@RequestMapping("/listar")
	//@Cacheable(value="listaDeProdutos") //Cacherisando a lsita de produtos. Assim não ficaremos indo toda vez ao banco de dados
	public ModelAndView listar() {
		System.out.println("Entrando no listar da EntradaController");
		
		Entrada entrada = new Entrada();
		
		List<Produto>produtos = produtoDao.listar();
		ModelAndView modelAndView = new ModelAndView("produtos/entrada");
		modelAndView.addObject("produtos",produtos);
		modelAndView.addObject("entrada", entrada);
		
		return modelAndView;
	}
	
	@RequestMapping("/gravar")
	public ModelAndView gravar(Entrada entrada, String vlEntrada) {
		
		
		vlEntrada = vlEntrada.replaceFirst(",", "");
		vlEntrada = vlEntrada.replace(".", "");
		Double vlUnitario = new Double(vlEntrada.replaceFirst(",", "."));
		entrada.setVlUnitario(vlUnitario);
		
		entrada.setIdProduto(entradaDao.find(entrada.getCodigoEnt()).getId());
		
		entradaDao.save(entrada);
		
		return listar();
	}
	
	@RequestMapping("/entrada")
	public ModelAndView entradaProd() {
	  
		
		//EntradaView entrada = new EntradaView();
        ModelAndView modelAndView = new ModelAndView("produto/entrada");
       // modelAndView.addObject("entrada", entrada);
        return modelAndView;
	}
}
