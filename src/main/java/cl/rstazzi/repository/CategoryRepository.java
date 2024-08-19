package cl.rstazzi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.rstazzi.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

	Category findByName(String name);// Se llama a filtrado por nombre de JPA para que se conecten a la base de datos

}
