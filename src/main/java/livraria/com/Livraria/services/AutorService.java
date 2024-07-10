package livraria.com.Livraria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import livraria.com.Livraria.entities.Autor;
import livraria.com.Livraria.repositories.AutorRepository;

@Service
@Transactional
public class AutorService {
	
	@Autowired
	private AutorRepository autorRepository;
	
	public List<Autor> procuraTodos() {
		 return autorRepository.findAll();
	}
	
	public Autor procurarPorId(Long id) {
		return autorRepository.findById(id).get();
	}
	
	public List<Autor> getAll() {
		return autorRepository.findAll();	
	
	}
	
	public void saveAutor (Autor autor) {
		autorRepository.save(autor);
	}
	


}
