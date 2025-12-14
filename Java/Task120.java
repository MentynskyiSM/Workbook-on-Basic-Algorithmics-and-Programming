
//пакет класу Scanner, використаного для вводу даних
import java.util.*;

public class Task120 {
    public static void main(String[] args) {
        System.out.println("Введіть натуральне число " +
                "від 1 до 9999 включно");
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        // первірка, чи користувач ввів коректне число
        if (n > 0 && n < 10000) {
            if (n < 10)
                System.out.printf(
                        "%5d - одноцифрове число\n", n);
            // одну інструкцію після if можна ставити без {}
            else {
                if (n < 100) {
                    System.out.printf("%5d - двоцифрове число\n", n);
                } else {
                    if (n < 1000) {
                        System.out.printf(
                                "%5d - трицифрове число\n", n);
                    } else
                        System.out.printf(
                                "%5d - чотирицифрове число\n", n);
                }
            }
        } else
            System.out.println("Ви ввели число, " +
                    "що не належить вказаному відрізку");
        input.close();
    }

}
