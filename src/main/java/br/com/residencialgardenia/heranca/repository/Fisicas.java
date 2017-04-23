package br.com.residencialgardenia.heranca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.residencialgardenia.heranca.model.Fisica;

@Repository
public interface Fisicas extends JpaRepository<Fisica, Long> {

}
