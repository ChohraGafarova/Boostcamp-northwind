package org.chohra.northwind.api.controllers;

import lombok.AllArgsConstructor;
import org.chohra.northwind.business.abstracts.CategoryService;
import org.chohra.northwind.entities.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
@AllArgsConstructor
public class CategoryController {

        private CategoryService categoryService;
        @GetMapping("/getAll")
        public List<Category> getAll(){
            return this.categoryService.getAll();
        }
}

