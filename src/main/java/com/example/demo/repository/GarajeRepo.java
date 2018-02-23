package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.pojos.GarajeVO;

public interface GarajeRepo extends JpaRepository<GarajeVO, Integer> {

}
