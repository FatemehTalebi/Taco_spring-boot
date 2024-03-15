package com.technophaa.taco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.technophaa.taco.model.TacoOrder;

@Repository
public interface TacoOrderRepository extends JpaRepository<TacoOrder ,Integer > {

}
