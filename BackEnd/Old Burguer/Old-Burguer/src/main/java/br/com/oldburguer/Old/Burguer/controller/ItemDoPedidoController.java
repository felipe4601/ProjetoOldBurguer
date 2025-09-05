package br.com.oldburguer.Old.Burguer.controller;

import br.com.oldburguer.Old.Burguer.model.ItemDoPedido;
import br.com.oldburguer.Old.Burguer.service.ItemDoPedidoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/itensdopedido")
public class ItemDoPedidoController {
    private final ItemDoPedidoService itemDoPedidoService;

    public ItemDoPedidoController(ItemDoPedidoService service){
        itemDoPedidoService = service;
    }

    @GetMapping
    public ResponseEntity<List<ItemDoPedido>> listarItensDoPedido(){
        List<ItemDoPedido> itensDoPedido = itemDoPedidoService.listarTodos();
        return ResponseEntity.ok().body(itensDoPedido);
    }
}
