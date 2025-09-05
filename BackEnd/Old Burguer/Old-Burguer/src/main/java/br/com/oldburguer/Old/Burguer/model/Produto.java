package br.com.oldburguer.Old.Burguer.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "produto", schema = "old_burguer")
public class Produto {
    @Id
    @Column(name = "id_produto", nullable = false)
    private Integer id;

    @Column(name = "nome", nullable = false, length = Integer.MAX_VALUE)
    private String nome;

    @Column(name = "preco", precision = 7, scale = 3)
    private BigDecimal preco;

    @Column(name = "categoria", nullable = false, length = Integer.MAX_VALUE)
    private String categoria;

}