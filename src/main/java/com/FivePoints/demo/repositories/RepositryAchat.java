package com.FivePoints.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.FivePoints.demo.entities.Achat;

@Repository("RepositryAchat")
public interface RepositryAchat extends JpaRepository<Achat, Integer> {

}
