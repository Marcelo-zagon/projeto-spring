package marcelo.gonzaga.gof.service.impl;

import marcelo.gonzaga.gof.model.Cliente;

public interface ClienteService {
    Iterable<Cliente> buscarTodos();
    Cliente buscaPorId(Long id);
    void inserir (Cliente cliente);
    void atualizar(Long id, Cliente cliente);
    void deletar(Long id); 
}
