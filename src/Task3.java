
/*
Вывести все простые числа от 1 до 1000
(простые числа - это числа которые делятся только на себя и на единицу без остатка.
Чтобы найти остаток от деления используйте оператор % , например 10%3 будет равно единице)
 */



public class Task3 {
    public static void main(String[] arg){
        for (int i = 1; i < 1000; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
    private static boolean isPrime(int number) {
        if (number < 2){
            return false;
        }
        for (int i = 2; i * i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

