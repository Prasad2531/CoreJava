package org.example.inheritance;

public class BoxPrice extends BoxWeight{
    int price;
    BoxPrice(int l,int b,int weight,int price){
        super(l,b,weight);
        System.out.println("BoxPrice Constructor called!!");
        this.price=price;

    }
}
