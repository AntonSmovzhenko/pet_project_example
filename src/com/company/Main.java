package com.company;

import com.company.UI.Interface;
import com.company.UI.UI;
import com.company.others.DefaultData;
import com.company.typesOfProducts.Nutritional;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        DefaultData.addDefaultData();
        new UI();


    }
}
