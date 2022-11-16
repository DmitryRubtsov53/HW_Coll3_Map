import java.util.HashMap;
import java.util.Scanner;

public class HW1_task3 {

    public static void main(String[] args) {

        System.out.println("Домашнее задание 1. Задача 3 _____________________________________________ ");
        System.out.println();

        HashMap<String, Integer> task3 = new HashMap<>();
        task3.put("Иван", 12345);  task3.put("Сергей", 54321);
        task3.put("Петр", 98765);  task3.put("Антон", 56789);
/*  Напишите метод, который принимает строку (ключ) и целое число (значение) и пытается добавить ее в коллекцию
    по логике:
Если такого ключа нет, то просто добавляет данные в коллекцию.
Если такой ключ уже есть и значения совпадают, то необходимо бросить исключение.
Если такой ключ уже есть, но значения разные, то обновите целое число в коллекции.*/
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя с большой буквы: ");
        String tmpKey = scanner.nextLine();

        System.out.println("Введите 5 произвольных цифр от 1 до 9: ");
        Integer tmpVaiue = scanner.nextInt();

        scanner.close();

        if (!task3.containsKey(tmpKey)) {
            task3.put(tmpKey, tmpVaiue);
           } else if (tmpVaiue.equals(task3.get(tmpKey))) {
            throw new RuntimeException("Такие данные уже есть.");
                  } else task3.replace(tmpKey,tmpVaiue);

        System.out.println("________________________________________");

        for (HashMap.Entry<String, Integer> pair: task3.entrySet()) {
            System.out.println(pair.getKey() + "\t" + pair.getValue());
        }

    } // main -------------------------------------------------------------------------------------

} // Class
