package com.tungee.returndemo;

public class ReturnDemo {
    public static void main(String[] args) {
        System.out.println("开始");
        chu(19,0);
        chu(20,2);
        System.out.println("结束");
    }

    public static void chu(int a, int b) {
        if (b == 0){
            System.out.println("对不起，您输入的数据有误！");
            return;  // 立即跳出当前方法，并结束当前方法的执行
        }else {
            int c = a / b;
            System.out.println(c);
        }
    }
}
