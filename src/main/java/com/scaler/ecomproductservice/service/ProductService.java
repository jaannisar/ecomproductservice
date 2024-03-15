package com.scaler.ecomproductservice.service;
import com.scaler.ecomproductservice.dto.ProductListResponseDTO;
import com.scaler.ecomproductservice.dto.ProductResponseDTO;
import com.scaler.ecomproductservice.model.Product;

import java.util.List;
public interface ProductService {
    ProductListResponseDTO getAllProducts();
ProductResponseDTO getProductbyId(int id);
Product createProduct(Product product);
Product deleteProduct(int id);
Product updateProduct(int id, Product updateProduct);
}
