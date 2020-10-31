package com.company;

public class Main {

    public static void main(String[] args) {
        Human Vasiliy = new Human("Vasya",22);
        Human Vasilisa = new Human("Vasya",21);

        if (Vasiliy.equals(Vasilisa)) {
            System.out.println("Yeah");

        }

        Vasilisa.toString();
        Vasiliy.toString();


    }
}
