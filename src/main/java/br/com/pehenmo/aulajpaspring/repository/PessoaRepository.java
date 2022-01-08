package br.com.pehenmo.aulajpaspring.repository;

import br.com.pehenmo.aulajpaspring.model.Pessoa;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

    @Query("SELECT obj FROM Pessoa obj WHERE LOWER(obj.nome) = LOWER(:nome)")
    Page<Pessoa> findByNome(String nome, Pageable pageable);

    Pessoa findByEmailIgnoreCase(String email);
}
