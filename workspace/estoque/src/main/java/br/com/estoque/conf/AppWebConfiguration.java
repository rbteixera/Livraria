package br.com.estoque.conf;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.format.datetime.DateFormatterRegistrar;
import org.springframework.format.support.DefaultFormattingConversionService;
import org.springframework.format.support.FormattingConversionService;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import br.com.estoque.controllers.EntradaController;
import br.com.estoque.controllers.HomeController;
import br.com.estoque.controllers.LogoutController;
import br.com.estoque.daos.ProdutoDao;

@EnableWebMvc

@ComponentScan(basePackageClasses={HomeController.class, ProdutoDao.class, LogoutController.class, EntradaController.class})

//@ComponentScan(basePackages="br.com.estoque.controllers, br.com.estoque.conf")
public class AppWebConfiguration extends WebMvcConfigurerAdapter{
	
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver () {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		
		//esta configuração tornará todos os Beans da aplicação disponíveis a todos os jsp's, o que parece não ser uma boa ideia.
		resolver.setExposeContextBeansAsAttributes(true); 
		
		//Somente o bean carrinhoCompras será visível nas jsp's
		//resolver.setExposedContextBeanNames("ListaDeProdutos"); 
		return resolver;
	}
	
	@Bean  //Trata dos caracteres encoding  UTF-8 para o arquivo de messages
	public MessageSource messageSource() {
		
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		messageSource.setBasename("/WEB-INF/messages");
		messageSource.setDefaultEncoding("UTF-8");
		messageSource.setCacheSeconds(1);
		return messageSource;
	}
	
	@Bean
	public FormattingConversionService mvcConversionService() {
		
		DefaultFormattingConversionService conversionService = new DefaultFormattingConversionService();
		DateFormatterRegistrar registrar = new DateFormatterRegistrar();
		registrar.setFormatter(new DateFormatter("dd/MM/yyyy"));
		registrar.registerFormatters(conversionService);
		return conversionService;
	}
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
	  registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}

}
