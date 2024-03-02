package com.example.consumer.repository;

import com.example.consumer.domain.CouponEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponRepository extends JpaRepository<CouponEntity, Long> {

}
