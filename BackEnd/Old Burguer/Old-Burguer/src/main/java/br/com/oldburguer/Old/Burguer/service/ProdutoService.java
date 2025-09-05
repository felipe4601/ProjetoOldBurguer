package br.com.oldburguer.Old.Burguer.service;

import br.com.oldburguer.Old.Burguer.model.Produto;
import br.com.oldburguer.Old.Burguer.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository repo){
        produtoRepository = repo;
    }

    // método listar todos:
    public List<Produto> listarTodos(){
        return produtoRepository.findAll();
    }

}
