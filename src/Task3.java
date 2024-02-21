public class Task3 {
    public static void main(String[] args) {
        int totalPopulation = 12000000;
        int mortality = 8;
        int fertility = 17;
        for (int i = 1; i <= 10; i++) {
            totalPopulation += (fertility * totalPopulation / 1000) - mortality * totalPopulation / 1000;
            System.out.println(i + " год, численность населения: " + totalPopulation);
        }
    }
}
