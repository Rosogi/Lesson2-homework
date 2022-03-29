package com.company;

public class MainClaaaass {

    public static void main(String[] args) {
        //printThreeWords();
        //System.out.println(checkSumSign(initA(), initB()));
        //printColor();
        //compareNumbers();
        //switchTest();
        arrayTest();

    }

    private static void printThreeWords(){
        System.out.println("Banana");
        System.out.println("Apple");
        System.out.println("Orange");
    }

    private static int initA(){
        return 25;
    }

    private static int initB(){
        return -55;
    }

    private static String checkSumSign(int a, int b){
        int sum = a + b;
        String result = "";
        if (sum >= 0 ){
            result = "Сумма положительная";
        } else {
            result = "Сумма отрицательная";
        }
        return result;
    }

    private static void printColor(){
        int value = 150;
        if (value <= 0){
            System.out.println("Красный");
        }
        else if (value > 0 && value <=100){
            System.out.println("Желтый");
        }
        else {
            System.out.println("Зеленый");
        }
    }

    private static void compareNumbers(){
        for (int a = 0, b =10; a < b; a++, b--){
            System.out.println("a-b: " + a + "-" + b);
            if (a == 3){
                break;
            }
        }
        System.out.println("Работа после цикла");
    }

    private static void switchTest(){
        String a = "3";
        switch (a){
            case "1":
                System.out.println("Переменная a = 1");
                break;
            case "2":
                System.out.println("Переменная a = 2");
                break;
            case "3":
                System.out.println("Переменная a = 3");
                break;

            default:
                System.out.println("Переменная a = ???");
                break;
        }
    }

    private static void arrayTest(){
        String[] array = {"A", "B", "C", "D"};
        for (int i = array.length - 1; i >= 0; i--){
            System.out.print(array[i] + " ");
        }
    }


}
