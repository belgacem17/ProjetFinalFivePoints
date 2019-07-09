package com.FivePoints.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.FivePoints.demo.entities.Employe;

@Repository("RepositryEmploye")
public interface RepositryEmploye extends JpaRepository<Employe, Integer> {

}
