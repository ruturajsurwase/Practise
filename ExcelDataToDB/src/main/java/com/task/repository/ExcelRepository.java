package com.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.task.model.ExcelData;

@Repository
public interface ExcelRepository extends JpaRepository<ExcelData,Integer> {

}
