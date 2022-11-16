import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


public class HW2_task2 {
    private int keyArr;
    private String valueArr;
    private static ArrayList<HW2_task2> task2Arr;
//---------------------------------------------------------------------------
    public HW2_task2(int keyArr, String valueArr) {
        this.keyArr = keyArr;
        this.valueArr = valueArr;
    }

    public int getKeyArr() { return keyArr; }
    public String getValueArr() { return valueArr; }

    public void setKeyArr(int keyArr) {
        this.keyArr = keyArr;
    }
    public void setValueArr(String valueArr) {
        this.valueArr = valueArr;
    }
//--------------------------------------------------------------------------------
    public static void main(String[] args) {

        System.out.println("Домашнее задание 2. Задача 2 _____________________________________________ ");
        System.out.println();
/* Создайте Map<Integer, String>, заполните ее 10 произвольными значениями.
Выведите в консоль всё содержимое коллекции в порядке добавления (в формате "ключ:значение"). */

        LinkedHashMap<Integer, String> task2 = new LinkedHashMap<>();
        task2.put(12345,"1 Иван"); task2.put( 50321,"2 Сергей"); task2.put( 54321,"3 Андрей");
        task2.put( 64321,"4 Семён"); task2.put(54021,"5 Ольга"); task2.put(54320,"6 Полина" );
        task2.put(74321,"7 Валя" );  task2.put( 28765,"8 Петр");  task2.put( 56709,"9 Антон");
        task2.put( 16789,"10 Олег");





        for (Map.Entry<Integer, String> pair: task2.entrySet()) {
            System.out.println(pair.getKey() + "\t" + pair.getValue());
        }

    } // main -------------------------------------------------------------------------------------

} // Class

