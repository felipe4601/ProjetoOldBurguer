package br.com.oldburguer.Old.Burguer.controller;

import br.com.oldburguer.Old.Burguer.model.Cliente;
import br.com.oldburguer.Old.Burguer.service.ClienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
    private final ClienteService clienteService;

    public ClienteController(ClienteService service){
        clienteService = service;
    }

    @GetMapping
    public ResponseEntity<List<Cliente>> listarClientes(){
        List<Cliente> clientes = clienteService.listarTodos();
        return ResponseEntity.ok().body(clientes);
    }
}
