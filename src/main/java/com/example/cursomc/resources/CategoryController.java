package com.example.cursomc.resources;

import com.example.cursomc.domain.Categoria;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/categories")
public class CategoryController {

    @GetMapping
    public List<Categoria> list(){

        Categoria cat1 = new Categoria(1, "Informática");
        Categoria cat2 = new Categoria(2, "Escritório");

        List<Categoria> categorias = new ArrayList<>();

        categorias.add(cat1);
        categorias.add(cat2);

        return categorias;
    }
}
