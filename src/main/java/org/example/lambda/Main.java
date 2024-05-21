package org.example.lambda;

public class Main {
    public static void main(String[] args) {
        Sum s = (a,b)->{return a+b;};
        Sum s2 = (x,y) -> x+y;
        System.out.println(s.sum(2,3));
        System.out.println(s2.sum(5,3));
    }
}
