/**
 * @author Elizaveta Kornakova
 * @see #findLongestWord()
 * @see #createMassive()
 */
package Task3;

import java.util.Scanner;

public class Massive {
    Scanner in = new Scanner(System.in);
    /**
     *Метод, в котором создается массив определенной длины
     */
    public String[] createMassive(){
        int length;
        String[] myWords;
        System.out.println("Введите число слов в массиве");
        length = in.nextInt();
        myWords = new String[length];
        return myWords;
    }

    /**
     *Метод, в котором:
     * 1. Массив заполняется словом
     * 2. Сравнивается длина этого слова с максимумом
     */
    public void findLongestWord(){
        String [] myArray = this.createMassive();
        int i;
        int max = 0;
        int wordLength = 0;
        int wordsPlace = 0;
        for (i = 0; i < myArray.length; i++){
            System.out.println("Введите слово");
            myArray[i] = in.next();
            wordLength = myArray[i].length();
            if (wordLength > max){
                max = wordLength;
                wordsPlace = i;
            }
        }
        System.out.println(myArray[wordsPlace]);
    }
}
