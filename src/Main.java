import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        System.out.println("Домашнее задание: Введение в коллекции. Ассециативные массивы ___________________________ ");
        System.out.println();
        System.out.println("Домашнее задание 1. Задание 2. Доработка рецептов.....  ");
        System.out.println();

        HashMap<Product,Integer> basket1 = new HashMap<>();
        basket1.put(new Product("Сельдь", 250, 1),2);
        basket1.put(new Product("Лук", 25, 1),1);
        basket1.put(new Product("Майонез", 75, 0.4),1);
        basket1.put(new Product("Сыр Ламбер", 750, 1),0);

        HashMap<Product,Integer> basket2 = new HashMap<>();
        basket2.put(new Product("Сельдь", 250, 1),2);
        basket2.put(new Product("Лук", 25, 1),1);
        basket2.put(new Product("Майонез", 75, 0.4),1);
        basket2.put(new Product("Майонез1", 70, 0.4),0);


        Recipe recipe1 = new Recipe("Рецепт 1",basket1);
        Recipe recipe2 = new Recipe("Рецепт 2", basket2);

// Расчет суммарной стоимости продуктов по каждому рецепту в зависимости от количества продукта:
        System.out.println(recipe1.sumCostProd);
        System.out.println(recipe2.sumCostProd);
    }
}
