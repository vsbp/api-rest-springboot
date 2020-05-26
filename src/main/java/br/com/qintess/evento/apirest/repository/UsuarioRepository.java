package br.com.qintess.evento.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.qintess.evento.apirest.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	Usuario findById(long id);
}
