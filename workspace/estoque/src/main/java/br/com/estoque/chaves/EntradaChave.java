package br.com.estoque.chaves;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Embeddable;

import org.springframework.format.annotation.DateTimeFormat;

@Embeddable
public class EntradaChave implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@DateTimeFormat
	private Calendar dataEntrada;
	
	private int idProduto;

	public EntradaChave() { }
    
	public EntradaChave(int idProduto, Calendar dataEntrada) {
		this.idProduto = idProduto;
		this.dataEntrada = dataEntrada;
	}
	public final Calendar getDataEntrada() {
		return dataEntrada;
	}

	public final void setDataEntrada(Calendar dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public final int getIdProduto() {
		return idProduto;
	}

	public final void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	
	

}
