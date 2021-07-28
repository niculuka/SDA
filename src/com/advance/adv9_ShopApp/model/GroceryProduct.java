package com.advance.adv9_ShopApp.model;

import java.time.Instant;
import java.util.Date;

public class GroceryProduct extends FoodProduct {
    private String id;
    private Double price;
    private String currency;
    private String name;
    private String description;

    public GroceryProduct(
            Date expirationDate,
            boolean isBio,
            String countryOfOrigin,
            String id, Double price,
            String currency,
            String name,
            String description
    ){
        super(expirationDate, isBio, countryOfOrigin);
        this.id = id;
        if (price != null && price > 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Invalid price!");
        }
        this.currency = currency;
        this.name = name;
        this.description = description;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getCurrency() {
        return currency;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "GroceryProduct{" +
                "id='" + id + '\'' +
                ", price=" + price +
                ", currency='" + currency + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
