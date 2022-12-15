
/*
Задача 1.
Вычислить n-ое треугольного число(сумма чисел от 1 до n)
 */


import java.util.Scanner;

public class Task1 {
    public static void main(String[] arg){
        System.out.println(numb());
    }
    public static int numb(){

        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        Integer numb1 = scanner.nextInt();
        int res = (numb1*(numb1+1))/2;
        return res;
    }
}
