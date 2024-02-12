package org.chohra.northwind.api.controllers;

import lombok.AllArgsConstructor;
import org.chohra.northwind.business.abstracts.CategoryService;
import org.chohra.northwind.core.utilities.results.DataResult;
import org.chohra.northwind.core.utilities.results.Result;
import org.chohra.northwind.entities.Category;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
@AllArgsConstructor
public class CategoryController {

        private CategoryService categoryService;
        @GetMapping("/getAll")
        public DataResult<List<Category>> getAll(){
            return this.categoryService.getAll();
        }
        @PostMapping("/add")
    public Result add(@RequestBody Category category){
            return this.categoryService.add(category);
        }

        @GetMapping("/find-by-category-name")
        public DataResult<Category> findByCategoryName(@RequestParam String categoryName){
            return this.categoryService.findByCategoryName(categoryName);
        }
        @GetMapping("/find-by-category-name-and-description")
    public DataResult<Category> findByCategoryNameAndDescription(@RequestParam String categoryName, String description){
            return this.categoryService.findByCategoryNameAndDescription(categoryName, description);
        }
        @GetMapping("/find-by-category-id")
        public DataResult<Category> findByCategoryId(@RequestParam int categoryId){
            return this.categoryService.findByCategoryId(categoryId);
        }
}

