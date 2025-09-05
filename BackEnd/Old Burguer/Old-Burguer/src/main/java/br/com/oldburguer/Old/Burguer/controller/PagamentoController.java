package br.com.oldburguer.Old.Burguer.controller;

import br.com.oldburguer.Old.Burguer.model.Pagamento;
import br.com.oldburguer.Old.Burguer.service.PagamentoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/pagamentos")
public class PagamentoController {
    private final PagamentoService pagamentoService;

    public PagamentoController(PagamentoService service){
        pagamentoService = service;
    }

    @GetMapping
    public ResponseEntity<List<Pagamento>> listarPagamentos(){
        List<Pagamento> pagamentos = pagamentoService.listarTodos();
        return ResponseEntity.ok().body(pagamentos);
    }
}
