package org.example.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shape s = new Shape();
        Circle c = new Circle();

        Shape c1 = new Circle();   //new Circle() creates obj so it decides which func to run
        c1.area();

//        s.area();
//        c.area();
    }
}
