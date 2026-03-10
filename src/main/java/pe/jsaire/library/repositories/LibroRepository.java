package pe.jsaire.library.repositories;

import org.springframework.data.repository.CrudRepository;
import pe.jsaire.library.model.Libro;

import java.util.List;

public interface LibroRepository extends CrudRepository<Libro, Long> {

    List<Libro> findByIdioma(String idioma);

    boolean existsByTitulo(String titulo);

}
