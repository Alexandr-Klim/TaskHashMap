import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Сколько номеров вы хотите добавить? ");
        int number = input.nextInt();
        input.nextLine();

        Map<String, String> phoneBook = new HashMap<>();

        for (int i = 0; i < number; i++) {
            System.out.println("Введите имя: ");
            String name = input.nextLine();
            System.out.println("Введите номер: ");
            String phone = input.nextLine();
            phoneBook.put(name, phone);
        }
        System.out.println("Введите имя, чей номер хотите найти: ");
        String name = input.nextLine();
        if (phoneBook.containsKey(name)) {
            System.out.println("Номер для " + name + ": " + phoneBook.get(name));
        } else {
            System.out.println("Такого контакта нет в книге");
        }
    }
}
