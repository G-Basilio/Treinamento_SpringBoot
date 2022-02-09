package br.com.solinftec.treinamento.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.solinftec.treinamento.dto.fazendeiro.FazendeiroWithFazendaDto;
import br.com.solinftec.treinamento.model.Fazendeiro;
import br.com.solinftec.treinamento.repository.FazendeiroRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FazendeiroService {
    
    private final FazendeiroRepository repository;


    public FazendeiroWithFazendaDto getFazendeiro(Long idFazendeiro) throws Exception {

        Optional<Fazendeiro> fazendeiro = repository.findById(idFazendeiro);

        if(fazendeiro.isPresent()) {
            return new FazendeiroWithFazendaDto(fazendeiro.get());
        } else {
            throw new Exception("FAZENDEIRO_NOT_FOUND");
        }
    }
}
