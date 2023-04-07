import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Пусть дан произвольный список целых чисел, удалить из него четные числа.
/**
 * HomeWork_3Task1
 */
public class HomeWork_3Task1 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Введите длинну массива: ");
            n = scanner.nextInt();
        }while(n < 2);
        int[] array = createRandomArray(n, 1, 9);
        System.out.println("Дан массив: " + Arrays.toString(array));

        int[] arrayDelete = deleteEvenElement(Arrays.copyOf(array, array.length));
        System.out.println("Удаленные элементы массива: " + Arrays.toString(arrayDelete));
    }
    public static int[] createRandomArray(int length, int min, int max) {
        int[] result = length > 0 ? new int[length] : new int[0];
        if (length > 0){
            Random random = new Random();
            for (int index = 0; index < length; index++) {
                result[index] = random.nextInt(Math.abs(max - min) + 1) + min;
            }
        }
        return result;
    }
    public static int[] deleteEvenElement(int[] array) {
        int i, j;
        for (i = 0, j = 1; j < array.length; i++, j += 2) {
            array[i] = array[j];
        }
        return Arrays.copyOf(array, i);
    }
}