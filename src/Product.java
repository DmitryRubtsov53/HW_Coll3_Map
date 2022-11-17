import java.util.Objects;

public class Product {

    private String prodName;
    private double cost;
    private double amount;

    public Product(String prodName, double cost, double amount) {
        setProdName(prodName);
        setCost(cost);
        setAmount(amount);
    }
    // getters -----------------------------------------------------------------------
    public String getProdName() { return prodName;
    }
    public double getCost() { return cost;
    }
    public double getAmount() {return amount;
    }

    // setters ----------------------------------------------------------------------
    public void setProdName(String prodName) {
        if ( prodName==null || prodName.isBlank()) {
            throw new RuntimeException("Заполните карточку товара полностью.");
        } else  this.prodName = prodName;
    }
    public void setCost(double cost) {
        if (cost > 0) {
            this.cost = cost;
        } else throw new RuntimeException("Заполните карточку товара полностью.");
    }
    public void setAmount(double amount) {
        if (amount > 0) {
            this.amount = amount;
        } else throw new RuntimeException("Заполните карточку товара полностью.");
    }

    //---------------------------------------------------------------------------------
    @Override
    public String toString() {
        return  prodName + " : цена " + cost +
                "руб., количество - " + amount + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.cost, cost) == 0 && amount == product.amount
                && Objects.equals(prodName, product.prodName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(prodName, cost, amount);
    }
}
