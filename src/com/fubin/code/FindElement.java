package com.fubin.code;

public class FindElement {

    public static void main(String[] args) {

        FindElementMethod findElementMethod = new FindElementMethod();
        int[] arr = {1, 2, 3, 4, 5};
        //int[] arr = null;
        findElementMethod.findElement(arr);
    }
}

class FindElementMethod {

    public int findElement(int[] arr) {

        if (arr != null && arr.length > 1) {
            for (int i = 0; i < arr.length; i++) {

                System.out.println("第 " + (i + 1) + " 个数组的元素为" + arr[i] + " 对应索引为" + i);
            }
            return 0;
        } else {
            return -1;
        }
    }
}
