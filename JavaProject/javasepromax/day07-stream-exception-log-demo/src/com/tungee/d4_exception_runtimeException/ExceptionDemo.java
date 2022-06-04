package com.tungee.d4_exception_runtimeException;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("------------ begin --------------");
        // 1、数组索引越界异常：ArrayIndexOutOfBoundsException
        int[] arr = {1, 2, 3};
        System.out.println(arr[2]);
        // System.out.println(arr[3]); // 运行出错，程序终止

        // 2、空指针异常：NullPointerException
        String name = null;
        System.out.println(name); // null
        // System.out.println(name.length()); // 运行出错，程序终止

        // 3、类型转换异常：ClassCastException
        Object o = 23;
        // String s = (String) o; // 运行出错，程序终止

        // 4、数学操作异常：ArithmeticException
        // int c = 10 / 0; // 运行出错，程序终止

        // 5、数字转换异常：NumberFormatException
        // String number = "23";
        String number = "23aabb";
        // Integer it = Integer.valueOf(number); // 运行出错，程序终止
        // System.out.println(it + 1);


        System.out.println("------------- end ---------------");
    }
}
