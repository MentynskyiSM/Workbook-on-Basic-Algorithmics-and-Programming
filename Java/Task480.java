import java.util.*;
public class Task480{
// головний метод - основна прошграма
  public static void main(String[] args) {
    System.out.println("Введіть вхідні дані (s,t,x,y)");
    Scanner scanner = new Scanner(System.in);
    double s = scanner.nextDouble();
    double t = scanner.nextDouble();
    double x = scanner.nextDouble();
    double y = scanner.nextDouble();
    /*Значення виразу знайдемо як суму двох частин a
      віднімемо перші два дороби і наступні два*/
    double p1 = min(t, x, y) / min(s, t, y) -
        max(t, s) / min(s, t, x);
    double p2 = max(x, y) / min(s,x,y) -
        max(t + s, x + y) / max(x + s, t + y);
    double p = p1 + p2;
    System.out.printf("Значення виразу %12.5f ", p);
    scanner.close();
  }
// підпрограма для знаходження меншого з трьох чисел
  static double min(double a, double b, double c) {
    double result;// змінна для результату методу
    if (a < b) result = a;
    else result = b;
    if (c < result) result = c;
    return result;
  }
// підпрограма для знаходження більшого з двох чисел
  static double max(double a, double b) {
    double result;// змінна для результату методу
    if(a > b) result = a; 
    else result = b;
    return result;
  }
}
