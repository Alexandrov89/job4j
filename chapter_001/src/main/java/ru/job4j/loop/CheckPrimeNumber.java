package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = false;
        for (int x = 2; x < number; x++) {
            if (number % x == 0)
                break;
            prime = true;
        }
        return prime;
    }
}
