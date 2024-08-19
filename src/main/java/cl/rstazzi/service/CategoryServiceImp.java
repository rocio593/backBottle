package cl.rstazzi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cl.rstazzi.model.Category;
import cl.rstazzi.repository.CategoryRepository;


@Service
public class CategoryServiceImp implements CategoryService {
//desarrollo de las diferentes funciones que provienen de Service
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Override
	public List<Category> findAll() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}

	@Override
	public Category findById(Integer id) {
		// TODO Auto-generated method stub
		return categoryRepository.findById(id).get();
	}

	@Override
	public Category findByName(String name) {
		// TODO Auto-generated method stub
		return categoryRepository.findByName(name);
	}

}
