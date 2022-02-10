package br.com.solinftec.treinamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.solinftec.treinamento.model.Monitoramento;

@Repository
public interface MonitoramentoRepository extends JpaRepository <Monitoramento, Long>{
    
}
