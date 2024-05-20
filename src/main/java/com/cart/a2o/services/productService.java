package com.cart.a2o.services;

import com.cart.a2o.entities.product;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface productService {
    product saveproduct(product product);

    product updateproduct(product product);

    void deleteproductbyId(Long id);
    void deleteAllproducts();

    void deleteAllproduct();

    product getproductbyId(Long id);
    List<product> getAllproducts();

    Object getAllProducts();
}
