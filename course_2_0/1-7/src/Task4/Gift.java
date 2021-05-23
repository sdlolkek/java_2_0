package Task4;

public class Gift {
    public static void main(String[] args) {
        Zefir zefir1 = new Zefir("Коломенский", 100, 150, "вишневый");
        Snikers snikers1 = new Snikers("Сникерс", 50, 75, "лесной орех");
        GummyBears gummybears1= new GummyBears("Мармеладные мишки", 80.0, 82.5,"зелёные");
        SweetStuff[] gift = {zefir1, snikers1, gummybears1};
        double commonPrice = 0;
        double commonWeight = 0;
        for (SweetStuff element : gift){
            commonPrice = commonPrice + element.getPrice();
            commonWeight = commonWeight + element.getWeight();
            System.out.println(element.toString());
        }
        System.out.println("Общая цена " + commonPrice);
        System.out.println("Общая вес " + commonWeight);
    }

}
