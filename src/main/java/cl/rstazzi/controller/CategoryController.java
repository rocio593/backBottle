package cl.rstazzi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import cl.rstazzi.model.Category;
import cl.rstazzi.model.Product;
import cl.rstazzi.service.CategoryService;


@RestController
@RequestMapping("/api/v1/category")
public class CategoryController {
// se procesan las solicitudes de API REST entrantes, se prepara el modelo para entregar los datos a la vista
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	List<Category> findAll(){
		return categoryService.findAll();
	}
	
	@GetMapping("/{category}")
	@ResponseStatus(HttpStatus.FOUND)
	public Category findByCategory(Integer category){
		return categoryService.findById(category);   //por Id
	}
	
	@GetMapping("/{name}")
	@ResponseStatus(HttpStatus.FOUND)
	public Category findByName(String name){
		return categoryService.findByName(name);   //por nombre
	}
	
}
