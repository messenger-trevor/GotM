package com.trevormessenger.GotM.GotM.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Date;

@Entity
@Table(name = "Game")
@Data
public class Game {
    @Id
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private BigDecimal price;
    @Column(name = "date_added")
    private Date date;
    @Column(name = "genre")
    private String genre;
    @Column(name = "description")
    private String description;

    public Game() {
    }

    public Game(String name, BigDecimal price, Date date, String genre, String description) {
        this.name = name;
        this.price = price;
        this.date = date;
        this.genre = genre;
        this.description = description;
    }
}
