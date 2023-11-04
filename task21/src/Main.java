import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        int largest = 0;


        while (counter <= 10) {
            System.out.print("Введите число #" + counter + ": ");
            int number = scanner.nextInt();


            if (number > largest) {
                largest = number;
            }

            counter++;
        }


        System.out.println("Самое большое введенное число: " + largest);
        scanner.close();
    }
}
