import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice = 0;

        // Цикл продолжается до ввода пользователем корректного значения (1 или 2)
        while (choice != 1 && choice != 2) {
            System.out.println("ваш выбор:");
            System.out.println("1. Опция 1");
            System.out.println("2. Опция 2");
            choice = scanner.nextInt();

            // Проверка ввода
            if (choice != 1 && choice != 2) {
                System.out.println("Некорректный ввод. Пожалуйста, введите 1 или 2.");
            }
        }

        // Вывод выбранной опции
        System.out.println("Вы выбрали опцию " + choice);

        scanner.close();
    }
}
