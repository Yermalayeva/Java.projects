


import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        //ex0();
        //int[] arr = new int[]{1, 1, 0, 0, 1, 1, 1, 1, 1, 1};
        //ex1(arr, 1);
        // int[] arr = new int[]{3, 2, 5, 3};
        // int val = 3;
        // ex2(arr, val);
        //String text = "Добро пожаловать на курс Java";
        //System.out.println(ex3(text));
        int a = 2;
        int b = -2;
        double c = ex4(a, b);
        System.out.println(c);  

    }
    static double ex4(int a, int b){
        /*
        реализовать функцию возведения числа a в степень числа b. a, b из Z(целые числа).
         Сводя количество выполненных действий к минимуму.
         Пример 1: a = 3, b = 2, ответ: 9
         Пример 2: a = 2, b = -2, ответ: 0,25
         Пример 3: a = 3, b = 0, ответ: 1
         */
        if (b == 0){
            return 1;
        }
        if (a == 0 || a == 1){
            return a;
        }
        double a1 = a;
        double b1 = b;
        if (b < 0){
            a1 = 1.0/a;
            b1 = -b;
        }
        double res = a1;
        for (int i = 0; i < b1-1; i++) {
            res *= a1;
        }
        return res;
    }

    

    static String  ex3(String text){
        /*
        Во фразе "Добро пожаловать на курс Java" переставить слова в обратном порядке
         */
        String[] temp = text.split(" ");
        String res = "";
        for (int i = temp.length-1; i >= 0; i--) {
            res += temp[i] + " ";
        }
        return res;
    }
    
    static void ex2(int[] arr, int val){
        /*
        Дан массив nums = [3, 2, 5, 3] и число vai = 3. Есть ли в массиве есть числа, равные заданному,
         нужно переместить эти элементы в конец массива. Таким образом, первые несколько (или все) 
         элементов массива должны быть отличны от заданного, а остальные равны ему.
         */
        int[] res = new int[arr.length];
        Arrays.fill(res, val);
        for (int i = 0, j = 0; i < res.length; i++){
            if (arr[i] != val){
                res[j] = arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(res));
    }

    static void ex1(int[] arr, int val){
    /*
    Дан массив двоичных чисел, например [1, 1, 0, 1, 1, 1], вывести максимальное количество подряд идущих 1.
    */
    int maxCount = 0;
    int count = 0;
    for (int i = 0; i < arr.length; i++){
        if (arr[i] == val){
            count++;
        } else {
            if (count > maxCount){
                maxCount = count;
            }
            count = 0;
        }
    }
    if (count > maxCount){
        maxCount = count;
    }
    System.out.println(maxCount);
} 

    static void ex0(){
        /*
        В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида
        "Доброе утро, <Имя>!", если время от 05:00 до 11:59
        "Добрый день, <Имя>!", если время от 12:00 до 17:59
        "Добрый вечер, <Имя>!", если время от 18:00 до 22:59
        "Доброй ночи, <Имя>!", если время от 23:00 до 04:59
        */
        System.out.println("Как вас зовут?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
            //System.out.println("Привет, " + name);
        LocalTime time = LocalTime.now();
        int hour = time.getHour();
        if (hour >=5 && hour <12){
            System.out.println("Доброе утро, " + name + "!");
        } else if (hour >=12 && hour <18){
            System.out.println("Добрый день, " + name + "!");
        } else if (hour >=18 && hour <23){
            System.out.println("Добрый вечер, " + name + "!");
        } else{
            System.out.println("Доброй ночи, " + name + "!");
        }
    }
}

