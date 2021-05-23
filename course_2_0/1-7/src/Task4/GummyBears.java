package Task4;
/**
 * @author Elizaveta Kornakova
 * Класс Мармеладные мишки - наследник класса  "Сладость"(SweetStuff)
 * @see SweetStuff поля и методы которого наследует этот класс
 * @see #color уникальное поле класса, которое отвечает за цвет мишек
 */
public class GummyBears extends SweetStuff {
    private String color;
    public GummyBears(String name, double weight, double price, String color) {
        super(name, weight, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "GummyBears: " + super.toString() + ", color = " + color;
    }
}
