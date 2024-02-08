package org.chohra.northwind.business.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.chohra.northwind.business.abstracts.ProductService;
import org.chohra.northwind.dataAccess.ProductDao;
import org.chohra.northwind.entities.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductManager implements ProductService {

    private ProductDao productDao;
    @Override
    public List<Product> getAll() {

        List<Product> products = this.productDao.findAll();

        return products;
    }
}
