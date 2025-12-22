using System;

public class Task195
{
    public static void Main()
    {
        double a, u = 1, s = u;

        Console.WriteLine("Введіть значення a");
        a = double.Parse(Console.ReadLine());

        Console.WriteLine("Введіть значення n");
        int n = int.Parse(Console.ReadLine());

        for (int i = 0; i < n; i++)
        {
            u *= -a;
            s += u;
        }

        Console.WriteLine($"Значення суми s = {s:F3}");
    }
}
