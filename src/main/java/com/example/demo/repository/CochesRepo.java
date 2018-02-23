package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.pojos.CochesVO;

public interface CochesRepo extends JpaRepository<CochesVO, Integer> {

}
