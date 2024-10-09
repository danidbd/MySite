package com.example.mysite.repository;

import com.example.mysite.entities.Promo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PromoRepository extends JpaRepository <Promo, Long> {

}
