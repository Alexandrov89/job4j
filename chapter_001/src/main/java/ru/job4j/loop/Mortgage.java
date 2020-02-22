package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 0;
        double inyear = amount + amount * percent / 100;
        while (inyear  > salary) {
            inyear = inyear - salary;
            inyear = inyear + inyear * percent / 100;
                    year ++;
        }
            return year + 1;

    }
}
