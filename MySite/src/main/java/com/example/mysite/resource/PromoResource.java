package com.example.mysite.resource;

import com.example.mysite.entities.Promo;
import com.example.mysite.repository.PromoRepository;
import com.example.mysite.service.PromoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/promo")
public class PromoResource {

    @Autowired
    private PromoService promoService;


    @GetMapping
    public ResponseEntity<Promo> FindAll() {
        List<Promo> promos = promoService.findAll();
        return ResponseEntity.ok().body(promos.get(0));
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Promo> FindById(@PathVariable Long id) {
        Promo obj = promoService.findById(id);
        return ResponseEntity.ok().body(obj);

    }


}
