package livraria.com.Livraria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import livraria.com.Livraria.entities.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro,Long> {

}
