import java.util.Scanner;

public class Task315 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // в оголошенні можна створити декілька масивів
        double P[] = new double[17], Q[] = new double[17];
        double[] S = new double[17];// але зазвичай, окремо
        // оголошення double[] S; та double S[]; тотожні
        System.out.println("Введіть елементи масиву P");
        for (int i = 0; i < 17; i++) {
            P[i] = scanner.nextDouble();
        }
        for (int i = 0; i < 17; i++) {
            Q[i] = Math.random() * 1400 / 100 - 7;
        }
        double s = 0;
        int count = 0;
        for (double d : Q) // Цикл «for each» за елементами
            if (d < 0) { // масиву переглядає усі елемен-
                s += d; // ти масиву Q, поміщаючи їх
                count++; // по черзі у змінну d
            }
        double a = s / count;
        for (int i = 0; i < 17; i++) {
            S[i] = P[i] + a;
        }
        double p5 = P[0];
        System.out.println("Масив P:");
        for (int i = 0; i < 17; i++) {
            System.out.printf(" %8.2f", P[i]);
            if (Math.abs(P[i] - 5) < Math.abs(p5 - 5))
                p5 = P[i];
        }
        System.out.println();// перехід на нову стрічку
        System.out.printf("Найближче до 5: %10.2f \n", p5);
        double q5 = Q[0];
        System.out.println("Масив Q:");
        for (int i = 0; i < 17; i++) {
            System.out.printf(" %8.2f", Q[i]);
            if (Math.abs(Q[i] - 5) < Math.abs(q5 - 5))
                q5 = Q[i];
        }
        System.out.println();// перехід на нову стрічку
        System.out.printf("Найближче до 5 %10.2f \n", q5);
        double s5 = S[0];
        System.out.println("Масив S:");
        for (double x : S) {
            System.out.printf(" %8.2f", x);
            if (Math.abs(x - 5) < Math.abs(s5 - 5))
                s5 = x;
        }
        System.out.println();// перехід на нову стрічку
        System.out.printf("Найближче до 5: %10.2f \n", s5);
        scanner.close();
    }
}