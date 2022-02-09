package br.com.solinftec.treinamento.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "FAZENDEIRO")
@Data
@NoArgsConstructor
public class Fazendeiro {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "TELEFONE")
    private String telefone;

    @ManyToMany
    @JsonBackReference
    @JoinTable(name = "COOPERATIVA_FAZENDEIRO",
        joinColumns={@JoinColumn(name = "ID_FAZENDEIRO", referencedColumnName = "ID")},
        inverseJoinColumns = {@JoinColumn(name = "ID_COOPERATIVA", referencedColumnName = "ID")})
    private List<Cooperativa> cooperativas;

    public Fazendeiro(Long id) {
        this.id = id;
    }
}