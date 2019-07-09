package com.FivePoints.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.FivePoints.demo.entities.Niveau;

@Repository("RepositryNiveau")
public interface RepositryNiveau extends JpaRepository<Niveau, Integer> {

}
