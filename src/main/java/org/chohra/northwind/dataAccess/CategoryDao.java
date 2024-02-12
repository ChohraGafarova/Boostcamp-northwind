package org.chohra.northwind.dataAccess;

import org.chohra.northwind.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDao extends JpaRepository<Category, Integer> {

    Category findByCategoryName(String categoryname);
    Category findByCategoryNameAndDescription(String categoryName, String description);
    Category findByCategoryId(int categoryId);
}
