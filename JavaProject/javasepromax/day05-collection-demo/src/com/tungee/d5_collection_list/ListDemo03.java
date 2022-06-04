package com.tungee.d5_collection_list;

import java.util.LinkedList;

public class ListDemo03 {
    public static void main(String[] args) {
        // LinkedList可以完成 队列结构 和 栈结构  （双列表）
        // 栈
        LinkedList<String> stack = new LinkedList<>();
        // 入栈/压栈
        stack.push("first bullet");
        stack.push("second bullet");
        stack.push("third bullet");
        stack.push("fourth bullet");
        System.out.println(stack);
        // 出栈/弹栈
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);

        System.out.println("----------------------------------------------------");

        // 队列
        LinkedList<String> queue = new LinkedList<>();
        // 入队
        queue.addLast("NO.1");
        queue.addLast("NO.2");
        queue.addLast("NO.3");
        queue.addLast("NO.4");
        System.out.println(queue);
        // 出队
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue);

    }
}
