package org.example.inheritance;

public class BoxWeight extends Box{
    int weight;

    static void greeting(){
        System.out.println("Greeting from BoxWeight class");
    }

    public BoxWeight(int l, int b, int weight) {
        super(l, b); //call parent class constructor(should be at top)
        System.out.println("BoxWeight Constructor called!!");
        this.weight = weight;
    }

    BoxWeight(BoxWeight other){
        super(other);
        weight=other.weight;
    }

    public BoxWeight() {
        this.weight=-1;
    }

    public BoxWeight(int weight) {
        this.weight = weight;
    }
}
