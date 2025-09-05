package br.com.oldburguer.Old.Burguer.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "restaurante", schema = "old_burguer")
public class Restaurante {
    @Id
    @Column(name = "id_restaurante", nullable = false)
    private Integer id;

    @Column(name = "nome", nullable = false, length = Integer.MAX_VALUE)
    private String nome;

    @Column(name = "endereco", nullable = false, length = Integer.MAX_VALUE)
    private String endereco;

    @Column(name = "descricao", length = Integer.MAX_VALUE)
    private String descricao;

}