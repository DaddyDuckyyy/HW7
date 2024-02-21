import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число первой пятницы: ");
        int friday = in.nextInt();
        do {
            System.out.println("Сегодня пятница, " + friday + "-е число");
            friday += 7;
        } while (friday <= 31);
        in.close();
    }
}
