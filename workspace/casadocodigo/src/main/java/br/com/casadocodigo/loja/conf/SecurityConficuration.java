package br.com.casadocodigo.loja.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.util.AntPathMatcher;

import br.com.casadocodigo.loja.daos.UsuarioDAO;
import br.com.casadocodigo.loja.models.Usuario;

@SuppressWarnings("deprecation")
@EnableWebMvcSecurity

public class SecurityConficuration extends WebSecurityConfigurerAdapter {

	@Autowired
	private UsuarioDAO usuarioDao;
	
	@Override
	protected void configure(HttpSecurity http)  throws Exception {
		
	/*	 Perceba que montamos uma série de padrões de caminhos definindo onde será permitido o acesso com autenticação ou não. 
		Estamos bloqueando o acesso a /produtos/form para todos que não são ADMIN, assim como requisições do tipo POST para o 
		caminho /produtos/form. Estamos permitindo o acesso ao home da nossa aplicação através do / 
		e também ao carrinho de compras através do /carrinho/**. 
		Por último, estamos sinalizando que estas verificações devem ser feitas para todas as requisições e que as bloqueadas através do hasRole devem ser autenticadas.
		
	*/	
		http.authorizeRequests()
		.antMatchers("/produtos").hasRole("ADMIN")
	    .antMatchers("/produtos/form").hasRole("ADMIN")
	    .antMatchers("/produtos/listar").hasRole("ADMIN")
	    .antMatchers("/carrinho/**").permitAll()
	  //  .antMatchers(HttpMethod.POST, "/produtos").hasRole("ADMIN")
	  //  .antMatchers(HttpMethod.GET, "/produtos").permitAll()
	  //  .antMatchers("/produtos/").permitAll()
        .antMatchers("/produtos/**").permitAll()
        .antMatchers("/resources/**").permitAll()
        .antMatchers("/pagamento/**").permitAll()
        .antMatchers("/").permitAll()
        .anyRequest().authenticated()
        .and().formLogin().loginPage("/login")
            .defaultSuccessUrl("/").permitAll()
        .and().logout()
            .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                .permitAll().logoutSuccessUrl("/login"); 
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth)
			throws Exception {
		
		auth.userDetailsService(usuarioDao)
		.passwordEncoder(new BCryptPasswordEncoder());
	}
	
	
	                                       
}
