package com.FivePoints.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.FivePoints.demo.entities.Formation;

@Repository("RepositryFormation")
public interface RepositryFormation extends JpaRepository<Formation, Integer> {

}
