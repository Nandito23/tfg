package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.pojos.GarajeVO;


/**
 * The Interface GarajeRepo.
 */
@Repository("GarajeRepo")
public interface GarajeRepo extends JpaRepository<GarajeVO, Integer> {

}
