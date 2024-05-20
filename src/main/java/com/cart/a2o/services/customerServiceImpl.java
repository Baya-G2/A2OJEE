package com.cart.a2o.services;

import com.cart.a2o.entities.customer;
import com.cart.a2o.repositories.customerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class customerServiceImpl implements customerService{
    private customerRepository customerRepository;
    @Override
    public customer savecustomer(customer customer) {

        return customerRepository.save(customer);
    }

    @Override
    public customer updatecustomer(customer customer) {
        return customerRepository.save(customer);

    }

    @Override
    public void deletecustomerbyId(Long id) {
        customerRepository.deleteById(id);

    }

    @Override
    public void deleteAllcustomer() {
        customerRepository.deleteAll();


    }

    @Override
    public customer getcustomerbyId(Long id) {
        return customerRepository.findById(id).get();
    }

    @Override

    public List<customer> getAllcustomers() {
        return customerRepository.findAll();

    }
}
