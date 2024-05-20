package com.cart.a2o.repositories;

import com.cart.a2o.entities.category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface catgoryRepository extends JpaRepository<category,Long> {
}
