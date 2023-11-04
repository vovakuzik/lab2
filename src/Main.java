import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalMiles = 0;
        int totalGallons = 0;
        int tripCount = 0;

        System.out.println("Введите количество миль и количество использованных галлонов для каждой поездки (-1 для выхода):");

        // Цикл с использованием индикатора
        while (true) {
            System.out.print("Введите количество миль (или -1 для выхода): ");
            int miles = scanner.nextInt();

            if (miles == -1) {
                break;
            }

            System.out.print("Введите количество использованных галлонов (или -1 для выхода): ");
            int gallons = scanner.nextInt();

            if (gallons == -1) {
                break;
            }

            double milesPerGallon = (double) miles / gallons;
            System.out.printf("Миль на галлон для этой поездки: %.2f\n", milesPerGallon);

            totalMiles += miles;
            totalGallons += gallons;
            tripCount++;

            double combinedMilesPerGallon = (double) totalMiles / totalGallons;
            System.out.printf("Общее количество миль на галлон для всех поездок: %.2f\n", combinedMilesPerGallon);
        }

        System.out.println("Спасибо за использование калькулятора пробега!");
        scanner.close();
    }
}
