package org.example.model;


import jakarta.persistence.*;




@Entity
@Table(name = "Order")
public class OrderingADish {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "price")
    private float price;


    @ManyToOne
    @JoinColumn(name = "dish_id", referencedColumnName = "id")
    private Dish dish;

    @OneToOne
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private Order order;


    public OrderingADish() {}

    public OrderingADish(int id) {
        this.id = id;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
