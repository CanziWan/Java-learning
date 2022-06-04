package com.tungee.d9_genericity_method;
/*
    小结:泛型方法可以让方法更灵活的接收数据,可以做通用技术!
 */
public class GenericDemo {
    public static void main(String[] args) {
        String[] names = {"jia", "yi", "bing"};
        printArray(names);

        Integer[] ages = {10, 20, 30};
        printArray(ages);

        Integer[] ages2 = getArray(ages);
        String[] names2 = getArray(names);
    }

    public static <T> T[] getArray(T[] t) {
        return t;
    }

    public static <T> void printArray(T[] t) {
        if (t != null) {
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < t.length; i++) {
                sb.append(t[i]).append(i != t.length - 1 ? ", ": "");
            }
            sb.append("]");
            System.out.println(sb);
        }else {
            System.out.println(t);
        }
    }

}
