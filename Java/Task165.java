import java.util.Scanner;
public class Task165 {
    public static void main(String[] args) {
      double a,b,c,d;
      System.out.println("Введіть коефіцієнти нерівності");
      Scanner scanner = new Scanner(System.in);
      a = scanner.nextDouble();
      b = scanner.nextDouble();
      c = scanner.nextDouble();
      d = b * b - 4 * c;
      if (d < 0) { //друга нерівність не має коренів
         System.out.println("x Є [" + a + "; +inf)");
      }
      else {
         if (d == 0) {
            double x0 = -b/2;
            if (a < x0) { System.out.printf(
            "x Є [%.3f; %.3f) U (%.3f; +inf)\n",a, x0, x0);
            }
            else {
               if(a == x0) System.out.printf(
                                  "x Є (%.3f; +inf)\n", a); 
             else System.out.printf("x Є [%.3f;+inf)\n",a);
            }
         }
         else {//гілка, що виконується лише коли d > 0
            double x1 = (-b - Math.sqrt(d))/2;
            double x2 = (-b + Math.sqrt(d))/2;
            //формули для x1 та x2 обрані так, що x1 < x2
            if (a < x1)  {
               System.out.printf(
           "x Є [%.3f; %.3f) U (%.3f; +inf)\n", a, x1, x2);
            }
            else{
               if (a <= x2)
               System.out.printf("x Є (%.3f; +inf)\n", x2);
               else 
              System.out.printf("x Є [%.3f; +inf)\n", a);
            }
         }
      }
      scanner.close();
   }
}

