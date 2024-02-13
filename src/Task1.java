public class Task1 {
    public static void main(String[] args) {
        int depositAmount = 0;
        int months = 0;
        System.out.println("Месяц Сумма вклада");
        while (depositAmount <= 2459000) {
            depositAmount += 15000;
            months++;
            //В задании было сказано про проценты, но без уточнений, поэтому я оставила 12% годовых из прошлой задачи
            //money += money * 0.01;
            System.out.printf("%-5d %d%n", months, depositAmount);
        }
    }
}
