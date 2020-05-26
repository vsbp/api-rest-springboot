package br.com.qintess.evento.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.qintess.evento.apirest.model.Ingresso;



public interface IngressoRepository extends JpaRepository<Ingresso, Long>{
	
	Ingresso findById(long id);
}
