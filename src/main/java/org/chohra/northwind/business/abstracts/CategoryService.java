package org.chohra.northwind.business.abstracts;

import org.chohra.northwind.entities.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
}
