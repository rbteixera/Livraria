package br.com.casadocodigo.loja.controllers;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.bind.annotation.*;

import br.com.casadocodigo.loja.daos.ProdutoDAO;
import br.com.casadocodigo.loja.infra.FileSaver;
import br.com.casadocodigo.loja.models.CarrinhoCompras;
import br.com.casadocodigo.loja.models.Produto;
import br.com.casadocodigo.loja.models.TipoPreco;
import br.com.casadocodigo.loja.validation.ProdutoValidation;

@Controller
@RequestMapping("/produtos") //Todos os métodos da classe terão em url's /produtos. Para não ficar repetindo em toda url dos métodos
public class ProdutosController {

	@Autowired
	private ProdutoDAO produtoDao;
	
	@Autowired
	private FileSaver fileSaver;
	
	
	@InitBinder
	public void InitBinder(WebDataBinder binder){
	    binder.addValidators(new ProdutoValidation());
	}
	
	//@RequestMapping("produtos/form")
	@RequestMapping("/form")
	public ModelAndView form(Produto protudo) {
		System.out.println("Entrando na form da ProdutoController");
		ModelAndView modelAndView = new ModelAndView("produtos/form");
		modelAndView.addObject("tipos",TipoPreco.values());
		
		return modelAndView;
	}
	
	@RequestMapping("/form2")
	public ModelAndView form2(Produto protudo) {
		System.out.println("Entrando na form2 da ProdutoController");
		ModelAndView modelAndView = new ModelAndView("produtos/form");
		modelAndView.addObject("tipos",TipoPreco.values());
		modelAndView.addObject("erroIsbn","ISBN já cadastrado na base.");
		return modelAndView;
	}
	//@RequestMapping(value="/produtos", method=RequestMethod.POST)
	@RequestMapping(method=RequestMethod.POST)
	@CacheEvict(value="listaDeProdutos", allEntries=true) //Limpa o cache listaDeProdutos sempre que incluir mais um livro no banco de dados
	public ModelAndView gravar(MultipartFile sumario, @Valid Produto produto, BindingResult result, RedirectAttributes redirectAttributes) {
		System.out.println("Entrando no gravar da ProdutoController");
		
		if(result.hasErrors()) {
			return form(produto);
		}
		
		System.out.println("*1*");
	   
	    if(!produtoDao.VerifIsbn(produto).isEmpty()) {
	    	return form2(produto);	
	    }
	    
		String path = fileSaver.write("arquivos-sumario", sumario);
		produto.setSumarioPath(path);
		 
		produtoDao.gravar(produto);
		
		
		/*Por que devemos sempre fazer um redirect após o formulário enviar um POST para nossos sistemas?*/
		/*Pois ao pressionar F5, os dados são reenviados podendo duplicar informações no banco de dados.*/
		/* return listar(); chamando diretamente o listar() teremos o problema do F5. Sempre que recarregar o navegador, como ele vem do post anterior ele guarda a última requisição do usuário e resubmete repedindo a operação */
		/* Provocando neste caso a regravação do mesmo livro. Não é isto que queremos*/
		/* e por esta razão temos que mandar o navegador redirecionar para nosso listar()*/
		/* new ModelAndView("redirect:produtos"); - Assim o comando redirect manda o navegador fazer um get para produtos, assim chamando por get nosso listar(). Resolvendo este problema de reenviu do navegador*/
		ModelAndView modelAndView = new ModelAndView("redirect:form");
		//modelAndView.addObject("sucesso", "Produto Cadastrado com sucesso!");
		
		/*Flash Scope - É um escopo rápido, onde os objetos adicionados duram apenas o tempo de 1 request para outro.*/
		redirectAttributes.addFlashAttribute("sucesso", "Produto Cadastrado com sucesso!");
		return modelAndView;
	}
	
	//@RequestMapping(value="/produtos", method=RequestMethod.GET)
	//@RequestMapping(method=RequestMethod.GET)
	@RequestMapping("/listar")
	@Cacheable(value="listaDeProdutos") //Cacherisando a lsita de produtos. Assim não ficaremos indo toda vez ao banco de dados
	public ModelAndView listar() {
		System.out.println("Entrando no listar da ProdutoController");
		List<Produto>produtos = produtoDao.listar();
		ModelAndView modelAndView = new ModelAndView("produtos/lista");
		modelAndView.addObject("produtos", produtos);
		return modelAndView;
	}
	
	@RequestMapping("/listaPorIsbn")
	
	public ModelAndView listaPorIsbn(String isbn1) {
		System.out.println("Entrando no listaPorIsbn "+isbn1);
		Produto produtos = produtoDao.BuscaPorIsbn(isbn1);
		ModelAndView modelAndView = new ModelAndView("produtos/lista");
		modelAndView.addObject("produtos", produtos);
		return modelAndView;
	}
	
	@RequestMapping("/detalhe/{id}") /* Para fazer url amigável. No browse a url terá /detalhe/8 Só o id*/
	public ModelAndView detalhe(@PathVariable("id") Integer id) {
		
		ModelAndView modelAndView = new ModelAndView("produtos/detalhe");
		
		Produto produto = new Produto();
		produto = produtoDao.find(id);
		modelAndView.addObject("produto", produto);
		
		return modelAndView;
		
	}
	
	/*@RequestMapping("/{id}")
	@ResponseBody
	public Produto detalheJason(@PathVariable("id") Integer id) {
		System.out.println("detalheJason id "+id);
		return produtoDao.find(id);
		
	}*/ //Este método é utilizado para integração de sistemas
}
