using System;

public class Task165
{
    public static void Main()
    {
        double a, b, c, d;
        Console.WriteLine("Введіть коефіцієнти нерівності");
        a = double.Parse(Console.ReadLine());
        b = double.Parse(Console.ReadLine());
        c = double.Parse(Console.ReadLine());

        d = b * b - 4 * c;
        if (d < 0) // друга нерівність не має коренів
        {
            Console.WriteLine($"x Є [{a}; +inf)");
        }
        else
        {
            if (d == 0)
            {
                double x0 = -b / 2;

                if (a < x0)
                {
                    Console.WriteLine(
                        $"x Є [{a:F3}; {x0:F3}) U ({x0:F3}; +inf)");
                }
                else
                {
                    if (a == x0)
                        Console.WriteLine($"x Є ({a:F3}; +inf)");
                    else
                        Console.WriteLine($"x Є [{a:F3}; +inf)");
                }
            }
            else // гілка, що виконується лише коли d > 0
            {
                double x1 = (-b - Math.Sqrt(d)) / 2;
                double x2 = (-b + Math.Sqrt(d)) / 2;
                // формули для x1 та x2 дають x1 < x2

                if (a < x1)
                {
                    Console.WriteLine(
                        $"x Є [{a:F3}; {x1:F3}) U ({x2:F3}; +inf)");
                }
                else
                {
                    if (a <= x2)
                        Console.WriteLine($"x Є ({x2:F3}; +inf)");
                    else
                        Console.WriteLine($"x Є [{a:F3}; +inf)");
                }
            }
        }
    }
}
