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
        return service.findAll();
    }

    @GetMapping(value="/{id}")
    public Category findById(@PathVariable Integer id){
        return service.find(id);
    }
}
