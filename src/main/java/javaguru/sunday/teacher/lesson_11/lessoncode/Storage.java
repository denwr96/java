package main.java.javaguru.sunday.teacher.lesson_11.lessoncode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Storage {

    private List<Product> storage = new ArrayList<>();

    public void addProduct(Product newProduct) {
        storage.add(newProduct);
    }

    public Product getProduct(Product product) {
        for (Product storedProduct : storage) {
            if (storedProduct.equals(product)) {
                return storedProduct;
            }
        }
        return null;
    }

    public Product getProduct(String name) {
        for (Product storedProduct : storage) {
            if (storedProduct.getName().equals(name)) {
                return storedProduct;
            }
        }
        return null;
    }

    public List<Product> copyStorage() {
        List<Product> newList = new ArrayList<>(storage);
        return newList;
    }

}
