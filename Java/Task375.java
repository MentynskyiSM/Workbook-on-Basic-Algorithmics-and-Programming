import java.util.Scanner;
public class Task375 {
  public static void main(String[] args) {
    final int size = 6;
    int[][] M = new int[][]{{1, 2, 3, 4, 5, 6},
         {1, 3, 5, 7, 9, 1}, {1, 4, 4, 3, 9, 1},
        {1,2,3,4,5,6}, {2,2,2,3,3,5}, {9,8,7,6,4,2}};
    System.out.println("Бажаєте ввести значення для" +
                "елементів матриці?(yes\\no)");
    Scanner scanner = new Scanner(System.in);
    String choise = scanner.nextLine();
    if (choise.equalsIgnoreCase("yes")) {
      for (int i = 0; i < size; i++) {
        for (int j = 0; j < size; j++) {
          M[i][j] = Integer.parseInt(scanner.nextLine());
        }
      }
    }
    // Шукаємо максимальні елементи рядків
    // і зберігаємо їх в окремому масиві
    int[] max = new int[size];
    for (int i = 0; i < size; i++) {
      max[i] = M[i][0];
      for (int j = 0; j < size; j++) {
        if (M[i][j] > max[i]) max[i] = M[i][j];
      }
    }
    System.out.println("Матриця M:");
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        System.out.printf("%9d", M[i][j]);
      }
      System.out.println();
    }
    //Виконуємо перетворення
    for (int i = 0; i < size; i++) {
      M[i][i] = max[i];
    }
    System.out.println("Перетворена матриця M:");
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        System.out.printf("%9d", M[i][j]);
      }
      System.out.println();
    }
    scanner.close();
  }
}
