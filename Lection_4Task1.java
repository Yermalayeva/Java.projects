import java.util.LinkedList;
import java.util.Scanner;

public class Lection_4Task1 {
    public static void main(String[] args) {
        /*
        Релизовать консольное приложение, которое:
        Принимает от пользователя строку вида text ~ num. Нужно расплитить строку по ~ , сохранить text 
        в связанный список на позицию num. Если введено print ~ num выводит строку из позиции num в
        связанном списке и удаляет ее из списка.
        */
    }
    static void tas1(){
        try (Scanner scanner = new Scanner(System.in)) {
            LinkedList<String> list = new LinkedList<>();
            while(true){
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
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
