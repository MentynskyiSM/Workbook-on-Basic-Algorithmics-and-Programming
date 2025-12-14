import java.util.*;
public class Task90
{
	public static void main(String[] args)
	{
		int t, tm;
        System.out.println("Введіть кількість секунд, що пройшла після опівночі:");
		Scanner input =  new Scanner(System.in);
		// зчитування цілого числа з консолі
		t = input.nextInt();
		tm = t / 60;
		int s = t % 60;
		int h = tm / 60;
		int m = tm % 60;
		System.out.printf("Час %02d:%02d:%02d", h, m, s);//форматний вивід 
		input.close();
	}
}
