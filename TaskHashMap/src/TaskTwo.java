import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Сколько предметов вы хотите ввести? ");
        int count = input.nextInt();
        input.nextLine();

        Map<String, Integer> list = new HashMap<>();

        for (int i = 0; i < count; i++) {
            System.out.println("Введите название предмета " + (i + 1));
            String name = input.nextLine();

            int minCount = 0;
            int maxCount = 100;
            System.out.println("Введите балл " + "(" + minCount + " - " + maxCount + "): ");

            while (true) {
                int ball = input.nextInt();
                input.nextLine();
                if (ball >= minCount && ball <= maxCount) {
                    list.put(name, ball);
                    break;
                } else {
                    System.out.println("Не верно введено значение");
                }

            }
        }
        System.out.println("Введённые данные: ");
        double countBall = 0.0;
        for (Map.Entry<String, Integer> entry : list.entrySet()) {
            System.out.println(" - " + entry.getKey() + ": " + entry.getValue());
            countBall += (double) entry.getValue();
        }

        System.out.println("\n Средний балл: " + countBall / list.size());
    }
}
