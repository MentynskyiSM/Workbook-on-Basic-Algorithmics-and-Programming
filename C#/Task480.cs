using System;

class Program
{
    static double Min(double a, double b, double c)
    {
        double result = a < b ? a : b;
        if (c < result)
            result = c;
        return result;
    }

    static double Max(double a, double b)
    {
        return a > b ? a : b;
    }

    static void Main()
    {
        double s, t, x, y;

        Console.WriteLine("Enter input values for s, t, x, y");
        string[] parts = Console.ReadLine().Split();
        s = double.Parse(parts[0]);
        t = double.Parse(parts[1]);
        x = double.Parse(parts[2]);
        y = double.Parse(parts[3]);

        double p1 = Min(t, x, y) / Min(s, t, y) -
                    Max(t, s) / Min(s, t, x);

        double p2 = Max(x, y) / Min(s, x, y) -
                    Max(t + s, x + y) / Max(x + s, t + y);

        double p = p1 + p2;

        Console.WriteLine($"p = {p,12:F5}");
    }
}
