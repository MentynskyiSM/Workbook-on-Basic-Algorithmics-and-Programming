import java.util.Scanner;
public class Task195 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, u = 1, s = u;
        System.out.println("Введіть значення a");
        a = scanner.nextDouble();
        System.out.println("Введіть значення n");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            u *= -a;
            s += u;
        }
        System.out.printf("Значення суми s = %.3f", s);
        scanner.close();
    }
}
