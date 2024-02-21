import java.time.Year;

public class Task8 {
    public static void main(String[] args) {
        int currentYear = Year.now().getValue();

        for (int i = currentYear - 200; i < currentYear + 100; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }
    }
}
