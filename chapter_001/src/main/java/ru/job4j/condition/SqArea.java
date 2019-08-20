package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        return 4 * k * Math.pow(k + 1, 2) / Math.pow(p, 2);
    }

    public static void main(String[] args) {
        double result1 = square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }
}
