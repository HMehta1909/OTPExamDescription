package com.capg.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.model.ExamDescription;

@Repository
public interface ExamRepo extends JpaRepository<ExamDescription, Integer>{
}
