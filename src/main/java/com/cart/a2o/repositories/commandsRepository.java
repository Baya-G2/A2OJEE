package com.cart.a2o.repositories;

import com.cart.a2o.entities.commands;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface commandsRepository extends JpaRepository<commands,Long> {
}
