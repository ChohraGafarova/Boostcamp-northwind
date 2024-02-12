package org.chohra.northwind.business.concretes;

import lombok.AllArgsConstructor;
import org.chohra.northwind.business.abstracts.ProductService;
import org.chohra.northwind.core.utilities.results.*;
import org.chohra.northwind.dataAccess.ProductDao;
import org.chohra.northwind.entities.Category;
import org.chohra.northwind.entities.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductManager implements ProductService {
    private ProductDao productDao;

    @Override
    public DataResult<List<Product>> getAll() {
        return new SuccessDataResult<>("Ugurla listelendi", this.productDao.findAll()) ;
    }

    @Override
    public Result add(Product product) {
        this.productDao.save(product);
        return new SuccessResult("Ugurla save olundu.");
    }

    @Override
    public DataResult<Product> findByProductName(String productName) {
        Product product = this.productDao.findByProductName(productName);
        if (product == null){
            return new ErrorDataResult<>("Bele adda product yoxdur.");
        }
        else {return new SuccessDataResult<>("Ugurla tapildi.", product);}
    }

    @Override
    public DataResult<Product> findByProductId(int productId) {
        Product product = this.productDao.findByProductId(productId);
        if (productId <= 5){
            return new SuccessDataResult<>("Ugurla tapildi.", product);
        }
        else {return new ErrorDataResult<>("Bele idde product yoxdur.");}
    }
}
