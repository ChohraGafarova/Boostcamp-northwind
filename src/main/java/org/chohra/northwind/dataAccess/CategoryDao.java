package org.chohra.northwind.dataAccess;

import org.chohra.northwind.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDao extends JpaRepository<Category, Integer> {

}
