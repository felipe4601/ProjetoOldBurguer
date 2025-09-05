package br.com.oldburguer.Old.Burguer.service;

import br.com.oldburguer.Old.Burguer.model.Pagamento;
import br.com.oldburguer.Old.Burguer.repository.PagamentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PagamentoService {
    private final PagamentoRepository pagamentoRepository;

    public PagamentoService(PagamentoRepository repo){
        pagamentoRepository = repo;
    }

    public List<Pagamento> listarTodos(){
        return pagamentoRepository.findAll();
    }
}
