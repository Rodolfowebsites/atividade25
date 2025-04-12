package org.example.services.generic;

import org.example.domain.Cliente;
import org.example.exceptions.TipochaveNaoEncontradaException;

public interface IClienteService {
    Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;

    Cliente buscarPorCPF(Long cpf);

    void excluir(Long cpf);

    void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;
}
