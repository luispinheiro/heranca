package br.com.residencialgardenia.heranca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.residencialgardenia.heranca.model.Pessoa;

@Repository
public interface Pessoas extends JpaRepository<Pessoa, Long>{

}
