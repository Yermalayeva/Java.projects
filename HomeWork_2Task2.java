import java.io.*;
import java.io.FileWriter;

/*
Создать метод, который запишет результат работы в файл.
 Обработайте исключения и запишите ошибки в лог файл.
 */


public class HomeWork_2Task2 {
    public static void main(String[] args) throws Exception {
        int k1 = 2;
        int k2 = 9;
        newFile( k1, k2);
        
        try(FileWriter writer = new FileWriter("notes3.txt", false))
        {
            String text = "Без труда не вынешь рыбку из пруда!";
            writer.write(text);
            writer.flush();
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        } 
    }
    

 
    public static void newFile(int k1, int k2) throws Exception {
        FileWriter nFile = new FileWriter("test.txt");
 
            for(int i = k1; i <= k2; i++) {
                nFile.write(i + "\n");
                }
        nFile.close();
    }
}
