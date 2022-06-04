package com.tungee.d11_genericity_limit;

import java.util.ArrayList;

public class GenericDemo {
    public static void main(String[] args) {
        ArrayList<BMW> bmws = new ArrayList<>();
        bmws.add(new BMW());
        bmws.add(new BMW());
        bmws.add(new BMW());
        go(bmws);

        ArrayList<BENZ> benzs = new ArrayList<>();
        benzs.add(new BENZ());
        benzs.add(new BENZ());
        benzs.add(new BENZ());
        go(benzs);

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        // go(dogs);
    }

    /*
        所有车比赛
     */
    public static void go(ArrayList<? extends Car> cars) {

    }
}

class Dog {

}

class BENZ extends Car {

}

class BMW extends Car {

}

// 父类
class Car {

}