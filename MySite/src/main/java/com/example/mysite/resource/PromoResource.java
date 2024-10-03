package com.example.mysite.resource;

import com.example.mysite.entities.Promo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/promo")
public class PromoResource {

    @GetMapping
    public ResponseEntity<Promo> FindAll() {
        Promo promo = new Promo(1, "smartphone", "https://www.googleadservices.com/pagead/aclk?sa=L&ai=DChcSEwjSxOSm_PKIAxXtVEgAHdueDmAYABAWGgJjZQ&co=1&gclid=CjwKCAjwgfm3BhBeEiwAFfxrG02iaD1eykREyowJ0WCq9doelSB39noj1dDm9Ttn_Vry8ik4SLEg1RoC6U8QAvD_BwE&ohost=www.google.com&cid=CAESVuD2GZb-k1Lf6PS6WHBN2dU6-bQeBp7c8HzA_t0soWS5Bq7SWtwRLmwqjmThSbM5p94VT7mlkcWHMVOdu6nQe26biC4kNvkus_UBofHWVR_ESJSFJEPY&sig=AOD64_2HUH5n-N_lrv-Pa1_ljhECrljj-g&ctype=5&q=&ved=2ahUKEwjU8t6m_PKIAxXnrZUCHauACPwQww8oAnoECAUQDA&adurl=");
        return ResponseEntity.ok(promo);
    }

}
