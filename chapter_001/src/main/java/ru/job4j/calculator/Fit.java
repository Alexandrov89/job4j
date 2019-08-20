package ru.job4j.calculator;

public class Fit {

    public static double manWeight(double height) {
        return (height - 100)*1.15;
    }

    public static double womanWeight(double height) {
        return (height - 110)*1.15;
    }

    public static void main(String[] args) {
        double man = manWeight(170);
        System.out.println("Man 170 is " + man);
        double man1 = manWeight(180);
        System.out.println("Man 180 is " + man1);
        double man2 = manWeight(187);
        System.out.println("Man 187 is " + man2);
        double woman = womanWeight(156);
        System.out.println("Woman 156 is " + woman);
        double woman1 = womanWeight(170);
        System.out.println("Woman 170 is " + woman1);
        double woman2 = womanWeight(180);
        System.out.println("Woman 180 is " + woman2);
    }
}
