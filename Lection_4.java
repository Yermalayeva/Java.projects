import java.util.*;
import java.util.ArrayList;
import java.util.LinkedList;
//import java.util.List;
//import java.util.ListIterator;
//import java.util.Scanner;


public class Lection_4 {
    
    public static void main(String[] args) {
        Lection_4Task5 lection = new Lection_4Task5();
        System.out.println(lection.empty());
        lection.puch(5);
        lection.puch(6);
        lection.puch(7);
        System.out.println("Количество элементов в стеке " + lection.size);
        System.out.println(lection.empty());
        System.out.println(lection.peek());
        System.out.println(lection.poop());
        System.out.println(lection.poop());
        System.out.println(lection.poop());
        System.out.println(lection.poop());
    }
    
    static void tas0(){
        /*
    Замерьте время, за которое в ArrayList добавятся 10000 элементов.
    Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.
     */
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list2.add(0, i);
        }
        Long timeFinich = System.currentTimeMillis();
        System.out.println(timeFinich - timeStart);
    }

    /*
    static void tas1(){
        /*
        Релизовать консольное приложение, которое:
        Принимает от пользователя строку вида text ~ num. Нужно расплитить строку по ~ , сохранить text 
        в связанный список на позицию num. Если введено print ~ num выводит строку из позиции num в
        связанном списке и удаляет ее из списка.
        */
        /* 
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        while (true){
            String line = scanner.nextLine();
            String[] arr = line.split("~");
            String text = arr[0];
            int num = Integer.parseInt(arr[1]);
            if (text.equals("print")){
                System.out.println(list.remove(num));
            } else if (text.equals("exit")){
                System.out.println("До скорой встречи!");
                break;
            } else {
                list.add(num, text);
            }
        }
    } 
    */
    /* 
    static void tas2(){
        /*
        Реализовать консольное приложение, которое принимает от пользователя
        и запоминает строки. Если введено print , выводит строки так, чтобы последняя введенная была 
        первой в списке, а первая - последней. Если введено revert, удаляет предыдущую введенную.
         */
        /* 
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();

        boolean work = true;
        while(work){
            String line = scanner.nextLine();
            switch(line){
                case "print":
                    ListIterator<String> iterator = list.listIterator(list.size()/2);
                    while (iterator.hasPrevious()){
                        System.out.println(iterator.previous());
                    }
                    break;
                case "revert":
                    list.removeLast();
                    break;
                case "exit":
                    work = false;
                    break;
                default:
                    list.add(line);
            }
        }
    }
    */
}


