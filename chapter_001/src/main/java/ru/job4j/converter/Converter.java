package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }
    public static int rubleToDollar(int value) {
        return value / 60;
    }
    public static int euroToRuble(int value) {
        return value * 70;
    }
    public static int dollarToRuble(int value) {
        return value * 60;
    }
    public static void main(String[] args){
        int euro = rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        int dollar = rubleToDollar(120);
        System.out.println("120 rubles are " + dollar + " dollar.");
        int rubleE = euroToRuble(5);
        System.out.println("5 euro are " + rubleE + " rubles.");
        int rubleD = dollarToRuble(6);
        System.out.println("6 dollar are " + rubleD + " rubles.");
        int inRE = 140;
        int expectedRE = 2;
        int outRE = rubleToEuro(inRE);
        boolean passedRE = expectedRE == outRE;
        System.out.println("140 rubles are 2. Test result : " + passedRE);
        int inRD = 120;
        int expectedRD = 2;
        int outRD = rubleToDollar(inRD);
        boolean passedRD = expectedRD == outRD;
        System.out.println("120 rubles are 2. Test result : " + passedRD);
        int inER = 5;
        int expectedER = 350;
        int outER = euroToRuble(inER);
        boolean passedER = expectedER == outER;
        System.out.println("5 euro are 350. Test result : " + passedER);
        int inDR = 6;
        int expectedDR = 360;
        int outDR = dollarToRuble(inDR);
        boolean passedDR = expectedDR == outDR;
        System.out.println("6 dollar are 360. Test result : " + passedDR);
    }

}
