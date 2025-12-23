using System;

public class Task360
{
    public static void Main(string[] args)
    {
        // Оголошення та створення двовимірного масиву дійсних чисел
        double[,] p = new double[7, 7];

        // Заповнення матриці p
        for (int i = 0; i < 7; i++)
        {
            for (int j = 0; j < 7; j++)
            {
                p[i, j] = 10 * Math.Sin(3 * (i + 1))
                                / (i + 1 + j + 1);
            }
        }

        // Обчислення елементів масиву q
        double[] q = new double[7];
        for (int i = 0; i < 7; i++)
        {
            double max = p[i, 0];
            for (int j = 0; j < 7; j++)
            {
                if (p[i, j] > max) max = p[i, j];
            }

            double min = p[0, i];
            for (int j = 0; j < 7; j++)
            {
                if (p[j, i] < min) min = p[j, i];
            }

            q[i] = max - min;
        }

        // Вивід матриці P
        Console.WriteLine("Матриця P:");
        for (int i = 0; i < 7; i++)
        {
            for (int j = 0; j < 7; j++)
            {
                Console.Write($"{p[i, j],10:F3}");
            }
            Console.WriteLine();
        }

        // Вивід масиву Q
        Console.WriteLine("Масив Q:");
        for (int i = 0; i < 7; i++)
        {
            Console.Write($"{q[i],10:F3}");
        }
    }
}
