using System;

public class Task150
{
    public static void Main()
    {
        const double a = 7.7; // параметр a, константа

        Console.Write("x = ");
        double x = double.Parse(Console.ReadLine());

        double y = 0.0; // змінна повинна бути ініціалізована

        if (x >= 0 && x <= 5)
        {
            y = x * Math.Pow(a * x * x * x + Math.Sin(x), 1.0 / 3.0);
        }

        if (x < 0)
        {
            y = a * Math.Sin(x) * Math.Sin(x) * Math.Sin(x);
        }

        if (x > 5)
        {
            y = Math.Log(Math.Abs(x * x * x - Math.Exp(x))) / Math.Log(x);
        }

        Console.WriteLine($"y = {y,12:F5}");
    }
}
