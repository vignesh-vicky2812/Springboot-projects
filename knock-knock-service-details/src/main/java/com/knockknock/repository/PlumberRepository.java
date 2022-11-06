package com.knockknock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.knockknock.model.Plumber;

public interface PlumberRepository extends JpaRepository<Plumber, Long>{ }