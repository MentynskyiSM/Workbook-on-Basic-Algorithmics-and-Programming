using System;

public class Task315
{
    public static void Main()
    {
        double[] P = new double[17];
        double[] Q = new double[17];
        double[] S = new double[17];

        Console.WriteLine("Введіть елементи масиву P");
        for (int i = 0; i < 17; i++)
        {
            P[i] = double.Parse(Console.ReadLine());
        }

        // Генерація масиву Q
        Random rnd = new Random();
        for (int i = 0; i < 17; i++)
        {
            Q[i] = rnd.NextDouble() * 1400 / 100 - 7;
        }

        // Сума від’ємних елементів Q
        double s = 0;
        int count = 0;

        foreach (double d in Q) 
        {
            if (d < 0)
            {
                s += d;
                count++;
            }
        }

        double a = s / count;

        // Формування S[i] = P[i] + a
        for (int i = 0; i < 17; i++)
        {
            S[i] = P[i] + a;
        }

        // Пошук у P елемента, найближчого до 5
        double p5 = P[0];
        Console.WriteLine("Масив P:");

        for (int i = 0; i < 17; i++)
        {
            Console.Write($"{P[i],8:F2}");
            if (Math.Abs(P[i] - 5) < Math.Abs(p5 - 5))
                p5 = P[i];
        }

        Console.WriteLine();
        Console.WriteLine($"Найближче до 5: {p5,10:F2}");

        // Пошук у Q
        double q5 = Q[0];
        Console.WriteLine("Масив Q:");
        for (int i = 0; i < 17; i++)
        {
            Console.Write($"{Q[i],8:F2}");
            if (Math.Abs(Q[i] - 5) < Math.Abs(q5 - 5))
                q5 = Q[i];
        }

        Console.WriteLine();
        Console.WriteLine($"Найближче до 5 {q5,10:F2}");

        // Пошук у S
        double s5 = S[0];
        Console.WriteLine("Масив S:");
        foreach (double x in S)
        {
            Console.Write($"{x,8:F2}");
            if (Math.Abs(x - 5) < Math.Abs(s5 - 5))
                s5 = x;
        }

        Console.WriteLine();
        Console.WriteLine($"Найближче до 5: {s5,10:F2}");
    }
}
