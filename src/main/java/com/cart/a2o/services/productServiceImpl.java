package com.cart.a2o.services;

import com.cart.a2o.entities.product;
import com.cart.a2o.repositories.productRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class productServiceImpl implements productService{
    private productRepository productRepository;
        @Override
        public product saveproduct(product product) {

            return productRepository.save(product);
        }

        @Override
        public product updateproduct(product product) {
            return productRepository.save(product);

        }

        @Override
        public void deleteproductbyId(Long id) {
            productRepository.deleteById(id);

        }

    @Override
    public void deleteAllproducts() {

    }

    @Override
        public void deleteAllproduct() {
            productRepository.deleteAll();


        }

        @Override
        public product getproductbyId(Long id) {
            return productRepository.findById(id).get();
        }

        @Override
        public List<product> getAllproducts() {
            return productRepository.findAll();

        }

    @Override
    public Object getAllProducts() {
        return null;
    }
}



