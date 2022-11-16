import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        System.out.println("Домашнее задание: Введение в коллекции. Ассециативные массивы ___________________________ ");
        System.out.println();

    HashMap<String,String> phoneBook = new HashMap<>();
        phoneBook.put("Иван Иванов", "+79273501000");  phoneBook.put("Иван Петров", "+79273501000");
        phoneBook.put("Петр Иванов", "+79273501000");  phoneBook.put("Петр Петров", "+79273501000");
        phoneBook.put("Семён Иванов", "+79273501000"); phoneBook.put("Семён Петров", "+79273501000");
        phoneBook.put("Антон Иванов", "+79273501000"); phoneBook.put("Антон Петров", "+79273501000");
        phoneBook.put("Олег Иванов", "+79273501000");  phoneBook.put("Олег Петров", "+79273501000");

//        System.out.println(phoneBook.entrySet());
        System.out.println(phoneBook.values());


    }
}