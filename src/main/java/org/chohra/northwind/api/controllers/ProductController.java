package org.chohra.northwind.api.controllers;

import lombok.AllArgsConstructor;
import org.chohra.northwind.business.abstracts.ProductService;
import org.chohra.northwind.core.utilities.results.DataResult;
import org.chohra.northwind.core.utilities.results.Result;
import org.chohra.northwind.entities.Product;
import org.chohra.northwind.entities.dtos.ProductDto;
import org.chohra.northwind.entities.dtos.ProductWithCategoryDetails;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@AllArgsConstructor
public class ProductController {
    private ProductService productService;
    @GetMapping("/getAllProduct")
    public DataResult<List<Product>> getAll(){
        return this.productService.getAll();
    }
    @PostMapping("/addProduct")
    public Result add(@RequestBody ProductDto product){
        return this.productService.add(product);
    }

    @GetMapping("/find-by-category-name")
    public DataResult<ProductWithCategoryDetails> findByProductName(@RequestParam String productName){
        return this.productService.findByProductName(productName);
    }
}
