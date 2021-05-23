package Task4;
/**
 @author Elizaveta Kornakova
  * Программа,чтобы найти максимальный отрицательный элемент массива
  * и минимальный положительный
  * @see #getRandomNumber(int, int) нужен для того, чтобы заполнить массив случайными числаи
 */
public class Massive20 {
    public static void main(String[] args) {
        int[] myArray20 = new int[20];
        int max = 0;
        int min = 10;
        int minPlace = 0;
        int maxPlace = 0;
        int replacement;
        Massive20 myMassive20 = new Massive20();
        //заполняю массив и сравниваю числа на минимум и максимум
        for (int i = 0; i < 20; i++) {
            myArray20[i] = myMassive20.getRandomNumber(-10, 10);
            if (myArray20[i] < max) {
                max = myArray20[i];
                maxPlace = i;
            } else if (myArray20[i] > 0 && myArray20[i] < min) {
                min = myArray20[i];
                minPlace = i;
            }
        }
        /*
        Блок кода, чтобы увидеть созданный массив и проверить правильность определения максимума и минимума
        for (int i = 0; i < 20; i++) {
            System.out.print(myArray20[i] + " ");
        }
        System.out.println("\n");
        System.out.println(minPlace);
        System.out.println(maxPlace);
        */
        replacement = myArray20[minPlace];
        myArray20[minPlace] = myArray20[maxPlace];
        myArray20[maxPlace] = replacement;
        /*
        Блок кода,чтобы увидеть массив,в котором поменяли местами элементы
        for (int i = 0; i < 20; i++) {
            System.out.print(myArray20[i] + " ");
        }
         */
    }
    /**
     * @param min - нижняя граница диапазона
     * @param max - верхняя граница диапазона
     * @return int value - случайное число из данного диапазона
     */
    public int getRandomNumber(int min, int max){
        return (int) ((Math.random() * (max - min)) + min);
    }





}
