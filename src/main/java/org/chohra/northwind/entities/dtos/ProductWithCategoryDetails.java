package org.chohra.northwind.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ProductWithCategoryDetails {

    private String productName;
    private String categoryName;
    private String quantityPerUnit;
    private int unitPrice;

}
