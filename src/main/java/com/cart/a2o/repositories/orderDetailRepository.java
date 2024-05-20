package com.cart.a2o.repositories;

import com.cart.a2o.entities.orderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface orderDetailRepository extends JpaRepository <orderDetail,Long>{
}
