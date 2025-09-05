package br.com.oldburguer.Old.Burguer.service;

import br.com.oldburguer.Old.Burguer.model.Cliente;
import br.com.oldburguer.Old.Burguer.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository repo){
        clienteRepository = repo;
    }

    // Método listar todos
    public List<Cliente> listarTodos(){
        return clienteRepository.findAll();
    }
}
