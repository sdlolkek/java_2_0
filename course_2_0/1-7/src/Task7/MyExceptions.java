package Task7;

/**
 * Класс для обработки ошибки деления на ноль. Наследник класса Exceptions. Кидает сообщение об ошибке
 * Хотела попробовать написать свое, но кроме сообщения о делении на ноль ничего не придумала :)
 */
public class MyExceptions extends Exception {
    public MyExceptions(String message){
        super(message);
    }

}
