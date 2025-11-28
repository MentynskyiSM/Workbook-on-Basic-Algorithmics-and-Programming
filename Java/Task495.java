import java.util.Scanner;
public class Task495 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Задайте парне натуральне " +
          "число для перевірки гіпотези Гольдбаха:\n");
    int m = scanner.nextInt();
    int max_a = m / 2 + 1;
    int a, b = 0;
    for (a = 2; a < max_a; a++)
    {
      // якщо a складене, переходимо до наступного значення
        // boolean-результат методу можемо використовувати
      // в якості умови для оператора розгалуження
      if (!isPrime(a)) continue;
       // тут вже відомо, що а просте число, бо, якщо a
       // не є простим оператор if вище перерве виконання
       // поточної ітерації і код нижче не виконуватиметься
      b = m - a;
       // якщо при цьому число b також виявиться простим
       // то цикл пошуку простих доданків можна завершити
       // достроково і перейти до повідомлення результату
      if(isPrime(b)) break;
    }
    if (a == max_a)
    {
      System.out.println("Гіпотезу Гольдбаха " + 
                                    "не підтверджено");
    }
    else
    {
      System.out.printf("%10d  = %10d + %10d\n", m, a, b);
      System.out.println("Гіпотезу Гольдбаха" + 
                                        " підтверджено");
    }
    scanner.close();
  }

    // для "внутрішнього" використання в методі main
    // метод-підпрограму можна оголошувати з будь-яким
    // рівнем доступу, в т. ч. private
    // статичний public-метод можна використовувати
    // в інших класах
    public static boolean isPrime(int n){
      boolean result = true;
      int max_div = (int) Math.sqrt(n);
      for (int p = 2; p <= max_div; p++){
        if (n % p == 0){
          result = false;
          break;
        }
      }
      return result;
    }
}
