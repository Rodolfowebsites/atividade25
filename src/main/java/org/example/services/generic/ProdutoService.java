package org.example.services.generic;

import org.example.dao.generic.IProdutoDAO;
import org.example.domain.Produto;
import org.example.services.generic.GenericService;


public class ProdutoService extends GenericService<Produto, String> implements IProdutoService{
    public ProdutoService(IProdutoDAO dao) {
        super(dao);
    }
}
