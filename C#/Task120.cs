using System;

class Program
{
    public static void Main()
    {
        int n;

        Console.WriteLine("Введіть натуральне число від 1 до 9999 включно");
        n = int.Parse(Console.ReadLine());

        // перевірка, чи користувач задав коректне число
        if (n > 0 && n < 10000)
        {
            if (n < 10)
            {
                Console.WriteLine($"{n} - одноцифрове число");
            }
            else
            {
                if (n < 100)
                {
                    Console.WriteLine($"{n} - двоцифрове число");
                }
                else
                {
                    if (n < 1000)
                    {
                        Console.WriteLine($"{n} - трицифрове число.");
                    }
                    else
                    {
                        Console.WriteLine($"{n} - чотирицифрове число.");
                    }
                }
            }
        }
        else
        {
            Console.WriteLine("Ви ввели число, що не належить вказаному відрізку");
        }
    }
}
