package ru.netology;

public class Main {

    public static void Main(String[] args) {
        BonusService service = new BonusService();

        int expected = 150;
        int actual = (int) service.calculate(5_000, true);
        System.out.println(expected + " == ? == " + actual);
    }
}