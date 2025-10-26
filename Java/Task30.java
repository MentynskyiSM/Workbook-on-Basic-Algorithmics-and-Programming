//пакет класу Scanner, використаного для вводу даних
import java.util.*;
//класичний компілятор пакет lang підключає автоматично
 
class Task30 {
  public static void main (String[] args) {
    final double PI = 3.141593; 
    double a; //довжина ребра куба
    // Створюємо об’єкт класу Scanner для вводу даних
    Scanner scanner = new Scanner(System.in);
    a = scanner.nextDouble();//інструкція вводу даних
    double v;//оголошення змінної для об'єму
    v = a * a * a;
    double r3, r;
    r3 = 3 * v /(4 * PI);
/* усі математичні функції, в тому числі, піднесення
 до степеня є статичними методами бібліотечного кладсу
Math, тому викликаються від його імені*/
    r = Math.pow(r3, 1.0/3.0);
//вивід результату
    System.out.println("Радіус кулі " + r);
    scanner.close();
  }
}
