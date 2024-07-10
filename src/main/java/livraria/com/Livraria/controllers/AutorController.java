package livraria.com.Livraria.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import livraria.com.Livraria.entities.Autor;
import livraria.com.Livraria.services.AutorService;

@RestController
@RequestMapping(value = "/autores")
public class AutorController {
	
	@Autowired
	private AutorService service;
	
	@GetMapping
	public ResponseEntity<List<Autor>> getAll() {
		List<Autor> lista = service.getAll();
		return ResponseEntity.status(HttpStatus.OK).body(lista);
	}
	
	@PostMapping
	public ResponseEntity<String> saveAutor (@RequestBody Autor autor) {
		service.saveAutor(autor);
		return ResponseEntity.status(HttpStatus.CREATED).body("Autor Cadastrado!");
	}
	
	@GetMapping(value="/{id}")
	public Autor procurarPorId(@PathVariable Long id) {
		return service.procurarPorId(id);
	}
	

}
