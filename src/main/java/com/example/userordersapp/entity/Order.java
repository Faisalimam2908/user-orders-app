package com.example.userordersapp.entity;

import jakarta.persistence.*;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String product;

    private Double amount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    // --- Getters ---
    public Long getId() {
        return id;
    }

    public String getProduct() {
        return product;
    }

    public Double getAmount() {
        return amount;
    }

    public User getUser() {
        return user;
    }

    // --- Setters ---
    public void setId(Long id) {
        this.id = id;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
