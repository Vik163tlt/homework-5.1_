public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
    }

    private static void task1() {
        System.out.println("Задание 1 / Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
    private static void task2() {
        System.out.println("Задание 1 / Задача 2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }
    private static void task3() {
        System.out.println("Задание 1 / Задача 3");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }
    }
    private static void task4() {
        System.out.println("Задание 1 / Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
    }
    private static void task5() {
        System.out.println("Задание 2 / Задача 1");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
    }
    private static void task6() {
        System.out.println("Задание 2 / Задача 2");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.printf("%d \n", i);
        }
    }
    private static void task7() {
        System.out.println("Задание 2 / Задача 3");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.printf("%d \n", i);
        }
    }
    private static void task8() {
        System.out.println("Задание 3 / Задача 1");
        int salary = 29_000;
        int total = 0;
        for (int i = 1; i <= 12; i ++) {
            total = total + salary;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей\n", i, total);
        }
    }
    private static void task9() {
        System.out.println("Задание 3 / Задача 2");
        int salary = 29_000;
        int total = 0;
        for (int i = 1; i <= 12; i ++) {
            total = total + total/100;
            total = total + salary;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей\n", i, total);
        }
    }
}
