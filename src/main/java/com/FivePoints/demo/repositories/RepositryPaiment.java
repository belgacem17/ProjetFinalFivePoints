package com.FivePoints.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.FivePoints.demo.entities.Paiments;

@Repository("RepositryPaiment")
public interface RepositryPaiment extends JpaRepository<Paiments, Integer> {

}
