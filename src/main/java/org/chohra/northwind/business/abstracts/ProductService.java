package org.chohra.northwind.business.abstracts;

import org.chohra.northwind.core.utilities.results.DataResult;
import org.chohra.northwind.core.utilities.results.Result;
import org.chohra.northwind.dataAccess.ProductDao;
import org.chohra.northwind.entities.Product;
import org.chohra.northwind.entities.dtos.ProductDto;
import org.chohra.northwind.entities.dtos.ProductWithCategoryDetails;

import java.util.List;

public interface ProductService {
    DataResult<List<Product>> getAll();

    Result add(ProductDto productDto);


    DataResult<ProductWithCategoryDetails> findByProductName(String productName);


    DataResult<Product> findByProductNameAndUnitPrice(String productName, int unitPrice);

}
