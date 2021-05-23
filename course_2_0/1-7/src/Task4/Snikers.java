package Task4;
/**
 * @author Elizaveta Kornakova
 * Класс Сникерс - наследник класса  "Сладость"(SweetStuff)
 * @see SweetStuff поля и методы которого наследует этот класс
 * @see #taste уникальное поле класса, которое отвечает за вкус сникерса
 *
 */
public class Snikers extends SweetStuff {
    private String taste;
    public Snikers(String name, double weight, double price, String taste) {
        super(name, weight, price);
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "This snikers: " + super.toString() + ", taste = " + taste;
    }
}
