package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.ExcelData;

@Repository
public interface ExcelRepository extends JpaRepository<ExcelData,Integer>
{

}
