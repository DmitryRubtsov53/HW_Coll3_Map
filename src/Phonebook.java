import java.util.HashMap;

public class Phonebook {

    public static void main(String[] args) {

        System.out.println("Домашнее задание: Телефонный справочник ___________________________ ");
        System.out.println();

        HashMap<String,String> phoneBook = new HashMap<>();
        phoneBook.put("Иван Иванов", "+79273501001");  phoneBook.put("Иван Петров", "+79273501002");
        phoneBook.put("Петр Иванов", "+79273501003");  phoneBook.put("Петр Петров", "+79273501004");
        phoneBook.put("Семён Иванов", "+79273501005"); phoneBook.put("Семён Петров", "+79273501006");
        phoneBook.put("Антон Иванов", "+79273501007"); phoneBook.put("Антон Петров", "+79273501008");
        phoneBook.put("Олег Иванов", "+79273501009");  phoneBook.put("Олег Петров", "+79273501010");
        phoneBook.put("Иван Дубов", "+79273501011");  phoneBook.put("Иван Котов", "+79273501012");
        phoneBook.put("Петр Дубов", "+79273501013");  phoneBook.put("Петр Котов", "+79273501014");
        phoneBook.put("Семён Дубов", "+79273501015"); phoneBook.put("Семён Котов", "+79273501016");
        phoneBook.put("Антон Дубов", "+79273501017"); phoneBook.put("Антон Котов", "+79273501018");
        phoneBook.put("Олег Дубов", "+79273501019");  phoneBook.put("Олег Котов", "+79273501020");

        for (String name: phoneBook.keySet()) {
            System.out.print("Абонент: " + name);
        }
        System.out.println();

        for (String phoneNumber: phoneBook.values()) {
            System.out.println("Номер телефона  " + phoneNumber);
        }
        System.out.println();

        for (HashMap.Entry<String, String> contact: phoneBook.entrySet()) {
            System.out.println("Контакт " + contact.getKey() + ": " + contact.getValue());
        }

    } // main -------------------------------------------------------------------------------------

} // Class

