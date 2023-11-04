import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double commissionRate = 0.09;
        double baseSalary = 200;


        System.out.print("Введите количество проданных товаров: ");
        int numberOfItems = scanner.nextInt();

        double totalSales = 0;


        for (int i = 1; i <= numberOfItems; i++) {
            System.out.print("Введите стоимость товара " + i + ": $");
            double itemValue = scanner.nextDouble();
            totalSales += itemValue;
        }


        double earnings = baseSalary + (totalSales * commissionRate);


        System.out.printf("Заработок продавца за прошлую неделю: $%.2f%n", earnings);

        scanner.close();
    }
}
