package br.com.oldburguer.Old.Burguer.service;

import br.com.oldburguer.Old.Burguer.model.ItemDoPedido;
import br.com.oldburguer.Old.Burguer.repository.ItemDoPedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemDoPedidoService {
    private final ItemDoPedidoRepository itemDoPedidoRepository;

    public ItemDoPedidoService(ItemDoPedidoRepository repo){
        itemDoPedidoRepository = repo;
    }

    public List<ItemDoPedido> listarTodos(){
        return itemDoPedidoRepository.findAll();
    }
}
