package livraria.com.Livraria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import livraria.com.Livraria.entities.Livro;
import livraria.com.Livraria.repositories.LivroRepository;

@Service
@Transactional
public class LivroService {
	
	@Autowired
	private LivroRepository livroRepository;
	
	public List<Livro> getAllLivros() {
		return livroRepository.findAll();
		
	}
	
	public void saveLivro(Livro livro) {
		livroRepository.save(livro);
	}

}
