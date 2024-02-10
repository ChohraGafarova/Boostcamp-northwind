package org.chohra.northwind.business.concretes;

import lombok.AllArgsConstructor;
import org.chohra.northwind.business.abstracts.CategoryService;
import org.chohra.northwind.core.utilities.results.*;
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

    @Override
    public Result add(Category category) {
        this.categoryDao.save(category);
        return new SuccessResult("Ugurla save olundu.");
    }

    @Override
    public DataResult<Category> findByCategoryNameAndDescription(String categoryName, String description) {
        Category category = this.categoryDao.findByCategorytNameAndDescription(categoryName, description);
        if (category == null){
            return new ErrorDataResult<>("Bele adda category yoxdur.");
        }
        else {return new SuccessDataResult<>("Ugurla tapildi.", category);}
    }

    @Override
    public DataResult<Category> findByCategoryName(String categoryName) {
        Category category = this.categoryDao.findByCategorytName(categoryName);

        if (category == null){
            return new ErrorDataResult<>("Bele adda category yoxdur.");
        }
        else {return new SuccessDataResult<>("Ugurla tapildi.", category);}
    }
}
