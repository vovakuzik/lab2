import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Введите число #" + i + ": ");
            int number = scanner.nextInt();


            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest) {
                secondLargest = number;
            }
        }


        System.out.println("Наибольшее введенное число: " + largest);
        System.out.println("Второе наибольшее введенное число: " + secondLargest);

        scanner.close();
    }
}
