package br.com.estoque.models;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.transaction.Transactional;

import org.springframework.format.annotation.DateTimeFormat;

@Transactional
public class EntradaView {

	
	 
	@DateTimeFormat
	private Calendar dataEntrada;
	private String idProduto;
	private String codigoEnt;
	private String vlUnitario;
	private String quantEntrada;
	
	public final Calendar getDataEntrada() {
		return dataEntrada;
	}
	public final void setDataEntrada(Calendar dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public final String getIdProduto() {
		return idProduto;
	}
	public final void setIdProduto(String idProduto) {
		this.idProduto = idProduto;
	}
	public final String getCodigoEnt() {
		return codigoEnt;
	}
	public final void setCodigoEnt(String codigoEnt) {
		this.codigoEnt = codigoEnt;
	}
	public final String getVlUnitario() {
		return vlUnitario;
	}
	public final void setVlUnitario(String vlUnitario) {
		this.vlUnitario = vlUnitario;
	}
	public final String getQuantEntrada() {
		return quantEntrada;
	}
	public final void setQuantEntrada(String quantEntrada) {
		this.quantEntrada = quantEntrada;
	}
	
	
	
	
}
