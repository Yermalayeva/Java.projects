import java.util.ArrayList;

/*Задан целочисленный список ArrayList. Найти минимальное, максимальное и
 среднее арифметическое из этого списка. Collections.max()
*/

public class HomeWork_3Task2 {

    public static void main(String[] args){
        int array[] = new int[]{-3, 15, 8, 2, 12, -5};
        int max = getMax(array);
        System.out.println("Максимальное число: " + max);
        int min = getMin(array);
        System.out.println("Минимальное число: " + min);
        double sum = findSum(array);
        System.out.println("Среднеарифметическое чисел: " + sum / array.length);
        
    }
    public static int getMax(int[] inputArray){
        int maxValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if(inputArray[i] > maxValue){
                maxValue = inputArray[i];
            }  
        }
        return maxValue;
    }
    public static int getMin(int[] inputArray){
        int minValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if(inputArray[i] < minValue){
                minValue = inputArray[i];
            }
        }
        return minValue;
    
    }
    public static double findSum(int[] array){
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];    
        }
        return sum;
    }
}