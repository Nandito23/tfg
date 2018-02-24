package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.pojos.ReservasVO;


@Repository("ReservasRepo")
public interface ReservasRepo extends JpaRepository<ReservasVO, Integer> {

}
