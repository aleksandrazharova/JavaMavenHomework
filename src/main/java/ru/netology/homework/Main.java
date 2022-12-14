package ru.netology.homework;

public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        long amount = 400;
        boolean registered = true;
        long actual = service.calculate(amount, registered);
        System.out.println(actual);
    }
}
