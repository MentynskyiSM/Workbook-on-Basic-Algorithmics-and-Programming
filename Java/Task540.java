import java.util.*;

public class Task540 {
    private static final int SIZE = 12;
    // глобальний об'єкт сканера використовуємо для вводу даних у 
    // різних підпрограмах, оголошуємо к статичне поле класу з програмою
    private static Scanner scanner;

    // головна програма – метод main
    public static void main(String args[]) {
        scanner = new Scanner(System.in);
        // створення масивів за допомогою підпрограми
        double A[] = create_array();
        double B[] = create_array();
        // створення масиву C
        double SumA = 0, min_d1;
        for (int i = 0; i < SIZE; i++) {
            SumA += A[i];
        }
        double avg = SumA / SIZE;
        double C[] = new double[SIZE];
        for (int i = 0; i < SIZE; i++) {
            if (B[i] < 0) {
                C[i] = avg;// заміняємо середнім
            } else {
                C[i] = B[i];// беремо з масиву B
            }
        }

        System.out.println("Масив A:");
        print_array(A);// вивід масиву
        min_d1 = min_dist_el(A);// пошук найближчого до 1
        System.out.printf("\nНайближчий до 1 елемент %10.2f\n",
                min_d1);
        System.out.println("Масив B:");
        print_array(B);
        min_d1 = min_dist_el(B);// пошук найближчого до 1
        System.out.printf("\nНайближчий до 1 елемент %10.2f\n",
                min_d1);
        System.out.println("Масив C:");
        print_array(C);
        min_d1 = min_dist_el(C);// пошук найближчого до 1
        System.out.printf("\nНайближчий до 1 елемент %10.2f\n", min_d1);
        scanner.close();
    }

    // метод для створення нового масиву
    public static double[] create_array() {
        // Scanner scanner = new Scanner(System.in);
        int sign = -1;// -1^n при n = 1
        System.out.print("p = ");
        double p = scanner.nextDouble();
        System.out.print("q = ");
        double q = scanner.nextDouble();
        // створюємо новий масив
        double m[] = new double[SIZE];
        // запоанюємо масив елементами
        for (int i = 0; i < SIZE; i++) {
            m[i] = sign * Math.sqrt(((i + 1) * (i + 1) + p) *
                    (i + 1 + q * q));
            sign *= -1; // обчислення -1 ^ (k + 1)
        }
        // повертаємо створений масив
        // scanner.close();
        return m;
    }

    // метод пошуку найближчого до 1 елемента масиву
    public static double min_dist_el(double m[]) {
        double min = m[0];// початкове наближення
        // його відстань до 1
        double dist = Math.abs(min - 1);
        for (int i = 0; i < SIZE; i++) {
            if (Math.abs(m[i] - 1) < dist) {
                // знайдено новий елемент найближчий до 1
                min = m[0];
                dist = Math.abs(min - 1);
            }
        }
        return min;
    }

    // метод для виводу масиву на екран
    public static void print_array(double m[]) {
        for (int i = 0; i < SIZE; i++) {
            System.out.printf("%6.2f, ", m[i]);
        }
        System.out.println();
    }
}
