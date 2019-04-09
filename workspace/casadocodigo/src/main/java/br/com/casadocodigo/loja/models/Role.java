package br.com.casadocodigo.loja.models;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.security.core.GrantedAuthority;

@Entity
public class Role implements GrantedAuthority{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String nome;
	private String Usuario_email = "admin@casadocodigo.com.br";

	
	public String getUsuario_email() {
		return Usuario_email;
	}

	public void setUsuario_email(String usuario_email) {
		Usuario_email = usuario_email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return this.nome;
	}
	
	

}
