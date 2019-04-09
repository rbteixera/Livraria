package br.com.casadocodigo.loja.suporte;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class CriaSenha {
	

	    public static void main(String[] args) {    
	        String senhaCriptografado = new BCryptPasswordEncoder().encode("123456");
	        System.out.println(senhaCriptografado);
	    }
	

}
