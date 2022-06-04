package com.tungee.d9_abstract_template;
/*
    学生类
 */
public abstract class Student {
    /*
        正式声明了模板方法模式
     */
    public final void write() {
        System.out.println("\t\t\t\t《我的大学》");
        System.out.println("你的大学是啥样，来说说：");

        // 正文部分（每个子类都要写的，每个子类写的情况不一样）
        // 因此，模板方法把正文部分定义成抽象方法，交给具体的子类来完成
        System.out.println(writeMain());

        System.out.println("结尾一样");
    }

    public abstract String writeMain();
}
