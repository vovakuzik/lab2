public class Main {
    public static void main(String[] args) {
        System.out.println("N\t10*N\t100*N\t1000*N");

        // Вывод таблицы с использованием циклов
        for (int i = 1; i <= 5; i++) {
            int tenTimesN = i * 10;
            int hundredTimesN = i * 100;
            int thousandTimesN = i * 1000;
            System.out.printf("%d\t%d\t%d\t%d%n", i, tenTimesN, hundredTimesN, thousandTimesN);
        }
    }
}
