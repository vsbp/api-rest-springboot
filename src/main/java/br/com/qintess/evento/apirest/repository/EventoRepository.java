package br.com.qintess.evento.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.qintess.evento.apirest.model.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long>{

	Evento findById(long id);
}
