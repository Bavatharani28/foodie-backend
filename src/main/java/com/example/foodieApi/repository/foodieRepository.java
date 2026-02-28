package com.example.foodieApi.repository;

import com.example.foodieApi.foodie;
import org.springframework.data.jpa.repository.JpaRepository;


public interface foodieRepository extends JpaRepository<foodie,Long> {
    public foodie findByFood(String food);
    public void deleteByFood(String food);
    public void deleteById(Long id);
}