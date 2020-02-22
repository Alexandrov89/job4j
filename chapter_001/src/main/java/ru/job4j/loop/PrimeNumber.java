package ru.job4j.loop;

public class PrimeNumber {

    public int calc(int finish) {
        int count = 0;
        for (int y = 3; y <= finish; y++) {
            if (CheckPrimeNumber.check(y))
                count ++;
        }
        return count + 1;
    }
}