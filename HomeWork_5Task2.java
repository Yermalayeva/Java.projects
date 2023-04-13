import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class HomeWork_5Task2 {
    public static void main(String[] args) {
        /*
        Пусть дан список сотрудников: Иван Иванов, Светлана Петрова,кристина Белова,
        Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов,
        Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова,
        Иван Мечников, Петр Петин, Иван Ежов. Написать программу, которая найдет и выведет повторяющиеся 
        имена с количеством повторений.
        Отсортировать по убыванию популярности. Для сортировки использовать TreeMap.
         */
        String sotrudniki = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, " +
        "Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, " +
        "Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова, " +
        "Иван Мечников, Петр Петин, Иван Ежов.";
        sotrudniki.replace(".", "");

        String[] array = sotrudniki.split(", ");
        List<String> names = new ArrayList<>();
        List<Integer> repeat = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            String name = array[i].split(" ")[0];
                if (names.contains(name)) {
                    int index = names.indexOf(name);
                    repeat.set(index, repeat.get(index) + 1);
                    } else {
                    names.add(name);
                    repeat.add(1);
                    }
                }
        Map<Integer, List<String>> map = new TreeMap<>();

        for (int i = 0; i < names.size(); i++) {
            if (map.containsKey(repeat.get(i))) {
                List<String> list = map.get(repeat.get(i));
                list.add(names.get(i));
            } else {
                List<String> list = new ArrayList<>();
                list.add(names.get(i));
                map.put(repeat.get(i), list);
            }
        } 
        System.out.println(map);           
    }
}
