package com.cart.a2o.repositories;

import com.cart.a2o.entities.payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface paymentRepository extends JpaRepository<payment,Long> {
}
