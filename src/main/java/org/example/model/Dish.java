package org.example.model;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Dish")
public class Dish {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @OneToOne(mappedBy = "Dish")
    private Menu menu;

    @OneToMany(mappedBy = "dish")
    private List<OrderingADish> orderingADish;

    public Dish() {}

    public Dish(int id, String description, String name) {
        this.id = id;
        this.description = description;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
