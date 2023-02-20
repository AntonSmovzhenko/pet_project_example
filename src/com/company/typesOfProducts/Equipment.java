package com.company.typesOfProducts;

import com.company.Product;

import java.util.ArrayList;

public class Equipment extends TypeOfProduct{

    private static Equipment instance;

    public Equipment() {
        name = "Техніка";
        description = "Технічні прилади";
    }

    public static Equipment getInstance() {
        if (instance == null) {
            instance = new Equipment();
        }
        return instance;
    }
}
