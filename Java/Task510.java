import java.util.Scanner;
public class Task510 {
  static void print_posix(int q, int n) {
    if (n < q){
      System.out.printf("%1d",n);
    }
    else {
      print_posix(q, n / q);
      System.out.printf("%1d",n % q);
    }
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введіть ціле число");
    int m =scanner.nextInt();
    print_posix(2, m);
    System.out.print("(2) = ");
    print_posix(3, m);
    System.out.print("(3) = ");
    print_posix(7, m);
    System.out.print("(7) = ");
    System.out.println(m + "(10)");
    scanner.close();
  }
}
