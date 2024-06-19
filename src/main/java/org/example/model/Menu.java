package org.example.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Menu")
public class Menu {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Column(name = "price")
    private int price;

    @OneToOne
    @JoinColumn(name = "dish_id", referencedColumnName = "id")
    private Dish dish;

    public Menu() {}

    public Menu(int id, int price) {
        this.id = id;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() { return price; }

    public void setPrice(int price) { this.price = price; }

    public Dish getDish() { return dish; }

    public void setDish(Dish dish) { this.dish = dish; }


}
