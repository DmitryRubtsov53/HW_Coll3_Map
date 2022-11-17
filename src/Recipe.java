import java.util.*;

public class Recipe {

    private final String recipeName;
    private final HashMap<Product,Integer> products;  // для использования в расчетах
    public double sumCostProd;

    public Recipe(String recipeName, HashMap<Product,Integer> products) {
        this.recipeName = recipeName;
        this.products = products;
        for (HashMap.Entry<Product, Integer> pair : products.entrySet()) {
            if (pair.getValue()==0)pair.setValue(1);
            sumCostProd+=pair.getKey().getCost()*pair.getValue();
        }
    }

    // getters -----------------------------------------------------------------------------
    public HashMap<Product, Integer> getProducts() {
        return products;
    }
    public String getRecipeName() {
        return recipeName;
    }
    public double getSumCostProd() {
        return sumCostProd;
    }

    //--------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return "Рецепт " + recipeName + ", состав: " + products +
                ", Сумма стоимости продуктов = " + sumCostProd + " руб.";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(products, recipe.products)
                && Objects.equals(recipeName, recipe.recipeName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(products, recipeName);
    }
}