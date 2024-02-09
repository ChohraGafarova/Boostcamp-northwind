package org.chohra.northwind.business.abstracts;

import org.chohra.northwind.core.utilities.results.DataResult;
import org.chohra.northwind.entities.Category;

import java.util.List;

public interface CategoryService {
    DataResult<List<Category>> getAll();
}
