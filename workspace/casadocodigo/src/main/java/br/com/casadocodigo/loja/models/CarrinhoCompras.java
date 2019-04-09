package br.com.casadocodigo.loja.models;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;


@Component  /*  Essa anotação indica que a classe será tratada como um Bean do Spring. Para que possamos acessar esse Bean em nossas view/jsp's, 
                precisaremos adicionar uma configuração na classe AppWebConfiguration.*/
@Scope(value=WebApplicationContext.SCOPE_SESSION, proxyMode=ScopedProxyMode.TARGET_CLASS)
public class CarrinhoCompras implements Serializable{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5030255429701723844L;
	
	private Map<CarrinhoItem, Integer> itens = new LinkedHashMap<CarrinhoItem, Integer>();
	
	public void add(CarrinhoItem item){
		itens.put(item, getQuantidade(item) + 1);
    }

	public Integer getQuantidade(CarrinhoItem item) {
		if(!itens.containsKey(item)){
	        itens.put(item, 0);
	    }
	    return itens.get(item);
	}
	
	public int getQuantidade(){
		/*Caso não conheça a API de Stream e Lambdas, que são recursos do Java 8*/
	    return itens.values().stream().reduce(0, (proximo, acumulador) -> (proximo + acumulador));
	}

	public Collection<CarrinhoItem> getItens() {
		 
		 return itens.keySet();
		 
	 }
	
	public BigDecimal getTotal(CarrinhoItem item) {
		return item.getTotal(getQuantidade(item));
	}
	
	public BigDecimal getTotal() {
		
		BigDecimal total = BigDecimal.ZERO;
		
		for (CarrinhoItem  item : itens.keySet()) {
			total = total.add(getTotal(item));	
		}
		return total;
		
		
	}

	public void remover(Integer produtoId, TipoPreco tipoPreco) {
		Produto produto = new Produto();
		produto.setId(produtoId);
		itens.remove(new CarrinhoItem(produto, tipoPreco));
		
	}
	
	public void removeAll () {
		itens.clear();
	}
}
