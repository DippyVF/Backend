package org.example.model;

import jakarta.persistence.*;

@Entity
@Table(name = "order")
public class Order {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "address")
    private int address;

    @Column(name = "full_price")
    private float full_price;

    @OneToOne(mappedBy = "order")
    public OrderingADish orderingADish;

    public Order() {}

    public Order(int id, int address, int full_price) {
        this.id = id;
        this.address = address;
        this.full_price = full_price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    public float getFull_price() {
        return full_price;
    }

    public void setFull_price(int full_price) {
        this.full_price = full_price;
    }

}
