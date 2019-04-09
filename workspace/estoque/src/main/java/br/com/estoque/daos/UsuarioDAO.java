package br.com.estoque.daos;



import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.security.config.http.UserDetailsServiceFactoryBean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import br.com.estoque.models.Usuario;





@Repository
public class UsuarioDAO  implements UserDetailsService {


    
	@PersistenceContext
	private EntityManager manager; 
	
	@Override      
	public Usuario loadUserByUsername(String login) {
		
	
		Usuario usuario = manager.createQuery("Select distinct(u) "+
	             "from Usuario u where u.login = :login", Usuario.class).setParameter("login", login).getSingleResult();
		
		
		
		if(usuario.getLogin().isEmpty()) {
			throw new UsernameNotFoundException("Usuário "+login+" não encontrado!");
		}
		
		
		return usuario;
	}

	

	
}
