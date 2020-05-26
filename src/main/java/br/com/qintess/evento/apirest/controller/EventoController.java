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

import br.com.qintess.evento.apirest.model.Evento;
import br.com.qintess.evento.apirest.repository.EventoRepository;
import br.com.qintess.evento.apirest.repository.IngressoRepository;
import br.com.qintess.evento.apirest.repository.UsuarioRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api")
@Api(value="API REST Evento")
@CrossOrigin(origins = "*")
public class EventoController {

	@Autowired
	EventoRepository eventoRepository;

	@Autowired
	IngressoRepository ingressoRepository;

	@Autowired
	UsuarioRepository usuarioRepository;

	@GetMapping("/eventos")
	public List<Evento> listaIngresso(){				
		return eventoRepository.findAll();
	}	
	
	@ApiOperation(value="Retorna um único evento")
	@GetMapping("/evento/{id}")
	public Evento listaUsuarioEvento(@PathVariable(value="id") long id){
		return eventoRepository.findById(id);
	}
	
	@ApiOperation(value="Salva o evento")
	@PostMapping("/evento")
	public Evento salvaEvento(@RequestBody Evento evento) {
		return eventoRepository.save(evento);
	
	}
	
	@ApiOperation(value="Deleta o evento")
	@DeleteMapping("/evento")
	public void deletaEvento(@RequestBody Evento evento) {
		eventoRepository.delete(evento);
	}
	
	@ApiOperation(value="Atualizar o evento")
	@PutMapping("/evento")
	public Evento atualizarEvento(@RequestBody Evento evento) {
		return eventoRepository.save(evento);
	}
}
