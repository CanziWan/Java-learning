package com.tungee.d13_interface_jdk8;

public interface SportManInter {
    /*
        1、JDK 8开始：默认方法（实例方法）
        -- 必须default修饰，默认用public修饰
        -- 默认方法，接口不能创建对象，这个这个方法只能过继给实现类，由实现类的对象调用
     */
    default void run() {
        // go();
        System.out.println("run");
    }

    /*
        2、静态方法
        -- 必须使用static修饰，默认用public修饰
        -- 接口的静态方法，必须接口名自己调用
     */
    static void inAddr() {
        System.out.println("Java源码自己会用到的");
    }

    /*
        3、私有方法(实例方法)
        -- JDK 1.9开始支持的
        -- 必须在接口内部才能被访问
     */
//    private void go() {
//        System.out.println("go");
//    }

}

/*
    实现类
 */
class PingPongMan implements SportManInter {

}

class Test {
    public static void main(String[] args) {
        PingPongMan p = new PingPongMan();
        p.run();

        SportManInter.inAddr();
        // PingPongMan.inAddr();
    }
}