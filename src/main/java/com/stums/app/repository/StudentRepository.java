package com.stums.app.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.data.jpa.repository.Query; 
import org.springframework.stereotype.Repository;

import com.stums.app.pojos.StudentPOJO;
  
  @Repository public interface StudentRepository extends
  JpaRepository<StudentPOJO,Integer> {
  
  @Query("select s from studentpojo s " +
  "where s.feesPaid=1")
  List<StudentPOJO> search();
  
  List<StudentPOJO> findAll(); }
 
