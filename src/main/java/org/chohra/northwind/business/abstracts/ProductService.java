package org.chohra.northwind.business.abstracts;

import org.chohra.northwind.core.utilities.results.DataResult;
import org.chohra.northwind.core.utilities.results.Result;
import org.chohra.northwind.entities.Category;
import org.chohra.northwind.entities.Product;

import java.util.List;

public interface ProductService {
    DataResult<List<Product>> getAll();

    Result add(Product product);

    DataResult<Product> findByProductName(String productName);
    DataResult<Product> findByProductId(int productId);
}
