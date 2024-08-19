package cl.rstazzi.service;

import java.util.List;

import org.springframework.stereotype.Service;


import cl.rstazzi.model.Category;

@Service
public interface CategoryService {

	List<Category> findAll(); //lista de todas las categorías
	Category findById(Integer id); //conexión a bbdd por id
	Category findByName(String name);
	
	//se agrupan las diferentes conexiones de BBDD llamadas en repository y las que estan por defecto
	

}
