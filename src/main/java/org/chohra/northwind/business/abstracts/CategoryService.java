package org.chohra.northwind.business.abstracts;

import org.chohra.northwind.core.utilities.results.DataResult;
import org.chohra.northwind.core.utilities.results.Result;
import org.chohra.northwind.entities.Category;

import java.util.List;

public interface CategoryService {
    DataResult<List<Category>> getAll();

    Result add(Category category);

    DataResult<Category> findByCategoryName(String categoryName);
    DataResult<Category> findByCategoryNameAndDescription(String categoryName, String description);
    DataResult<Category> findByCategoryId(int categoryId);
}
