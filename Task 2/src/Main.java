import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Написать программу, в которой пользователь вводит целое число.
        //Если число четное, то печатаем true, если не четное, печатаем false
        //В методе main НЕ ДОПУСТИМО написание какого либо кода, кроме вызова методов.
        //Методы и их логику продумайте сами

        condition();

    }

    private static void condition() {
        while (true) {
            multiplicityNumber();
        }
    }

    private static void multiplicityNumber() {
       /*
       if (inputNumber() % 2 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        */

        //  System.out.println(inputNumber() % 2 == 0 ? true : false);

        System.out.println(inputNumber() % 2 == 0);
    }


    private static int inputNumber() {
        System.out.println("Введите число: ");
        return new Scanner(System.in).nextInt();
    }
}
