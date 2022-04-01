package com.company;

public class Main {

    public static void main(String[] args) {

        // Задание 1, 2

        int clientOS = 1, clientDeviceYear = 2016;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }

        // Задание 3

        int year = 2020;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        // Задание 4

        int deliveryDistances = 95;
        int deliveryDays = 1;
        if (deliveryDistances <=20) {
            System.out.println("Доставка займет " + deliveryDays);
        } else if (deliveryDistances > 20 && deliveryDistances <= 60) {
            System.out.println("Доставка займет " + (deliveryDays + 1));
        } else if (deliveryDistances > 60 && deliveryDistances <= 100) {
            System.out.println("Доставка займет " + (deliveryDays + 2));
        } else {
            System.out.println("На такое расстояние не доставляем");
        }



        // Задание 5

        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 3:
                System.out.println("Время года весна");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Время года лето");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Время года осень");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Время года зима");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }



    }
}