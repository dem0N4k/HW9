import java.util.Scanner;

public class Main {
    static double a = 0;
    static double b = 0;

    public static void main(String[] args) {

        a = inputDouble();
        b = inputDouble();

        sum();      //Метод суммирования чисел
        multiply(); //Метод умножения чисел
        diff();     //Метод вычитания чисел
        divide();   //Метод деления чисел
    }

    private static void divide() {
        //todo дописать логику и печать результата
        double divide = a / b;
        System.out.println("При делении чисел получим: " + divide);
    }

    private static void diff() {
        double diff = a - b;
        System.out.println("При вычитании чисел получим: " + diff);
    }

    private static void multiply() {
        double multiply = a * b;
        System.out.println("При умножении чисел получим: " + multiply);
    }

    private static void sum() {
        double sum = a + b;
        System.out.println("При суммировании чисел получим: " + sum);
    }

    private static double inputDouble() {
        System.out.println("Введите число: ");
        return new Scanner(System.in).nextDouble();
    }
}
