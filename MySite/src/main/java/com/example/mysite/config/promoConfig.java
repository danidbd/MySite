package com.example.mysite.config;

import com.example.mysite.entities.Promo;
import com.example.mysite.repository.PromoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.lang.reflect.Array;
import java.util.Arrays;

@Configuration
@Profile("MySite")
public class promoConfig implements CommandLineRunner {

    @Autowired
    private PromoRepository promoRepository;


    @Override
    public void run(String... args) throws Exception {

       Promo p1 = new Promo(null, "tv", "https://www.mercadolivre.com.br/smart-tv-samsung-55-4k-uhd-hdr10-tizen-wifi5-bluetooth-alexa-bixby-lh55be-preto/p/MLB39228443?pdp_filters=item_id:MLB3810617515#wid=MLB3810617515&sid=search&is_advertising=true&searchVariation=MLB39228443&position=1&search_layout=grid&type=pad&tracking_id=0c836988-2f12-44f7-9c4a-8791b557e6f4&is_advertising=true&ad_domain=VQCATCORE_LST&ad_position=1&ad_click_id=YmM1NzU5NDEtNTA3MS00N2Y0LTg4ZGMtNzU3YWZhNDhjOWIx");
       Promo p2 = new Promo(null, "Celular", "https://www.mercadolivre.com.br/samsung-galaxy-s24-ultra-5g-dual-sim-1-tb-titnio-cinza-12-gb-ram/p/MLB29893916#wid%3DMLB3866030189%26sid%3Dsearch%26searchVariation%3DMLB29893916%26position%3D2%26search_layout%3Dstack%26type%3Dproduct%26tracking_id%3D825359e4-636b-43fc-aa8f-5f4672b93ad6" );

        promoRepository.saveAll(Arrays.asList(p1, p2));
    }
}
