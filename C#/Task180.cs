using System;
public class Task180
{
    public static void Main()
    {
        Console.WriteLine("Введіть номер місяця: ");
        
        int n;
        int k = 0; // k виводиться у будь-якому випадку

        n = int.Parse(Console.ReadLine());

        switch (n)
        {
            case 2:
                k = 28;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                k = 30;
                break;

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                k = 31;
                break;

            default:
                Console.Write("Нема такого місяця ");
                break;
        }

        Console.WriteLine("Кількість днів " + k);
    }
}
