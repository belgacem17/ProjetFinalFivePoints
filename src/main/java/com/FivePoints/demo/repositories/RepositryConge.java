package com.FivePoints.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.FivePoints.demo.entities.Conge;

@Repository("RepositryConge")
public interface RepositryConge extends JpaRepository<Conge, Integer> {

}
