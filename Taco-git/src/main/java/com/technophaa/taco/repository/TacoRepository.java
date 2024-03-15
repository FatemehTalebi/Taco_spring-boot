package com.technophaa.taco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.technophaa.taco.model.Taco;

@Repository
public interface TacoRepository extends JpaRepository<Taco, Long>{

}
