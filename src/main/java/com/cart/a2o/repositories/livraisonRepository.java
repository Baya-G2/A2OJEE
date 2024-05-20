package com.cart.a2o.repositories;

import com.cart.a2o.entities.livraison;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface livraisonRepository extends JpaRepository<livraison,Long> {
}
