package com.example.cursomc.resources;

import com.example.cursomc.domain.Category;
import com.example.cursomc.services.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/categories")
public class CategoryController {

    private CategoryService service;

    public CategoryController(CategoryService service) {
        this.service = service;
    }

    @GetMapping
    public List<Category> list(){

        Category cat1 = new Category(1, "Informática");
        Category cat2 = new Category(2, "Escritório");

        List<Category> categories = new ArrayList<>();

        categories.add(cat1);
        categories.add(cat2);

        return categories;
    }

    @GetMapping(value="/{id}")
    public Category findById(@PathVariable Integer id){
        return service.find(id);
    }
}
