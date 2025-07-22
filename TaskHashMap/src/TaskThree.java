import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Сколько телефонных записей вы хотите добавить? ");
        int count = input.nextInt();
        input.nextLine();

        Map<String, ArrayList<String>> phoneBook = new HashMap<>();


        for (int i = 0; i < count; i++) {
            System.out.println("Введите имя: ");
            String name = input.nextLine();
            System.out.println("Введите номер: ");
            String phone = input.nextLine();
            if (!phoneBook.containsKey(name)) {
                phoneBook.put(name, new ArrayList<>());
            }
            phoneBook.get(name).add(phone);

        }
        System.out.println("Введите имя, чей номер хотите найти: ");
        String name = input.nextLine();
        if (phoneBook.containsKey(name)) {
            System.out.println(name + ": ");
            for (String phone : phoneBook.get(name)) {
                System.out.println(" - " + phone);
            }
        } else {
            System.out.println("Такого контакта нет в книге");
        }

        System.out.println("\n Полный список контактов: ");

        for (Map.Entry<String, ArrayList<String>> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

