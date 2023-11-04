import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер счета (-1 для выхода): ");
        int номерСчета = scanner.nextInt();

        // Строка с условием завершения ввода
        while (номерСчета != -1) {
            System.out.print("Введите баланс в начале месяца: ");
            int начальныйБаланс = scanner.nextInt();

            System.out.print("Введите общую сумму всех товаров, купленных в этом месяце: ");
            int общиеПокупки = scanner.nextInt();

            System.out.print("Введите общую сумму всех кредитов, примененных в этом месяце: ");
            int общиеКредиты = scanner.nextInt();

            System.out.print("Введите разрешенный кредитный лимит: ");
            int кредитныйЛимит = scanner.nextInt();

            // Вычисление нового баланса
            int новыйБаланс = начальныйБаланс + общиеПокупки - общиеКредиты;

            System.out.printf("Новый баланс: %d\n", новыйБаланс);

            // Проверка, превысил ли новый баланс кредитный лимит
            if (новыйБаланс > кредитныйЛимит) {
                System.out.println("Превышен кредитный лимит");
            } else {
                System.out.println("Кредитный лимит не превышен");
            }

            System.out.print("\nВведите номер счета (-1 для выхода): ");
            номерСчета = scanner.nextInt();
        }

        System.out.println("Спасибо за использование калькулятора кредитного лимита!");
        scanner.close();
    }
}
