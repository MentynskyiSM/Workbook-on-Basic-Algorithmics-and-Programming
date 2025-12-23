using System;

public class Task240
{
    public static void Main()
    {
        double x, u, s = 1, eps = 0.00001;

        Console.WriteLine("Введіть значення x");
        x = double.Parse(Console.ReadLine());

        u = x / 4;
        int n = 2;

        while (Math.Abs(u) > eps)
        {
            s += u;
            u *= -x * (4 * n - 5) / (4 * n);
            n++;
        }

        Console.WriteLine($"Значення суми s = {s:F6}");
        Console.WriteLine($"Значення функції: {Math.Pow(1 + x, 0.25):F6}");
        Console.WriteLine("Кількість доданків " + (n - 1));
    }
}
