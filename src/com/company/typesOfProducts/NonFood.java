package com.company.typesOfProducts;

import com.company.Product;

import java.util.ArrayList;

public class NonFood extends TypeOfProduct {

    private static NonFood instance;

    private NonFood() {
        name = "Неродовольчі товари";
        description = "Одяг, меблі, кухонне приладдя";
    }

    public static NonFood getInstance() {
        if (instance == null) {
            instance = new NonFood();
        }
        return instance;
    }
}
