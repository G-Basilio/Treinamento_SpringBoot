package br.com.solinftec.treinamento.dto.fazenda;

import br.com.solinftec.treinamento.dto.fazendeiro.FazendeiroDto;
import br.com.solinftec.treinamento.model.Fazenda;
import lombok.Data;


@Data
public class GetAllFazendaDto {
    private Long id;
    private String descricao;
    private Float area;
    private Float latitude;
    private Float longitude;
    private FazendeiroDto fazendeiro;

    public GetAllFazendaDto(Fazenda fazenda) {
        this.id = fazenda.getId();
        this.descricao = fazenda.getDescricao();
        this.area = fazenda.getArea();
        this.latitude = fazenda.getLatitude();
        this.longitude = fazenda.getLongitude();
        this.fazendeiro = new FazendeiroDto(fazenda.getFazendeiro());
    }
}