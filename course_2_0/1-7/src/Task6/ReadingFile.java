package Task6;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Есть файл, в который записаны слова через пробел
 * Программа 1) считывает слова из текста
 * 2) сортирует список слов в алфавитном порядке
 * 3) подсчитывает, сколько раз встретилось каждое слово
 * 4) выводит на консоль слова, которые встретились самое большое количество раз
 */

public class ReadingFile {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> wordsFromText = new ArrayList<String>(); //чтобы хранить слова из текста (динамический)
        Map<String, Integer> wordsCount = new HashMap<>(); //чтобы считать, сколько каждое слово встретилось в тексте
        File file = new File("C:\\Users\\User.DESKTOP-MS6PKSN\\IdeaProjects\\first_try\\src\\Task6\\read_me.txt");
        Scanner scanner = new Scanner(file);
        //считываем слова из файла и добавляем их в ArrayList, заранее приводя к нижнему регистру, чтобы их удобнее было считать
        while (scanner.hasNext()) {
            String fileWord = scanner.next();
            wordsFromText.add(fileWord.toLowerCase());
        }
        Collections.sort(wordsFromText); // сортируем ArrayList в алфавитном порядке
        System.out.println(wordsFromText.toString()); //выводим отсортированный список на экран
        //в цикле подсчитываем, сколько каждое слово встречается в тексте
        for (String word : wordsFromText) {
            if (!wordsCount.containsKey(word)) {
                wordsCount.put(word, 1); //добавляем слово как ключ в словарь, значение -- сколько слово встретилось в тексте
            } else {
                wordsCount.put(word, wordsCount.get(word) + 1); //при каждом повторении слова, прибавляем к значению единицу
            }
        }

        int maxValueInMap = (Collections.max(wordsCount.values())); //ищем максимальное значение в словаре
        for (Map.Entry<String, Integer> entry : wordsCount.entrySet()) { //ищем ключи с максимальным значением и выводим их на экран
            if (entry.getValue() == maxValueInMap) {
                System.out.println("Встречается больше всего раз: " + entry.getKey() + " -- " + maxValueInMap);
            }
        }
    }
}
