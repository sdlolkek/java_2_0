package Task4;

/**
 * @author Elizaveta Kornakova
 * Абстракный класс "Сладость"(SweetStuff)
 * является "каркасом", на котором будут создаваться другие сладости-классы
 * @see #name название сладости
 * @see #price цена сладости
 * @see #weight вес сладости
 *
 */

public abstract class SweetStuff {
    private String name;
    private double weight;
    private double price;

    public SweetStuff(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return "name = " + name + ", price = " + price + ", weight = " + weight;
    }
}
