using System;

class Task30
{
    public static void Main(string[] args)
    {
        const double PI = 3.141593;
        double a; // довжина ребра куба
        Console.WriteLine("Введіть довжину ребра куба:");
        a = double.Parse(Console.ReadLine()); // інструкція вводу даних

        double v; // оголошення змінної для об'єму
        v = a * a * a;

        double r3, r;
        r3 = 3 * v / (4 * PI);
        r = Math.Pow(r3, 1.0 / 3.0);

        Console.WriteLine("Радiус кулi " + r);
    }
}
