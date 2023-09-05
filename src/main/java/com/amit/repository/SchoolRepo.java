package com.amit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amit.entity.School;

public interface SchoolRepo extends JpaRepository<School, Integer> {

}
