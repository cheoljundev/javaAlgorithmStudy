package chap01.test;

public class MaxMinTest {
    public static void main(String[] args) {
        System.out.println("max4(4,5,2,1) = " + max4(4, 5, 2, 1));
        System.out.println("min3(2,3,1) = " + min3(2, 3, 1));
        System.out.println("min4(44,4,19,21) = " + min4(44, 4, 19, 21));
    }

    static int max4(int a, int b, int c, int d) {
        int max = a;
        if (b > max) {
            max = b;
        } else if (c > max) {
            max = c;
        } else if (d > max) {
            max = d;
        }
        return max;
    }

    static int min3(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min = b;
        } else if (c < min) {
            min = c;
        }
        return min;
    }

    static int min4(int a, int b, int c, int d) {
        int min = a;
        if (b < min) {
            min = b;
        } else if (c < min) {
            min = c;
        } else if (d < min) {
            min = d;
        }
        return min;
    }
}
