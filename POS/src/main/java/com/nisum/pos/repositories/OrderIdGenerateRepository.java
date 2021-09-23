package com.nisum.pos.repositories;

import com.nisum.pos.entities.OrderIdGenerate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderIdGenerateRepository extends JpaRepository<OrderIdGenerate,Integer> {
}
