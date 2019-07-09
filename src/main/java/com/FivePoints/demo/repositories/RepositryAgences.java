package com.FivePoints.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.FivePoints.demo.entities.Agences;

@Repository("RepositryAgences")
public interface RepositryAgences extends JpaRepository<Agences, Integer> {

	 @Query("select a from Agences a where a.lieu = ?1")
		public  Agences findByLieu(String lieu);
}
