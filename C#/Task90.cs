using System;
public class Program
{
	public static void Main()
	{
		int t, tm;
        Console.WriteLine("Введіть кількість секунд, що пройшла після опівночі:");
		// зчитування цілого числа з консолі
		t = int.Parse(Console.ReadLine());
		tm = t / 60;
		int s = t % 60;
		int h = tm / 60;
		int m = tm % 60;
		Console.WriteLine(
		string.Format("Час {0,2:D2}:{1,2:D2}:{2,2:D2}", h, m, s));//форматний вивід 
	}
}
