package com.FivePoints.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.FivePoints.demo.entities.Condidats;

@Repository("RepositryCandidats")
public interface RepositryCandidats extends JpaRepository<Condidats, Integer> {

	@Query("select c from Condidats c where payer = false")
	public List<Condidats> CondidatsNotPay();
}
