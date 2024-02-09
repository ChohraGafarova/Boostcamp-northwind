package org.chohra.northwind.business.abstracts;

import org.chohra.northwind.entities.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAll();
}
