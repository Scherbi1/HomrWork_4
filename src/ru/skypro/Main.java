package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Задание 1");
        int i=1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        //i=10;
        System.out.println(" ");
        for (i=10; i > 0; i--) {
            System.out.print(i+" ");
        }

        System.out.println("Задание 2");
        int day=5;

        for (i = 1; i <= 31; ) {

            System.out.println("Сегодня пятница - " + day + "e число");
            day=day+7;
            i=i+7;
            if (day>31) {
                break;
            }
        }

        System.out.println("Задание 3");
        for (i = 0; i<2400; i++) {
            int a=1822;
            int b=2122;
            if (i >= a && i <= b && i % 79 == 0) {
                System.out.println("В " + i + " комета пролетит над землей");
            }
        }
    }
}
