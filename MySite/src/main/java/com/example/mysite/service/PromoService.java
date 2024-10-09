package com.example.mysite.service;

import com.example.mysite.entities.Promo;
import com.example.mysite.repository.PromoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PromoService {

    @Autowired
    private PromoRepository promoRepository;

    public List<Promo> findAll() {
        return promoRepository.findAll();
    }

    public Promo findById(Long id) {
        Optional<Promo> obj = promoRepository.findById(id);
        return obj.get();
    }


}
