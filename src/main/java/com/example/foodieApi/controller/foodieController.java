package com.example.foodieApi.controller;
import com.example.foodieApi.foodie;
import com.example.foodieApi.service.foodieservice;
import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/food")
public class foodieController {
    private final foodieservice service;
    public foodieController(foodieservice service){
        this.service=service;
    }
    @PostMapping
    public foodie add(@RequestParam String food,@RequestParam Integer quantity,@RequestParam Float price,@RequestParam String add_ons){
        foodie foods=new foodie();
        foods.setFood(food);
        foods.setQuantity(quantity);
        foods.setPrice(price);
        foods.setAdd_ons(add_ons);
        return service.save(foods);
    }
    @GetMapping
    public List<foodie> getAll(){
        return service.findAll();
    }
    @GetMapping("/id_get/{id}")
    public foodie getById(@PathVariable Long id) {
        return service.findById(id).orElse(null);
    }
    @GetMapping("/food_get/{food}")
    public foodie getByfood(@PathVariable String food){
        return service.findByFood(food);
    }
    @Transactional
    @DeleteMapping("/food_delete/{food}")
    public void deleteByfood(@PathVariable String food){
        service.deleteByFood(food);
    }
    @Transactional
    @DeleteMapping("/id_delete/{id}")
    public void deleteById(@PathVariable Long id){
        service.deleteById(id);
    }

}
