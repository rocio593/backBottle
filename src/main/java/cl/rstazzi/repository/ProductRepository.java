package cl.rstazzi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import cl.rstazzi.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	
	List<Product> findByNameContaining(String name); // Se llama a filtrado por "nombre que contiene palabra" de JPA
	
//	@Query(value = "SELECT p FROM Product p WHERE p.name LIKE %:filtro% OR p.discount LIKE %:filtro%")
//	List<Product> search(@Param("filtro")String filtro);
	
	
	List<Product> findByCategory(int category);// Se llama a filtrado por atributo categoría de JPA
	
}
