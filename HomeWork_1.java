import java.util.Scanner;

import java.io.IOException;
//Задача1: Вычислить n-ое треугольного число (сумма чисел от 1 до n)

/*public class HomeWork_1 {
    public static void main(String[] args)throws IOException {
        String result = sumNumber(20);
        System.out.println("Сумма первых n натуральных чисел:" + result);
    }
    
    public static String sumNumber(int value){
        int result = 0;
        for (int i = 1; i <= value; i++) {
            result += i;
        }
        return String.valueOf(result);
    }
}
*/

/* Задача2: Вычислить n! (произведение чисел от 1 до n)

public class HomeWork_1 {
    public static void main(String[] args)  {
    System.out.println(productOfNumbers(5));
    }
    static int productOfNumbers(int n){
        int result = 1;
        for (int i = 1; i <= n; i ++){
            result = result * i;
        }
        return result;
    }
}
*/

//Задача3:Вывести все простые числа от 1 до 1000 (числа, которые делятся только на 1 и на себя без остатка)

/* 
public class HomeWork_1{
    public static void main(String[] args){
        try(Scanner tru = new Scanner(System.in)){
            for(int i = 2; i <= 1000; i ++){
                boolean isPrime = i >= 2;
                for (int j = 2; j < i; j ++){
                    if(i % j == 0){
                        isPrime = false; break;  
                    }
                }
            if(isPrime)
            System.out.println(i);  
            }
        }
    }
}
*/

//Задача4:  Реализовать простой калькулятор (введите первое число, введите второе число, введите требуемую операцию, ответ)
/*
public class HomeWork_1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        int answer;
        char oper;
        System.out.println("Введите операцию(+,-,*,/): ");
        oper = scanner.next().charAt(0);
        System.out.println("Введите первое число: ");
        num1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        num2 = scanner.nextInt();

        boolean correct = true;
        switch (oper){
            case '+':
                answer = num1 + num2;
                break;
            case '-':
                answer = num1 - num2;
                break;
            case '*':
                answer = num1 * num2;
                break;
            case '/':
                answer = num1 / num2;
                break; 
            default:
                answer = 0;
                correct = false;  
        }
        System.out.println(correct ? "Ответ: " + answer: "Неверная операция!");
    }
}
*/