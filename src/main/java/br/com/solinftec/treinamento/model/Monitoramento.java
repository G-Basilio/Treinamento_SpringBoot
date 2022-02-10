package br.com.solinftec.treinamento.model;

import java.util.Date;
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
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "MONITORAMENTO")
public class Monitoramento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "LATITUDE")
    private Float latitude;

    @Column(name = "LONGITUDE")
    private Float longitude;

    @Column(name = "DATA_HORA")
    private Date dataHora;

    @Column(name = "ID_EQUIPAMENTO")
    private int idEquipamento;

    @Column(name = "ID_ORDEM_SERVICO")
    private int idOrdemServico;

    @OneToMany(mappedBy = "monitoramento")
    @JsonBackReference
    private List<OrdemServico> ordemServicos;
}