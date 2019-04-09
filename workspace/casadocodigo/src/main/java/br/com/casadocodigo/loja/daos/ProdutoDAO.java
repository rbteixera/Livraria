	package br.com.casadocodigo.loja.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.casadocodigo.loja.models.Produto;

@Repository
@Transactional
public class ProdutoDAO {
	
	@PersistenceContext
	private EntityManager manager;
	
	public List<Produto> VerifIsbn(Produto produto) {
		System.out.println("*2* "+produto.getIsbn());
	
	    return manager.createQuery("Select p from Produto p where p.isbn = :isbn", Produto.class).setParameter("isbn", produto.getIsbn()).getResultList();
		//return query.getResultList();
	}
	
	public void gravar(Produto produto) {
			    
		   manager.persist(produto);
		
	}

	public List<Produto> listar() {
		
		return manager.createQuery("select p from Produto p", Produto.class).getResultList();
	}

	public Produto find(Integer id) {
		/*join fetch --> buscar juntando ou buscar junto - buscando produto junto com o preco*/
		return manager.createQuery("Select distinct(p) "+
		             "from Produto p join fetch p.precos preco where p.id = :id", Produto.class).setParameter("id", id).getSingleResult();
	}

	public Produto BuscaPorIsbn(String isbn) {
		// TODO Auto-generated method stub
		return  manager.createQuery("Select p from Produto p where p.isbn = :isbn", Produto.class).setParameter("isbn", isbn).getSingleResult();
	}

	

}
