package com.company.UI;

import com.company.Product;
import com.company.typesOfProducts.Equipment;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Interface {
    private JPanel mainPanel;
    private JScrollPane scroller;
    private JList<Object> list1;
    private JLabel name;
    private JLabel description;
    private JLabel manufacturer;
    private JLabel number;
    private JLabel price;
    private JButton button1;
    private JButton button2;

    public Interface() {
        JFrame frame = new JFrame();
        frame.setBounds(0, 0, 1000, 600);
        frame.setContentPane(mainPanel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        list1.setListData(Equipment.getInstance().getProductArray().toArray());
        list1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Product product = (Product) list1.getSelectedValue();
                name.setText("Назва продукту: " + product.getName());
                description.setText(product.getDescription());
                manufacturer.setText(product.getManufacturer());
                number.setText(String.valueOf(product.getNumber()));
                price.setText(String.valueOf(product.getPrice()));
            }
        });
    }

}
