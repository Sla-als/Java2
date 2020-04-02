package GeekBrains;

import java.util.*;

public class Main {
    public static void main(String[] args){
        //Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся)
        String[] words = {
                "Apple", "Carrot","Orange","Lime","Carrot","Grapefruit","Lime",
                "Mango","Mango","Lime","Tomato","Lime","Grapefruit"
        };
        //Найти и вывести список уникальных слов,
        //из которых состоит массив (дубликаты не считаем)
        SortedSet<String> unique = new TreeSet<>(Arrays.asList(words));// sorted
        System.out.println(unique);
        //Посчитать, сколько раз встречается каждое слово.
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (map.containsKey(words[i]))
                map.put(words[i], map.get(words[i]) + 1);
            else
                map.put(words[i], 1);
        }
        System.out.println(map);
        //3
        PhBook phBook = new PhBook();
        phBook.add("Ivanov","+7-495-666-66-66");
        phBook.add("Ivanova","+7-495-777-77-77");
        phBook.add("Ivanova","+7-495-888-88-88");
        System.out.println(phBook.get("Ivanova"));



    }
    }









