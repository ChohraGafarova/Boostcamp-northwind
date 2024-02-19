package org.chohra.northwind.business.concretes;

import lombok.AllArgsConstructor;
import org.chohra.northwind.business.abstracts.ProductService;
import org.chohra.northwind.core.utilities.results.*;
import org.chohra.northwind.dataAccess.CategoryDao;
import org.chohra.northwind.dataAccess.ProductDao;
import org.chohra.northwind.entities.Category;
import org.chohra.northwind.entities.Product;
import org.chohra.northwind.entities.dtos.ProductDto;
import org.chohra.northwind.entities.dtos.ProductWithCategoryDetails;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductManager implements ProductService {
    private ProductDao productDao;
    private CategoryDao categoryDao;

    @Override
    public DataResult<List<Product>> getAll() {
        return new SuccessDataResult<>("Ugurla listelendi.", this.productDao.findAll());
    }

    @Override
    public Result add(ProductDto productDto) {

        Category category = this.categoryDao.findById(productDto.getCategoryId()).orElse(null);


        Product product = new Product(
                        productDto.getProductName(),
                        productDto.getQuantityPerUnit(),
                        productDto.getUnitPrice(),
                        category
                );

        this.productDao.save(product);

        return new SuccessResult("Ugurla save olundu.");
    }

    @Override
    public DataResult<ProductWithCategoryDetails> findByProductName(String productName) {
        Product product = this.productDao.findByProductName(productName);

        if (product==null){
            return new ErrorDataResult<>("Bele adda product yoxdur!");
        }
        else{
            ProductWithCategoryDetails response = new ProductWithCategoryDetails(
                    product.getProductName(),
                    product.getCategory().getCategoryName(),
                    product.getQuantityPerUnit(),
                    product.getUnitPrice()
            );
            return new SuccessDataResult<>("Ugurla tapildi.", response);
        }
    }

    @Override
    public DataResult<Product> findByProductNameAndUnitPrice(String productName, int unitPrice) {
        Product product = this.productDao.findByProductNameAndUnitPrice(productName, unitPrice);

        if (product==null){
            return new ErrorDataResult<>("Bele xususiyyetlerde product yoxdur!");
        }
        else{
            return new SuccessDataResult<>("Ugurla tapildi.", product);
        }
    }


}
