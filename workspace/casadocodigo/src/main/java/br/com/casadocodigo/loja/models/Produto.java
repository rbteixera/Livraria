package br.com.casadocodigo.loja.models;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity   // Annotetion JPA
public class Produto {

	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
    private int id;
	private String titulo;
	private String descricao;
	private int paginas;
	private String isbn;
	
	@ElementCollection //Cria uma tabela extra, chamada Preco, mas já relacionada com a tabela Produto
	private List<Preco> precos;
	
	/* @DateTimeFormat(pattern="dd/MM/yyyy") - Tirei porque criei o Bean para formatação de datas na forma padrão
	    na classe de configuração AppConfiguration */
	@DateTimeFormat
	private Calendar dataLancamento;
	
	private String sumarioPath;
	
	public List<Preco> getPrecos() {
		return precos;
	}
	public void setPrecos(List<Preco> precos) {
		this.precos = precos;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	
	
	public Calendar getDataLancamento() {
		return dataLancamento;
	}
	public void setDataLancamento(Calendar dataLancamento) {
		this.dataLancamento = dataLancamento;
	}
	
	public String getSumarioPath() {
		return sumarioPath;
	}
	public void setSumarioPath(String sumarioPath) {
		this.sumarioPath = sumarioPath;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	
	public final String getIsbn() {
		return isbn;
	}
	public final void setIsbn(String isbn) {
		this.isbn = isbn;
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
		if (id != other.id)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Produto [titulo=" + titulo + ", descricao=" + descricao
				+ ", paginas=" + paginas + "]";
	}
	public BigDecimal PrecoPara(TipoPreco tipoPreco) {
		
		return precos.stream().filter(preco -> preco.getTipoPreco().equals(tipoPreco)).findFirst().get().getValor();
	}
	

}
