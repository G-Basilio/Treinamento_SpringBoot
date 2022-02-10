package br.com.solinftec.treinamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.solinftec.treinamento.model.Equipamento;

@Repository
public interface EquipamentoRepository extends JpaRepository<Equipamento,Long>{
    
}
