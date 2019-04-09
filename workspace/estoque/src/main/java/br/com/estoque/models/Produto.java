package br.com.estoque.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity   // Annotetion JPA
public class Produto {

	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int    codigo;
	private String descricao;
	private String referenciaFab; /*Referência do Fabricante*/
	private String unidade;
	private int  saldoEstoque;
	private int    entrada;
	private int saida;
	private int estoqueMinimo;
	
	
	
	
	public final int getId() {
		return id;
	}
	public final void setId(int id) {
		this.id = id;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getUnidade() {
		return unidade;
	}
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	
	public final String getReferenciaFab() {
		return referenciaFab;
	}
	public final void setReferenciaFab(String referenciaFab) {
		this.referenciaFab = referenciaFab;
	}
	public final int getSaldoEstoque() {
		return saldoEstoque;
	}
	public final void setSaldoEstoque(int saldoEstoque) {
		this.saldoEstoque = saldoEstoque;
	}
	public final int getEntrada() {
		return entrada;
	}
	public final void setEntrada(int entrada) {
		this.entrada = entrada;
	}
	public final int getSaida() {
		return saida;
	}
	public final void setSaida(int saida) {
		this.saida = saida;
	}
	public final int getEstoqueMinimo() {
		return estoqueMinimo;
	}
	public final void setEstoqueMinimo(int estoqueMinimo) {
		this.estoqueMinimo = estoqueMinimo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Produto [Código=" + codigo + ", descricao=" + descricao
				 + "]";
	}
	
	
}
