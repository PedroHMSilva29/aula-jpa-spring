package br.com.pehenmo.aulajpaspring.repository;

import br.com.pehenmo.aulajpaspring.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {
}
