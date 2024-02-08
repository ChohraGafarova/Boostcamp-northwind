package org.chohra.northwind.dataAccess;

import org.chohra.northwind.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product, Integer> {

}
