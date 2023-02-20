package com.company.typesOfProducts;

import com.company.Product;

import java.util.ArrayList;

public abstract class TypeOfProduct {
    public String name;
    public String description;
    public ArrayList<Product> productArray = new ArrayList<>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Product> getProductArray() {
        return productArray;
    }

    public void setProductArray(ArrayList<Product> productArray) {
        this.productArray = productArray;
    }

    @Override
    public String toString() {
        return name;
    }
}
