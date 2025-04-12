package org.example.dao.generic;

import org.example.dao.generic.IGenericDAO;
import org.example.domain.Venda;
import org.example.exceptions.TipochaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String>{
    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}
