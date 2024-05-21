package org.example.inheritance;

public class Main {

    public static void main(String[] args) {
        Box box1 = new Box(2,3);
        System.out.println(box1.l+" "+box1.b);

        BoxWeight box2 = new BoxWeight(2,3,4);
        System.out.println(box2.l+" "+box2.b+" "+box2.weight);

        Box box3=new BoxWeight(2,3,4);
        System.out.println(box3.l+" "+box3.b); //Parent class Box does not have any clue
        //regarding child class and its properties, so it only assigns l and b

        //  there are many variables in child and parent class
        // you are given access to variables that are in ref type i.e. here BoxWeight
        // hence you should have access to weight variable
        // this also means that the ones you are trying to access(weight) must be initialised
        // but here object itself is of parent class how will you call constructor of child class
        // thats why it shows error
//        BoxWeight box4= new Box(2,2,4); This does not work as parent constructor does not have weight
        //field which is required for BoxWeight object

        BoxWeight b1 = new BoxWeight(3);
        System.out.println(b1.weight);

        BoxWeight b2 = b1;
        System.out.println(b2.weight);

        BoxPrice bp1 = new BoxPrice(1,2,3,4);
        System.out.println(bp1.l+" "+bp1.b+" "+bp1.weight+" "+ bp1.price);

//        Box.greeting();
        Box boxi = new BoxWeight();//Ref variable tells which function it can access and object tells which implementation to use
        boxi.greeting(); // did not override greeting method

//        BoxWeight.greeting();
        BoxWeight boxw = new BoxWeight();
        boxw.greeting();

    }


}
