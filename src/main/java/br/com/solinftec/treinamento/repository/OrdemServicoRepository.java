package br.com.solinftec.treinamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.solinftec.treinamento.model.OrdemServico;

public interface OrdemServicoRepository extends JpaRepository<OrdemServico, Long>{
    
}
