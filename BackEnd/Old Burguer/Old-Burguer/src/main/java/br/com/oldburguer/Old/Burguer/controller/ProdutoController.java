package br.com.oldburguer.Old.Burguer.controller;

import br.com.oldburguer.Old.Burguer.model.Produto;
import br.com.oldburguer.Old.Burguer.service.PagamentoService;
import br.com.oldburguer.Old.Burguer.service.ProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")

public class ProdutoController {
    private final ProdutoService produtoService;
    private final PagamentoService pagamentoService;

    public ProdutoController(ProdutoService service, PagamentoService pagamentoService){
        produtoService = service;
        this.pagamentoService = pagamentoService;
    }

    @GetMapping
    public ResponseEntity<List<Produto>> listarProdutos(){
        List<Produto> produtos = produtoService.listarTodos();
        // criando uma lista chamada "produtos", que irá receber os objetos
        // que estão na lista criada no service, ou seja, a lista de
        // controller depende da lista de service
        return ResponseEntity.ok().body(produtos);
        // retornando em formato de reposta para web a lita de produtos,
        // que foi criada a partir da lista de produtos do service
    }
    // Método para buscar por id
    @GetMapping("/{id}")
    public ResponseEntity<?> buscarPorId(@PathVariable Integer id){
        Produto produto = produtoService.buscarPorId(id);
        if(produto == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(produto);
    }
}
