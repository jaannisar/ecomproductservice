package com.scaler.ecomproductservice.service;

import com.scaler.ecomproductservice.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ProductService")
public class ProductServiceImpl implements ProductService{
    @Override
    public List<Product> getAllProducts() {
        return null;
    }

    @Override
    public Product getProductbyId(int id) {
        return null;
    }

    @Override
    public Product createProduct(Product product) {
        return null;
    }

    @Override
    public Product deleteProduct(int id) {
        return null;
    }

    @Override
    public Product updateProduct(int id, Product updateProduct) {
        return null;
    }
}
