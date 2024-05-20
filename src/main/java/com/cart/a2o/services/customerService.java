package com.cart.a2o.services;

import com.cart.a2o.entities.customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface customerService {
    customer savecustomer(customer customer);
    customer updatecustomer(customer customer);
    void deletecustomerbyId(Long id);
    void deleteAllcustomer();
    customer getcustomerbyId(Long id);
    List<customer> getAllcustomers();




}
