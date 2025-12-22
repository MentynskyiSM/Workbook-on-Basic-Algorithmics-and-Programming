using System;

// public class Task225
// {
//     public static void Main()
//     {
        int m, f, fp = 1, fn = 1, n = 2;

        Console.WriteLine("Введіть число m");
        m = int.Parse(Console.ReadLine());

        while (fn < m)
        {
            f = fp + fn;
            fp = fn;
            fn = f;
            n++;
        }

        if (fn == m)
        {
            Console.WriteLine($"Число {m} є {n}-им числом Фібоначчі");
        }
        else
        {
            Console.WriteLine($"Найближче до {m} справа число Фібоначчі: {fn}");
        }
//     }
// }
