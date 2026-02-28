package com.example.foodieApi.service;
import com.example.foodieApi.foodie;
import org.springframework.stereotype.Service;
import com.example.foodieApi.repository.foodieRepository;


import java.util.List;
import java.util.Optional;

@Service
public class foodieservice {
    private final foodieRepository repo;

    public foodieservice(foodieRepository repo) {
        this.repo=repo;
    }
    public foodie save(foodie food) {
        return repo.save(food);
    }

    public List<foodie> findAll() {
        return repo.findAll();
    }

    public Optional<foodie> findById(Long id) {
        return repo.findById(id);
    }

    public foodie findByFood(String food) {
        return repo.findByFood(food);
    }
    public void deleteByFood(String food){
        repo.deleteByFood(food);
    }
    public void deleteById(Long id){
        repo.deleteById(id);
    }

    }


