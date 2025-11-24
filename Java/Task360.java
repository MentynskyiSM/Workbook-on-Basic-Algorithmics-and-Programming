public class Task360 {
  public static void main(String[] args) {
    //Оголошення та створення
    //двовимірного масиву дійсних чисел
    double p[][] = new double [7][7];
    // Заповнення матриці p. 
    // Використовуємо пару вкладених циклів 
    // за індексами елементів
    // індекси елементів пробігають значення 0..6
    for (int i = 0; i < 7; i++){
      for (int j = 0; j < 7; j++) {
      //у виразі враховуємо, що індекси i, j
      //набувають значень 0..6 а не 1..7
        p[i][j] = 10 * Math.sin(3 * (i+1) )
                         / (i + 1 + j + 1);
      }
    }

    //Обчислення елементів масиву Q
    double q[] = new double[7];
    for(int i = 0; i < 7; i++){
      double max = p[i][0];
      for (int j = 0; j < 7; j++){
        if (p[i][j] > max) max = p[i][j];
      }
      double min = p[0][i];
      for (int j = 0; j < 7; j++){
        if (p[j][i] < min) min = p[j][i];
      }
      q[i] = max - min;
    }
    // Вивід  матриці P
    System.out.println("Матриця P:");
    for (int i = 0; i < 7; i++){
      for (int j = 0; j < 7; j++){
        System.out.printf("%10.3f", p[i][j]);
      }
      System.out.println();
    }
    //Вивід  масиву Q
    System.out.println("Масив Q:");
    for (int i = 0; i < 7; i++){
      System.out.printf("%10.3f", q[i]);
    }
  }
}
