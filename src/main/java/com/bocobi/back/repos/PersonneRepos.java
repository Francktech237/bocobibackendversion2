package com.bocobi.back.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bocobi.back.models.Personne;

public interface PersonneRepos extends JpaRepository<Personne, Long> {

}
