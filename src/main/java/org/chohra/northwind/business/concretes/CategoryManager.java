package org.chohra.northwind.business.concretes;

import lombok.AllArgsConstructor;
import org.chohra.northwind.business.abstracts.CategoryService;
import org.chohra.northwind.core.utilities.results.DataResult;
import org.chohra.northwind.core.utilities.results.SuccessDataResult;
import org.chohra.northwind.dataAccess.CategoryDao;
import org.chohra.northwind.entities.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoryManager implements CategoryService {

    private CategoryDao categoryDao;
    @Override
    public DataResult<List<Category>> getAll() {

        return new SuccessDataResult<>("Ugurla listelendi", this.categoryDao.findAll()) ;

    }
}
