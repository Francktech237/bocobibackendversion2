package com.bocobi.back.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bocobi.back.models.Employe;

public interface EmployeRepos extends JpaRepository<Employe, Long> {

}
