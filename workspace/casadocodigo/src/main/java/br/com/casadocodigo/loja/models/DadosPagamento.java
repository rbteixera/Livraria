package br.com.casadocodigo.loja.models;

import java.math.BigDecimal;

public class DadosPagamento {
	
	private BigDecimal TotalPagamento;
    private String resultado;
    
	public DadosPagamento(BigDecimal totalPagamento) {
		this.TotalPagamento=totalPagamento;
	}
	
	
	public String getTotalPagamento() {
		return "value : " + TotalPagamento;
	}

	public void setTotalPagamento(BigDecimal totalPagamento) {
		TotalPagamento = totalPagamento;
	}


	public String getResultado() {
		return resultado;
	}


	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	
	

}
