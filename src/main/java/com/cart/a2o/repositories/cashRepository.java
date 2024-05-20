package com.cart.a2o.repositories;

import com.cart.a2o.entities.cash;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface cashRepository extends JpaRepository<cash,Long> {
}
