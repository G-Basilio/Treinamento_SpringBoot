package br.com.solinftec.treinamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.solinftec.treinamento.model.TipoEquipamento;

@Repository
public interface TipoEquipamentoRepository extends JpaRepository <TipoEquipamento, Long>{
    
}
