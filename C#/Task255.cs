using System;

public class Task255
{
    public static void Main()
    {
        Console.WriteLine("Введіть межі для x");
        double a = double.Parse(Console.ReadLine());
        double b = double.Parse(Console.ReadLine());

        double x = a;
        double hx = (b - a) / 7.0;

        Console.WriteLine("Введіть межі для y");
        double c = double.Parse(Console.ReadLine());
        double d = double.Parse(Console.ReadLine());

        double y = c;
        double hy = (d - c) / 7.0;

        Console.Write("y\\x  ");

        // Верхній рядок із значеннями x
        for (int i = 0; i < 8; i++)
            Console.Write($"{x + hx * i,8:F2}");

        Console.WriteLine();

        // Основна таблиця
        for (int i = 0; i < 8; i++)
        {
            Console.Write($"{y,5:F2}");
            x = a;

            for (int j = 0; j < 8; j++)
            {
                double u = Math.Sqrt(2 * x * y + 4 * y * y * y);
                Console.Write($"{u,8:F2}");
                x += hx;
            }

            Console.WriteLine();
            y += hy;
        }
    }
}
