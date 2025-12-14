using System;
using System.Collections.Generic;
namespace Task345
{
  class Program
  {
    public static void Main(string[] args)
    {
      int []A, B;
      int sizeA, sizeB;
      Console.WriteLine("Введіть розмір масиву A");
      sizeA = Convert.ToInt32(Console.ReadLine());
      A = new int[sizeA];// CLR дозволяє створювати 
            // масиви в ході виконання програми
      Console.WriteLine("Введіть елементи масиву A");
      for (int i = 0; i < sizeA; i++)
      {
        A[i] = Convert.ToInt32(Console.ReadLine()); 
      }
      Console.WriteLine("Введіть розмір масиву B");
      sizeB = Convert.ToInt32(Console.ReadLine());
      B = new int[sizeB];
      Console.WriteLine("Введіть елементи масиву B");
      for (int i = 0; i < sizeB; i++)
      {
        B[i] = Convert.ToInt32(Console.ReadLine());
      }
      //Для масиву C використовуємо список
      List<int> listC = new List<int>();
      listC.Add(A[0]);// записуємо в список перший 
      //елемент A, переглядаємо решту його елементів
      for (int i = 1; i < sizeA; i++)
      {
        bool present = false;
        foreach(int el in listC)
        {
          if (el == A[i])
          {
            present = true;
            break;  //завершуємо перевірку достроково 
          } //якщо такий елемент знайдено
        }
        if (!present)
        {
          listC.Add(A[i]);
        }
      }
      //Переревіряємо котрі з елементів масиву B
      //потрібно дописати до списку C
      for (int i = 0; i < sizeB; i++)
      {
        bool present = false;
        foreach (int el in listC)
        {
          if (el == B[i])
          {
            present = true;
            break;
          }
        }
        if (!present)
        {
          listC.Add(B[i]);
        }
      }
      Console.WriteLine("Масив A:");
      for(int i = 0; i < A.Length; i++)
      {
        Console.Write($"{A[i]} ");
      }
      Console.WriteLine();
      Console.WriteLine("Масив B:");
      for(int i = 0; i <B.Length; i++)
      {
        Console.Write($"{B[i]} ");
      }
      Console.WriteLine();
      Console.WriteLine("Масив C:");
      for(int i = 0; i < listC.Count; i++)
      {
        Console.Write($"{listC[i]} ");
      }
      Console.WriteLine();
    }
  }
}
