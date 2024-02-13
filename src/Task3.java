public class Task3 {
    public static void main(String[] args) {
        int totalPopulation = 12000000;
        int mortality = 8000;
        int fertility = 17000;
        for (int i = 1; i <= 10; i++) {
            totalPopulation = totalPopulation - mortality + fertility;
            System.out.println(i + " год, численность населения: " + totalPopulation);
        }
    }
}
