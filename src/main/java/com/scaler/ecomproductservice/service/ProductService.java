package com.scaler.ecomproductservice.service;
import com.scaler.ecomproductservice.model.Product;

import java.util.List;
public interface ProductService {
    List<Product> getAllProducts();
Product getProductbyId(int id);
Product createProduct(Product product);
Product deleteProduct(int id);
Product updateProduct(int id, Product updateProduct);
}
