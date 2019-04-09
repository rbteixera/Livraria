package br.com.estoque.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import br.com.estoque.daos.UsuarioDAO;



@EnableWebSecurity

public class SecurityConficuration extends WebSecurityConfigurerAdapter {

	
	@Autowired
    private UsuarioDAO usuarioDao;
	
	@Override
	protected void configure(HttpSecurity http)  throws Exception {
		http.authorizeRequests()
        .antMatchers("/estoque/").hasRole("ADMIN")
        //.antMatchers("/").hasRole("ADMIN")
        .antMatchers("/resources/**").permitAll()
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
