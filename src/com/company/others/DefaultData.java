package com.company.others;

import com.company.Product;
import com.company.typesOfProducts.Equipment;
import com.company.typesOfProducts.NonFood;
import com.company.typesOfProducts.Nutritional;

import java.util.ArrayList;

public class DefaultData {
    static ArrayList<Product> nonFoodProducts = new ArrayList<>();
    static ArrayList<Product> nutritionalProducts = new ArrayList<>();
    static ArrayList<Product> equipmentProducts = new ArrayList<>();

    public static void addDefaultData() {
        Product nonFoodProduct1 = new Product("сорочка", "в клітинку", "Zara", 3,
                499);
        Product nonFoodProduct2 = new Product("джинси", "прямі", "GAP", 4,
                899);
        Product nonFoodProduct3 = new Product("футболка", "біла", "Ostin", 5,
                399);
        Product nutritionalProduct1 = new Product("морозиво", "пломбір", "Рудь", 20,
                15);
        Product nutritionalProduct2 = new Product("шоколадка", "з горіхами", "Корона", 15,
                25);
        Product nutritionalProduct3 = new Product("молоко", "жирність 1.5%", "Селянське", 10,
                35);
        Product equipmentProduct1 = new Product("телевізор", "діагональ 20'", "Samsung", 5,
                10.000);
        Product equipmentProduct2 = new Product("колонка", "найкращий звук", "JBL", 10,
                2000);
        Product equipmentProduct3 = new Product("мікрохвильовка", "потужна", "Samsung", 5,
                5000);

        nonFoodProducts.add(nonFoodProduct1);
        nonFoodProducts.add(nonFoodProduct2);
        nonFoodProducts.add(nonFoodProduct3);
        nutritionalProducts.add(nutritionalProduct1);
        nutritionalProducts.add(nutritionalProduct2);
        nutritionalProducts.add(nutritionalProduct3);
        equipmentProducts.add(equipmentProduct1);
        equipmentProducts.add(equipmentProduct2);
        equipmentProducts.add(equipmentProduct3);
        equipmentProducts.add(equipmentProduct1);
        equipmentProducts.add(equipmentProduct2);
        equipmentProducts.add(equipmentProduct3);
        equipmentProducts.add(equipmentProduct1);
        equipmentProducts.add(equipmentProduct2);
        equipmentProducts.add(equipmentProduct3);
        equipmentProducts.add(equipmentProduct1);
        equipmentProducts.add(equipmentProduct2);
        equipmentProducts.add(equipmentProduct3);
        equipmentProducts.add(equipmentProduct1);
        equipmentProducts.add(equipmentProduct2);
        equipmentProducts.add(equipmentProduct3);
        equipmentProducts.add(equipmentProduct1);
        equipmentProducts.add(equipmentProduct2);
        equipmentProducts.add(equipmentProduct3);
        equipmentProducts.add(equipmentProduct1);
        equipmentProducts.add(equipmentProduct2);
        equipmentProducts.add(equipmentProduct3);
        equipmentProducts.add(equipmentProduct1);
        equipmentProducts.add(equipmentProduct2);
        equipmentProducts.add(equipmentProduct3);
        equipmentProducts.add(equipmentProduct1);
        equipmentProducts.add(equipmentProduct2);
        equipmentProducts.add(equipmentProduct3);
        equipmentProducts.add(equipmentProduct1);
        equipmentProducts.add(equipmentProduct2);
        equipmentProducts.add(equipmentProduct3);
        equipmentProducts.add(equipmentProduct1);
        equipmentProducts.add(equipmentProduct2);
        equipmentProducts.add(equipmentProduct3);
        equipmentProducts.add(equipmentProduct1);
        equipmentProducts.add(equipmentProduct2);
        equipmentProducts.add(equipmentProduct3);

        Equipment.getInstance().setProductArray(equipmentProducts);
        NonFood.getInstance().setProductArray(nonFoodProducts);
        Nutritional.getInstance().setProductArray(nutritionalProducts);
    }
}
