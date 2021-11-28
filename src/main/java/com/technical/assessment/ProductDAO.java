package com.technical.assessment;

import org.springframework.stereotype.Repository;

@Repository
public class ProductDAO {

    private static Products list = new Products();

    static
    {
        list.getProductList().add(new Product("Lazada", "Small"));
    }

    public Products getAllProducts()
    {
        return list;
    }

    public void addProduct(Product product) {
        list.getProductList().add(product);
    }

}