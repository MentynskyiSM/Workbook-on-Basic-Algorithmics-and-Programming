import java.util.Scanner;

public class Task60 {
    // головний метод - точка входу в програму
    public static void main(String args[]) {
        double x, y;
        Scanner scanner = new Scanner(System.in);
        // пояснення до вводу даних
        System.out.println("Введiть додатнi значення x та y");
        x = scanner.nextDouble();// інструкція вводу даних
        y = scanner.nextDouble();
        // змінні описуємо по мірі їх використання
        double u, v;
        u = Math.cos(x) + Math.sin(y);
        v = Math.exp((3 * x) * Math.log(y)) + Math.exp((5 * y) * Math.log(x));
        double p;
        p = Math.abs(Math.exp(u * u) + Math.exp(-3 * u)) / (Math.log(v) / Math.log(3));
        // форматований вивід p на 10 позицій
        // з 4-ма знаками після коми
        System.out.printf("Значення виразу %10.4f\n", p);
        // функцію printf "плюси" запозичили в С
        scanner.close();

    }
}
