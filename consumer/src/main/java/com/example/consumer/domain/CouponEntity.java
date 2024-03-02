package com.example.consumer.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "coupon")
public class CouponEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private Long userId;

    public CouponEntity() {
    }

    public CouponEntity(Long userId) {
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }
}