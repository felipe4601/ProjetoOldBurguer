package br.com.oldburguer.Old.Burguer.service;

import br.com.oldburguer.Old.Burguer.model.Pedido;
import br.com.oldburguer.Old.Burguer.repository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    private final PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository repo){
        pedidoRepository = repo;
    }

    public List<Pedido> listarTodos(){
        return pedidoRepository.findAll();
    }
}
