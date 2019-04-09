package br.com.estoque.infra;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import br.com.estoque.daos.ProdutoDao;
import br.com.estoque.models.Produto;

@Component
@Scope(WebApplicationContext.SCOPE_REQUEST)
public class ListaDeProdutos {

	@Autowired
	ProdutoDao produtoDao;
	
	public List<Produto> lista() {        
        List<Produto> produtos =  produtoDao.listar();
        return produtos;
    }
}
