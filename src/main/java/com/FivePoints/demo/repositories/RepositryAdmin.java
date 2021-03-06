package com.FivePoints.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.FivePoints.demo.entities.Admin;

@Repository("RepositryAdmin")
public interface RepositryAdmin extends JpaRepository<Admin, Integer> {

}
