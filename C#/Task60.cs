using System;

// class Task60
// {
//     // головний метод — точка входу в програму
//     public static void Main(string[] args)
//     {
        double x, y;

        // пояснення до вводу даних
        Console.WriteLine("Введiть додатнi значення x та y");
        x = double.Parse(Console.ReadLine()); // інструкція вводу даних
        y = double.Parse(Console.ReadLine());

        // змінні описуємо по мірі їх використання
        double u, v;
        u = Math.Cos(x) + Math.Sin(y);
        v = Math.Exp((3 * x) * Math.Log(y))
          + Math.Exp((5 * y) * Math.Log(x));

        double p;
        p = Math.Abs(Math.Exp(u * u) + Math.Exp(-3 * u))
            / Math.Log(v, 3); // логарифм за основою 3

        // форматований вивід p на 10 позицій
        // з 4-ма знаками після коми
        Console.WriteLine("Значення виразу {0,10:F4}", p);
//     }
// }
