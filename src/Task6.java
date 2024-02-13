public class Task6 {
    public static void main(String[] args) {
        int depositAmount = 15000;
        int months = 0;
        System.out.println("Месяц Сумма вклада");
        while (months <= 108) {
            depositAmount += depositAmount * 0.07;
            months++;
            if (months % 6 == 0) {
                System.out.printf("%-5d %d%n", months, depositAmount);
            }
        }
    }
}
