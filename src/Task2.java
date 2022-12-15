
/*
Задача 2.
Вычислить n! (произведение чисел от 1 до n)
 */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] arg){
        System.out.println(factor());
    }

    public static int factor(){
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        Integer numb1 = scanner.nextInt();
        Integer res = 1;
        for (int i = 1; i <= numb1; i++) {
            res *= i;
        }
        return res;
    }
}
