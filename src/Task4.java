public class Task4 {
    public static void main(String[] args) {
        int depositAmount = 15000;
        int months = 0;
        System.out.println("Месяц Сумма вклада");
        while (depositAmount <= 12000000) {
            depositAmount += depositAmount * 0.07;
            months++;
            System.out.printf("%-5d %d%n", months, depositAmount);
        }
    }
}
