package com.FivePoints.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.FivePoints.demo.entities.Charge;

@Repository("RepositryCharge")
public interface RepositryCharge extends JpaRepository<Charge, Integer> {

}
