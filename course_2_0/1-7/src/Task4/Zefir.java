package Task4;
/**
 * @author Elizaveta Kornakova
 * Класс Сникерс - наследник класса  "Сладость"(SweetStuff)
 * @see SweetStuff поля и методы которого наследует этот класс
 * @see #flavour уникальное поле класса, которое отвечает за запах зефира
 */

public class Zefir extends SweetStuff{
    private String flavour;

    public Zefir(String name, double weight, double price, String flavour) {
        super(name, weight, price);
        this.flavour = flavour;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    @Override
    public String toString() {
        return "Zefir: " + super.toString() + ", flavour = " + flavour;
    }
}
