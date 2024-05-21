package org.example.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
    int price;
    String name;

    public Product(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
public class StreamDemo {
    private static List<Product>getProducts(){
        List<Product> p1 = new ArrayList<>();
        p1.add(new Product(25000,"Hp Laptop"));
        p1.add(new Product(30000,"Dell Laptop"));
        p1.add(new Product(45000,"Lenovo Laptop"));
        return p1;
    }

    public static void main(String[] args) {
        //Using Stream API
        List<Product>res = getProducts().stream().filter((product) -> product.getPrice() > 25000).collect(Collectors.toList());
        res.forEach(System.out::println);
    }

}
