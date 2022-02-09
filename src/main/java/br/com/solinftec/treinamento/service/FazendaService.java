package br.com.solinftec.treinamento.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import br.com.solinftec.treinamento.dto.fazenda.GetAllFazendaDto;
import br.com.solinftec.treinamento.repository.FazendaRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FazendaService {

    private final FazendaRepository repository;

    public List<GetAllFazendaDto> getAll() {
        return repository.findAll().stream()
                .map(fazenda -> new GetAllFazendaDto(fazenda))
                .collect(Collectors.toList());
    }    
}
