package br.com.solinftec.treinamento.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

@Data
@Entity
@Table(name = "ORDEM_SERVICO")
public class OrdemServico {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "DATA_EXECUCAO")
    private Date data_execucao;

    @Column(name = "RATE_APLICACAO")
    private Float rate_aplicacao;

    @Column(name = "TOTAL_APLICACAO")
    private Float total_aplicacao;

    @ManyToOne
    @JoinColumn(name = "ID_COOPERATIVA")
    @JsonManagedReference
    private Cooperativa cooperativa;

    @ManyToOne
    @JoinColumn(name = "ID_FAZENDA")
    @JsonManagedReference
    private Fazenda fazenda;

    @ManyToOne
    @JoinColumn(name = "ID_EQUIPAMENTO")
    @JsonManagedReference
    private Equipamento equipamento;

    @ManyToOne
    @JoinColumn(name = "ID_PRODUTO")
    @JsonManagedReference
    private Produto produto;

    @ManyToOne
    @JoinColumn(name = "ID_TIPO_SERVICO")
    @JsonManagedReference
    private TipoServico tipoServico;







    /* @OneToOne
    private Cooperativa id_cooperativa;

    @OneToOne
    private Fazenda id_fazenda;

    @OneToOne
    private Equipamento id_equipamento;

    @OneToOne
    private Produto id_produto;

    @OneToOne
    private TipoServico Tipo_Servico; */

}

