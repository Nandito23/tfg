package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.pojos.CochesVO;

@Repository("CochesRepo")
public interface CochesRepo extends JpaRepository<CochesVO, Integer> {

}
