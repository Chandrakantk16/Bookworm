package com.example.BookWorm.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.BookWorm.models.RoyaltyCalculation;

@Repository
public interface RoyaltyCalculationRepository extends JpaRepository<RoyaltyCalculation, Integer> {
}
