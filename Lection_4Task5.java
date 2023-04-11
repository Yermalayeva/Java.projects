//import java.util.*;
/*
Реализовать стэк при помощи массива. Нужно реализовать методы:
size(), empty(), puch(), peek(), pop().
*/
public class Lection_4Task5 {
    private int[] arr = new int[10];
    int size = 0;

    public int size(){
        return size;

    }

    public boolean empty(){
        return size == 0;

    }

    public void puch(int val){
        if(size == arr.length){
            int[] arr1 = new int[arr.length*2];
            System.arraycopy(arr, 0, arr1, 0, arr.length);
            arr = arr1;
        }
        arr[size] = val;
        size++;
    }

    public int peek(){
        return arr[size - 1];  
    }

    public int poop(){
        //return arr[--size];
        int res = peek();
        size--;
        return res;
    }
}
