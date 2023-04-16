import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;


/*
    Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
    Создать множество ноутбуков.
    Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, 
    отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую 
    необходимому критерию:
    1 - ОЗУ
    2 - Объем ЖД
    3 - Операционная система
    4 - Цвет …
    Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
    Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
         */
        
public class HomeWork_6Task1 {
    private static Notebook[] catalog;
    public static void main(String[] args) {
        Set<Notebook> catalog = new HashSet<>();
        catalog.add(new Notebook("Lenovo IdeaPad L3", 8, 512, "DOS", "серый", 1249.0));
        catalog.add(new Notebook("Huawei MateBook D14 NbD-WDI9", 8, 236, "Windows 11", "белый", 2099.0));
        catalog.add(new Notebook("HP 255 G8(59W66EA)", 8, 256, "Windows 11", "серебро", 1449.0));
        catalog.add(new Notebook("HP 255 G8(3V5H3EA)", 8, 256, "Windows 10", "черный", 1999.0));
        catalog.add(new Notebook("Tecno Megabook", 16, 512, "Linux", "белый", 1949.0));
        catalog.add(new Notebook("Lenovo IdeaPad 5 Pro 16ACH6", 8, 512, "Windows 11 Home", "черный", 2499.0));

        mainMenu(catalog);

    }
    static void mainMenu(Set<Notebook> catalog){
        boolean flag = true;
        String menu = "1 - Обьем ОЗУ\n" + "2 - Обьем ЖД\n" + "3 - Операционная система\n" +
         "4 - Цвет\n" + "5 - Поиск\n" + "6 - Очистить запрос\n" + "7 - Выход\n";
        Map<String, String> request = new TreeMap<>();
        while (flag){
            System.out.println(menu);
            System.out.println("Запрос: " + request);
            String key;
            Scanner scanner = new Scanner(System.in);
            key = scanner.nextLine();
            switch (key){
                case "1":
                request.put("ОЗУ", inputMenu("Введите объём ОЗУ: "));
                    break;
                case "2":
                request.put("ЖД", inputMenu("Введите объём ЖД: "));
                    break;
                case "3":
                    request.put("ОС", selectOSMenu());
                    break;
                case "4":
                    request.put("Цвет", selectColorMenu());
                    break;
                case "5":
                    showResultRequest(request, catalog);
                    break;
                case "6":
                    request.clear();
                    break;
                case "7":
                    return;
                default:
                    break;
            }
        }
    }

    static String inputMenu(String text){
        Scanner scanner = new Scanner(System.in);
        System.out.print(text);
        String result = scanner.nextLine();
        return result;
    }

    static String selectOSMenu(){
        String menu = "1 - DOS\n" + "2 - Windows 11\n" + "3 - Windows 10\n" + "4 - Linux\n" + "5 - Windows 11 Home\n";
        Scanner scanner = new Scanner(System.in);
        System.out.println(menu);
        String key = scanner.nextLine();
        switch (key) {
            case "1":
                return "DOS";
            case "2":
                return "Windows 11";
            case "3":
                return "Windows 10";
            case "4":
                return "Linux";
            case "5":
                return "Windows 11 Home";
            default:
                return "Другая";
        }
    }

    static String selectColorMenu(){
        String menu = "1 - серый\n" + "2 - белый\n" + "3 - серебро\n" + " 4 - черный\n";
        Scanner scanner = new Scanner(System.in);
        String key = scanner.nextLine();
        switch (key) {
            case "1":
                return "серый";
            case "2":
                return "белый";
            case "3":
                return "серебро";
            case "4":
                return "черный";
            default:
                return "другой";
        }
    }
    static void showResultRequest(Map<String, String> request, Set<Notebook> notebook){
        Set<Notebook> result = new HashSet<>();
        for (Notebook notebook2: catalog){
            boolean check = true;
            if (request.keySet().contains("ОЗУ")) {
                check &= notebook2.getRam() > Integer.parseInt(request.get("ОЗУ"));
            }
            if (request.keySet().contains("ЖД")) {
                check &= notebook2.getRom() > Integer.parseInt(request.get("ЖД"));
            }
            if (request.keySet().contains("ОС")) {
                check &= notebook2.getOs().equals(request.get("ОС"));
            }
            if (request.keySet().contains("Цвет")) {
                check &= notebook2.getColor().equals(request.get("Цвет"));
            }
            if (check) {
                result.add(notebook2);
            }
        }
        for (Notebook notebook2 : result) {
            System.out.println(notebook);
        }
    }
}
