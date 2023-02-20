package com.company.UI;

import com.company.Product;
import com.company.others.DefaultData;
import com.company.typesOfProducts.Equipment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UI {
    private JPanel panel1;
    private JList listOfProducts;
    private JComboBox types;
    private JButton adder;
    private JButton button2;
    private JButton button3;
    private JLabel name;
    private JLabel description;
    private JLabel manufacture;
    private JLabel price;
    private JLabel number;

    public static void main(String[] args) {
        DefaultData.addDefaultData();
        JFrame frame = new JFrame("UI");
        frame.setContentPane(new UI().panel1);
        new UI().listOfProducts.setListData(Equipment.getInstance().getProductArray().toArray());
        new UI().listOfProducts.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Product product = (Product) new UI().listOfProducts.getSelectedValue();
                new UI().name.setText("Назва продукту: " + product.getName());
                new UI().description.setText(product.getDescription());
                new UI().manufacture.setText(product.getManufacturer());
                new UI().number.setText(String.valueOf(product.getNumber()));
                new UI().price.setText(String.valueOf(product.getPrice()));
            }
        });
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public UI() {
        DefaultData.addDefaultData();
        JFrame frame = new JFrame("UI");
        frame.setContentPane(panel1);
        listOfProducts.setListData(Equipment.getInstance().getProductArray().toArray());
        listOfProducts.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Product product = (Product) listOfProducts.getSelectedValue();
                name.setText("Назва продукту: " + product.getName());
                description.setText(product.getDescription());
                manufacture.setText(product.getManufacturer());
                number.setText(String.valueOf(product.getNumber()));
                price.setText(String.valueOf(product.getPrice()));
            }
        });
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
