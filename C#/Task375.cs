using System;

class Program
{
  static void Main(string[] args)
  {
    const int size = 6;
    int[,] M = new int[,]{ {1, 2, 3, 4, 5, 6},
                           {1, 3, 5, 7, 9, 1},
                           {1, 4, 4, 3, 9, 1},
                           {1, 2, 3, 4, 5, 6},
                           {2, 2, 2, 3, 3, 5},
                           {9, 8, 7, 6, 4, 2}};
    Console.WriteLine("Do you want to enter matrix " +
                        "elements?(yes\\no)"); ;
    string choise = Console.ReadLine();
    if (choise == "yes")
    {
      for (int i = 0; i < size; i++)
      {
        for (int j = 0; j < size; j++)
        {
          M[i,j] = Convert.ToInt32(Console.ReadLine());
        }
      }
    }
    // Шукаємо максимальні елементи рядків
    // і зберігаємо їх в окремому масиві
    int[] max = new int[size];
    for (int i = 0; i < size; i++)
    {
      max[i] = M[i, 0];
      for (int j = 0; j < size; j++)
      {
        if (M[i, j] > max[i]) max[i] = M[i, j];
      }
    }
    Console.WriteLine("Matrix M:");
    for (int i = 0; i < size; i++)
    {
      for (int j = 0; j < size; j++)
      {
        Console.Write(string.Format("{0, 5}",M[i, j]));
      }
      Console.WriteLine();
    }
    //Виконуємо перетворення
    for (int i = 0; i < size; i++)
    {
      M[i, i] = max[i];
    }
    Console.WriteLine("Transformation result:");
    for (int i = 0; i < size; i++)
    {
      for (int j = 0; j < size; j++)
      {
        Console.Write(string.Format("{0, 5}",M[i, j]));
      }
      Console.WriteLine();
    }
  }
}
