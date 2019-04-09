package br.com.casadocodigo.loja.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import br.com.casadocodigo.loja.models.Usuario;



@Repository
public class UsuarioDAO implements  UserDetailsService {


	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public Usuario loadUserByUsername(String email) {
		Usuario usuario = manager.createQuery("Select distinct(u) "+
	             "from Usuario u where u.email = :email", Usuario.class).setParameter("email", email).getSingleResult();
		
		/*List<Usuario> usuarios = manager.createQuery("select u from Usuario u where u.email = :email", Usuario.class)
		.setParameter("email", email)
		.getResultList();*/
		
		if(usuario.getEmail().isEmpty()) {
			throw new UsernameNotFoundException("Usuário "+email+" inesistente!");
		}
		
		//return usuarios.get(0);
		return usuario;
	}

	
}
