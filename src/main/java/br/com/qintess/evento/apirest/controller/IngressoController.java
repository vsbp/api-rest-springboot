package br.com.qintess.evento.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.qintess.evento.apirest.model.Ingresso;
import br.com.qintess.evento.apirest.repository.EventoRepository;
import br.com.qintess.evento.apirest.repository.IngressoRepository;
import br.com.qintess.evento.apirest.repository.UsuarioRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api")
@Api(value="API REST Ingresso")
@CrossOrigin(origins = "*")
public class IngressoController {

	@Autowired
	EventoRepository eventoRepository;

	@Autowired
	IngressoRepository ingressoRepository;

	@Autowired
	UsuarioRepository usuarioRepository;

	@GetMapping("/ingresso")
	public List<Ingresso> listaIngresso(){
		return ingressoRepository.findAll();
	}	
	
	@ApiOperation(value="Retorna um único ingresso")
	@GetMapping("/ingresso/{id}")
	public Ingresso listaUsuarioIngresso(@PathVariable(value="id") long id){
		return ingressoRepository.findById(id);
	}
	
	@ApiOperation(value="Salva o ingresso")
	@PostMapping("/ingresso")
	public Ingresso salvaIngresso(@RequestBody Ingresso ingresso) {
		return ingressoRepository.save(ingresso);
	}
	
	@ApiOperation(value="Deleta o ingresso")
	@DeleteMapping("/ingresso")
	public void deletaIngresso(@RequestBody Ingresso ingresso) {
		ingressoRepository.delete(ingresso);
	}
	
	@ApiOperation(value="Atualizar o ingresso")
	@PutMapping("/ingresso")
	public Ingresso atualizarIngresso(@RequestBody Ingresso ingresso) {
		return ingressoRepository.save(ingresso);
	}
}
