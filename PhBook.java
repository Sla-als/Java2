package GeekBrains;

import java.util.*;

public class PhBook {
    //Написать простой класс Телефонный Справочник, который хранит в себе список фамилий
    // и телефонных номеров. В этот телефонный справочник с помощью метода add() можно
    // добавлять записи, а с помощью метода get() искать номер телефона по фамилии.
    // Следует учесть, что под одной фамилией может быть несколько телефонов
    // (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все
    // телефоны. Желательно не добавлять лишний функционал (дополнительные поля
    // (имя, отчество, адрес), взаимодействие с пользователем через консоль и т.д).
    // Консоль использовать только для вывода результатов проверки телефонного справочника.
    private HashMap<String,ArrayList<String>> phoneBook = new HashMap<>();

    public void add(String name, String tel) {
        ArrayList<String> listPh = phoneBook.get(name);
        if (listPh == null) listPh = new ArrayList<>();
        listPh.add(tel);
        phoneBook.put(name, listPh);
    }
    public ArrayList<String> get(String name) {
        return phoneBook.get(name);
    }
    }
