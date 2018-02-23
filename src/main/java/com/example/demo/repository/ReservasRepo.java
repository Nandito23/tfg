package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.pojos.ReservasVO;

public interface ReservasRepo extends JpaRepository<ReservasVO, Integer> {

}
