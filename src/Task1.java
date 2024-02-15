public class Task1 {
    public static void main(String[] args) {
        int depositAmount = 0;
        int months = 0;
        System.out.println("Месяц Сумма вклада");
        while (depositAmount <= 2459000) {
            depositAmount += 15000;
            months++;
            depositAmount += depositAmount * 0.01;
            System.out.printf("%-5d %d%n", months, depositAmount);
        }
    }
}
