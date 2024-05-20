package com.cart.a2o.repositories;

import com.cart.a2o.entities.check;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface checkRepository extends JpaRepository<check,Long> {
}
