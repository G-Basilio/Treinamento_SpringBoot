package br.com.solinftec.treinamento.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Data
@Entity
@Table(name = "EQUIPAMENTO")
public class Equipamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "DESCRICAO")
    private String descicao;
    @Column(name = "LATITUDE")
    private Float latitude;
    @Column(name = "LONGITUDE")
    private Float longitude;
    @Column(name = "ATIVO")
    private int ativo;

    @OneToMany(mappedBy = "equipamento")
    @JsonBackReference
    private List<OrdemServico> ordemServicos;
    
}
