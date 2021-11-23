package com.example.cursomc.services;

import com.example.cursomc.domain.Category;
import com.example.cursomc.repositories.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService{

    private CategoryRepository repo;

    public CategoryService(CategoryRepository repo) {
        this.repo = repo;
    }

    public Category find(Integer id){
        Optional<Category> obj = repo.findById(id);
        return obj.orElse(null);
    }

    public List<Category> findAll(){
        return repo.findAll();
    }
}
