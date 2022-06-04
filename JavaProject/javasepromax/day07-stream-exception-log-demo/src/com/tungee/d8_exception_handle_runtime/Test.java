package com.tungee.d8_exception_handle_runtime;
/*
    目标：运行时异常的处理机制

    可以不处理，编译阶段不报错
    按照理论规范，建议还是处理，只需要在最外层捕获处理即可
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("------------ begin --------------");
        try {
            chu(10, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("------------- end ---------------");
    }

    public static void chu(int a, int b) {
        System.out.println(a);
        System.out.println(b);
        int c = a / b;
        System.out.println(c);
    }
}
