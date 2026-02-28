package com.example.foodieApi;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class foodie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String food;
    private Float price;
    private Integer quantity;
    private String add_ons;
    public foodie(){}
    public foodie(String food,Float price,Integer quantity,String add_ons){
        this.food=food;
        this.price=price;
        this.quantity=quantity;
        this.add_ons=add_ons;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getAdd_ons() {
        return add_ons;
    }

    public void setAdd_ons(String add_ons) {
        this.add_ons = add_ons;
    }
}
