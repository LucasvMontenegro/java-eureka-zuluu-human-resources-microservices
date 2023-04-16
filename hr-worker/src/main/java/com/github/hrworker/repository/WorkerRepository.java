package com.github.hrworker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.hrworker.entity.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
