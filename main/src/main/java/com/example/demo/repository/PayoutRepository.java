/**
 * 
 */
package com.example.demo.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Payout;

@Repository
public interface PayoutRepository extends JpaRepository<Payout, Long> {
    List<Payout> findByDateBetweenOrderByDateAscClassificationAscAmountAsc(LocalDate start, LocalDate end);
}
