package livraria.com.Livraria.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import livraria.com.Livraria.entities.Autor;

@Repository
public interface AutorRepository extends JpaRepository<Autor,Long> {

	
	

}
