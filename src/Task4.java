
/*
Задача 4.

Реализовать простой калькулятор
("введите первое число"... "Введите второе число"... "укажите операцию,
которую надо выполнить с этими числами"... "ответ: ...")
 */

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner first = new Scanner(System.in);
        System.out.print("Введите первое число : ");
        double a = first.nextInt();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите знак : ");
        String V = scanner.nextLine();

        Scanner lost = new Scanner(System.in);
        System.out.print("Введите второе число : ");
        double b = lost.nextInt();

        System.out.print("Ответ : ");
        if (V.equals("+")) {
            System.out.print(a + b);

        } else if (V.equals("-")) {
            System.out.print(a - b);
        } else if (V.equals("*")) {
            System.out.print(a * b);
        } else if (V.equals("/")) {
            System.out.print(a / b);
        }

    }

}

