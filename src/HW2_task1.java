import java.util.*;


public class HW2_task1 {

    public static void main(String[] args) {

        System.out.println("Домашнее задание 1. Задача 3. _____________________________________________");
        System.out.println();
    /* Создайте Map<String, List<Integer>>. Заполните ее 5 элементами, где ключ — произвольное значение,
а значение — список, состоящий из 3 случайных чисел в диапазоне от 0 до 1000.
Преобразуйте созданную коллекцию в новую — Map<String, Integer>, где ключи взяты из первой коллекции,
а число — сумма чисел списка. Выведите результат в консоль. */
        HashMap<String, List<Integer>> map = new HashMap<>();

        Random random = new Random();

        List<Integer> threeEl1 = new ArrayList<>();
            for (int i = 0; i < 3; i++) { threeEl1.add(random.nextInt(1000));
            }
        List<Integer> threeEl2 = new ArrayList<>();
        for (int i = 0; i < 3; i++) { threeEl2.add(random.nextInt(1000));
            }
        List<Integer> threeEl3 = new ArrayList<>();
        for (int i = 0; i < 3; i++) { threeEl3.add(random.nextInt(1000));
            }
        List<Integer> threeEl4 = new ArrayList<>();
        for (int i = 0; i < 3; i++) { threeEl4.add(random.nextInt(1000));
            }
        List<Integer> threeEl5 = new ArrayList<>();
        for (int i = 0; i < 3; i++) { threeEl5.add(random.nextInt(1000));
            }
        map.put("ASD", threeEl1);  map.put("FGH", threeEl2); map.put("JKL", threeEl3);
        map.put("ZXC", threeEl4);  map.put("VBN", threeEl5);

        for (HashMap.Entry<String, List<Integer>> pair: map.entrySet()) {
            System.out.println(pair.getKey() + "\t" + pair.getValue());
        }

        HashMap<String, Integer> mapSum = new HashMap<>();

        for (HashMap.Entry<String, List<Integer>> pair: map.entrySet()) {
            int sum = 0;
            for (int i = 0; i < pair.getValue().size(); i++) {
                sum += pair.getValue().get(i);
            }
            mapSum.put(pair.getKey(), sum);
        }
        System.out.println();

        for (HashMap.Entry<String, Integer> pair: mapSum.entrySet()) {
            System.out.println(pair.getKey() + "\t" + pair.getValue());
        }

    } // main -----------------------------------------------------------------------------------
} // Class
