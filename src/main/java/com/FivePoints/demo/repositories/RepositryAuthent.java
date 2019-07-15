package com.FivePoints.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.FivePoints.demo.entities.Achat;
import com.FivePoints.demo.entities.Authentification;

@Repository("RepositryAuthent")
public interface RepositryAuthent extends JpaRepository<Authentification, Integer> {

}
