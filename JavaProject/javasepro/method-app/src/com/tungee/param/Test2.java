package com.tungee.param;

public class Test2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 2, 3, 4};
        int[] arr3 = {1, 3, 4, 6};
        int[] arr4 = {1, 3};
        boolean bool1 = compareTowArray(arr1,arr2);
        boolean bool2 = compareTowArray(arr1,arr3);
        boolean bool3 = compareTowArray(arr1,arr4);
        System.out.println(bool1);
        System.out.println(bool2);
        System.out.println(bool3);
    }

    public static boolean compareTowArray(int[] arr1, int[] arr2) {
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    return false;
                }
            }
            return true;
        }else {
            return false;
        }
    }
}
