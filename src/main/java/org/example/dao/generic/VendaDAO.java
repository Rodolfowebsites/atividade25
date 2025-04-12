package org.example.dao.generic;

import org.example.domain.Venda;
import org.example.domain.Venda.Status;
import org.example.exceptions.TipochaveNaoEncontradaException;
import org.example.dao.generic.GenericDAO;


public class VendaDAO extends GenericDAO<Venda, String> implements IVendaDAO{
    @Override
    public Class<Venda> getTipoClasse() {
        return Venda.class;
    }

    @Override
    public void atualiarDados(Venda entity, Venda entityCadastrado) {
        entityCadastrado.setCodigo(entity.getCodigo());
        entityCadastrado.setStatus(entity.getStatus());
    }

    @Override
    public void excluir(String valor) {
        throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
    }

    @Override
    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException {
        venda.setStatus(Venda.Status.CONCLUIDA);
        super.alterar(venda);
    }
}
