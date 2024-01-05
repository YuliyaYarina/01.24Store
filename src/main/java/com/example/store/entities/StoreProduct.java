package com.example.store.entities;
public class StoreProduct {

    private final Integer id;
    public final String name;

    public StoreProduct(Integer id) {
        this.id = id;
        this.name = "product " + id.toString();
    }

    @Override
    public String toString() {
        return "StoreProduct{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
