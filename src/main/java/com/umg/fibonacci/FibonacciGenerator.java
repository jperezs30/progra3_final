
package com.umg.fibonacci;

public class FibonacciGenerator {

    public static int[] fibonacci(int[] start, int n) {
        if (n <= 0 || start == null || start.length != 2) {
            return new int[0];
        }

        int[] result = new int[n];

        if (n >= 1) result[0] = start[0];
        if (n >= 2) result[1] = start[1];

        for (int i = 2; i < n; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }

        return result;
    }
}
