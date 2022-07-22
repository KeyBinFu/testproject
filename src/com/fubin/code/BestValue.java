package com.fubin.code;

public class BestValue {

    public static void main(String[] args) {

        double[] arr = {1.1, 2.2, 12, 9.3};
        BestValueMethod bestValueMethod = new BestValueMethod();
        System.out.println(bestValueMethod.max(arr));
    }
}

/**
 *
 */
class BestValueMethod {

    public double max(double[] arr) {

        double max = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}

