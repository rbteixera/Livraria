package br.estoque.validadores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import br.com.estoque.models.Produto;


public class ValidadorProduto implements Validator{

	
	
	@Override
	public boolean supports(Class<?> clazz) {
		return Produto.class.isAssignableFrom(clazz);
	}

	@Override 
	public void validate(Object targe, Errors errors) {
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "codigo", "field.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "descricao", "field.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "unidade", "field.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "referenciaFab", "field.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "estoqueMinimo", "field.required");
		
		
		Produto produto = (Produto) targe;
		
		if(produto.getCodigo()==0) {
			errors.rejectValue("codigo", "typeMismatch.produto.codigo");
		}
		
		if(produto.getEstoqueMinimo()==0) {
			errors.rejectValue("estoqueMinimo", "typeMismatch.produto.codigo");
		}
		
	}

}
