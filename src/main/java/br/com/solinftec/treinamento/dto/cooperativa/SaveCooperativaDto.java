package br.com.solinftec.treinamento.dto.cooperativa;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import br.com.solinftec.treinamento.model.Cooperativa;
import br.com.solinftec.treinamento.model.Fazendeiro;
import lombok.Data;

@Data
public class SaveCooperativaDto {
    
    private Long id;
    @NotNull(message = "NOME_COULD_NOT_BE_NULL")
    private String nome;
    @NotNull(message = "EMAIL_COULD_NOT_BE_NULL")
    @Email(message = "NOT_A_VALID_EMAIL")
    private String email;
    private List<Long> fazendeiros;

    public Cooperativa pegarModel() {
        Cooperativa cooperativa = new Cooperativa();
        cooperativa.setAtivo(true);
        cooperativa.setNome(this.nome);
        cooperativa.setEmail(this.email);
        cooperativa.setId(this.id);
        cooperativa.setFazendeiros(fazendeiros.stream().map(Fazendeiro::new).collect(Collectors.toList()));
        return cooperativa;
    }

}
