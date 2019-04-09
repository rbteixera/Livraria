package br.com.estoque.models;

import java.util.Calendar;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import org.springframework.format.annotation.DateTimeFormat;

import br.com.estoque.chaves.EntradaChave;

@Entity
@IdClass(EntradaChave.class)
public class Entrada {

	//@EmbeddedId
	//private EntradaChave id;
	@Id
	@DateTimeFormat
	private Calendar dataEntrada;
    @Id
	private int idProduto;
	private int codigoEnt;
	private double vlUnitario;
	private int quantEntrada;
	
	
	
	
	
	/*public final EntradaChave getId() {
		return id;
	}
	public final void setId(EntradaChave id) {
		this.id = id;
	}*/
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
	public final int getCodigoEnt() {
		return codigoEnt;
	}
	public final void setCodigoEnt(int codigoEnt) {
		this.codigoEnt = codigoEnt;
	}
	public final double getVlUnitario() {
		return vlUnitario;
	}
	public final void setVlUnitario(double vlUnitario) {
		this.vlUnitario = vlUnitario;
	}
	public final int getQuantEntrada() {
		return quantEntrada;
	}
	public final void setQuantEntrada(int quantEntrada) {
		this.quantEntrada = quantEntrada;
	}
	
	
	
	
}
