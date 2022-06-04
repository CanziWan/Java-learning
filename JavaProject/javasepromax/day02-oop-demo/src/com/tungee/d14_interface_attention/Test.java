package com.tungee.d14_interface_attention;

public class Test {
    public static void main(String[] args) {
        // 1、接口不能创建对象（接口更加彻底的抽象）

        // 2、一个类实现多个接口，多个接口中有同样的静态方法不冲突。 原因是：接口的静态方法不能用实现类名调用，只能用接口名调用

        // 3、一个类继承了父类，同时又实现了接口，父类中和接口中有同名方法，默认用父类的
        Cat c = new Cat();
        c.eat();

        // 4、一个类实现了多个接口，多个接口中存在同名的默认方法，不冲突，这个类重写该方法即可

        // 5、一个接口继承多个接口，是没有问题的，如果多个接口中存在规范冲突则不能多继承

    }
}


// 5、一个接口继承多个接口，是没有问题的，如果多个接口中存在规范冲突则不能多继承
//interface AAA {
//    int run();
//}
//interface BBB {
//    void run();
//}
//interface CCC extends AAA, BBB {
//
//}


// 4、一个类实现了多个接口，多个接口中存在同名的默认方法，不冲突，这个类重写该方法即可
interface AA {
    default void go() {
        System.out.println("AA");
    }
}
interface BB {
    default void go() {
        System.out.println("BB");
    }
}
class CC implements AA, BB {

    @Override
    public void go() {

    }
}




// 3、一个类继承了父类，同时又实现了接口，父类中和接口中有同名方法，默认用父类的
interface Food {
    default void eat() {
        System.out.println("jie kou eat");
    }
}
class Animal {
    public void eat() {
        System.out.println("fu lei eat");
    }
}
class Cat extends Animal implements Food {

}


interface A {
    static void test() {
        System.out.println("A");
    }
}

interface B {
    static void test() {
        System.out.println("B");
    }
}

/*
    2、一个类实现多个接口，多个接口中有同样的静态方法不冲突。 原因是：接口的静态方法不能C调用，只能用接口名调用
 */
class C implements A, B {
}