package br.com.helpte.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.helpte.entity.Configuracao;

@Repository
public interface ConfiguracaoRepository extends JpaRepository<Configuracao,Integer>{

}