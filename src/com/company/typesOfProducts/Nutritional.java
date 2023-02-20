package com.company.typesOfProducts;

import com.company.Product;

import java.util.ArrayList;

public final class Nutritional extends TypeOfProduct {
    private static Nutritional instance;

    public Nutritional() {
        name = "Продовольчі товари";
        description = "Їжа та напої";
    }

    public static Nutritional getInstance() {
        if (instance == null) {
            instance = new Nutritional();
        }
        return instance;
    }
}
