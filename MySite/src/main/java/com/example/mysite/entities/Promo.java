package com.example.mysite.entities;



import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "promo")
public class Promo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String url;

    public Promo(Long o, String celular, String url) {
    }

    public Promo(long id, String title, String url) {
        this.id = id;
        this.title = title;
        this.url = url;
    }

    public Promo() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Promo promo = (Promo) o;
        return id == promo.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }


}
