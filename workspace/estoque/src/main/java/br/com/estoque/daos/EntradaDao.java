package br.com.estoque.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.estoque.models.Entrada;
import br.com.estoque.models.Produto;


@Repository
@Transactional
public class EntradaDao {
	
	@PersistenceContext
	private EntityManager manager;
	
	
	public void save(Entrada entrada) {
        int quantAnterior=0;
        System.out.println("save no 1 "+entrada.getIdProduto());
		if(findEntradaJaExiste(entrada, quantAnterior)) {
			update(entrada);
			
			Produto produto = buscaProduto(entrada.getIdProduto());
			
			int produtoEntrada = produto.getEntrada() - quantAnterior;
			
			produto.setEntrada(produtoEntrada+entrada.getQuantEntrada());
			
			int saldoEstoque = produto.getSaldoEstoque() - produto.getSaida();
			
			produto.setSaldoEstoque(saldoEstoque);
			
			manager.merge(produto);
		} else {
			
		   manager.persist(entrada);
		   
		   Produto produto = buscaProduto(entrada.getIdProduto());
		  
		   produto.setEntrada(produto.getEntrada()+entrada.getQuantEntrada());
		   int saldoEstoque = produto.getEntrada() - produto.getSaida();
		   produto.setSaldoEstoque(saldoEstoque);
		   
		   manager.merge(produto);
		}
		
	}
	
    private void update(Entrada entrada) {
    	
		manager.merge(entrada);
    }	

	public boolean  findEntradaJaExiste(Entrada entrada, int quantAnterior) {
		System.out.println("findEntradaJaExiste 1");
		Entrada entradaFind = new Entrada();
		
    	String sql = "select e from Entrada e where e.dataEntrada = :dataEnt" 
    			     + " and e.idProduto = :idProduto";
    	
    	 try {
    		 entradaFind = manager.createQuery(sql, Entrada.class).setParameter("dataEnt", entrada.getDataEntrada()).setParameter("idProduto",  entrada.getIdProduto()).getSingleResult(); 
    		 if(entradaFind != null && entradaFind.getIdProduto() != 0 && entradaFind.getIdProduto() == entrada.getIdProduto()) {
    	    		quantAnterior = entradaFind.getQuantEntrada();
    	    		return true;
    	    	} else {
    	    		return false;	
    	    	}

    	 } catch (Exception e) {
    		 return false; 
    	 }
	
    	
    			
   }

   public Produto find(Integer codEntrada) {
		
		return manager.createQuery("select p from Produto p where p.codigo = :codEntrada", Produto.class).setParameter("codEntrada", codEntrada).getSingleResult();
   }

	public Produto buscaProduto(Integer idProduto) {
		
		return manager.createQuery("select p from Produto p where p.id = :idProduto", Produto.class).setParameter("idProduto", idProduto).getSingleResult();
   }
}
