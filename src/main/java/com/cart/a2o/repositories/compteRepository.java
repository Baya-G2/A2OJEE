package com.cart.a2o.repositories;

import com.cart.a2o.entities.compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface compteRepository extends JpaRepository <compte,Long>{
}
