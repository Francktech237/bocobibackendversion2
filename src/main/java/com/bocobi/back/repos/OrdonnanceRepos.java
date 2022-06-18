package com.bocobi.back.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bocobi.back.models.Ordonnance;

public interface OrdonnanceRepos extends JpaRepository<Ordonnance, Long> {

}
