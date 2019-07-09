package com.FivePoints.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.FivePoints.demo.entities.Agences;
import com.FivePoints.demo.entities.Finance;

@Repository("RepositryFinance")
public interface RepositryFinance extends JpaRepository<Finance, Integer> {
	/*-------------CRUD SPECIFIQUE-------------*/
	@Query("select f from Finance f where f.agences.id= ?1")
	public Finance findByAgences(int  id);
}
