package br.com.solinftec.treinamento.dto.cooperativa;

import br.com.solinftec.treinamento.model.Cooperativa;
import lombok.Data;

@Data
public class GetAllCooperativaDto {


    private Long id;
    private String nome;
    private String email;

    public GetAllCooperativaDto(Cooperativa cooperativa) {
        this.id = cooperativa.getId();
        this.nome = cooperativa.getNome();
        this.email = cooperativa.getEmail();
    }
}
