package com.javarush.lesson4.task0404;

/**
 * Created by Arsen on 25.02.2017.
 * Реализовать метод checkSeason. По номеру месяца, метод
 * должен определить время года (зима, весна, лето, осень)
 * и вывести на экран.

 Пример для номера месяца 2:
 зима

 Пример для номера месяца 5:
 весна
 */
public class SeasonsOnTerra {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        //::CODE:
        switch (month){
            case 1: case 2:case 12:
                System.out.println("зима");
                break;
            case 3: case 4:case 5:
                System.out.println("весна");
                break;
            case 6: case 7:case 8:
                System.out.println("лето");
                break;
            case 9: case 10:case 11:
                System.out.println("осень");
                break;
            default:
                break;
        }
    }
}
