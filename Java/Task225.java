import java.util.Scanner;
public class Task225 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m, f, fp = 1, fn = 1, n = 2;
        System.out.println("Введіть число m");
        m = scanner.nextInt();
        while(fn<m) {
            f = fp + fn;
            fp = fn; fn = f;
            n++;
        }
        if(fn == m) {
            System.out.println("Число " + m +" є "
                    + n +"-им числом Фібоначчі");
        }else {
            System.out.println("Найближче до " + m +
                     " справа число Фібоначчі: " + fn);
        }
        scanner.close();
    }
}

