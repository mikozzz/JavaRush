package com.javarush.lesson2.task0202;
/**
 * Created by Arsen on 15.02.2017.
 * В классе Solution объяви следующие переменные: name типа String,
 * age типа int, weight типа int, money типа int.
 * В методе main создай объект Solution, занеси его ссылку в переменную person.
 */
public class WherePersonCameFrom {
    public static void main(String[] args){
        Person person = new Person();
    }
    public static class Person{
        String name;
        int age, weight, money;
    }
}
