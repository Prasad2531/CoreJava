package org.example.inheritance;

public class Box {
    int l;
    int b;

    static void greeting(){
        System.out.println("Greeting from Box class");
    }

    //Default Constructor
    public Box() {
        this.l=-1;
        this.b=-1;
    }

    //Parameterized Constructor
    public Box(int l, int b) {
        System.out.println("Box Class Constructor called!");
        this.l = l;
        this.b = b;
    }

    //Copy Constructor
    public Box(Box old){
        this.l= old.l;
        this.b=old.b;
    }
}
