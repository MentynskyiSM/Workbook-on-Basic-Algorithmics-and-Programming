import java.util.*;
import static java.lang.Math.*; //статичний імпорт дозволяє 
// використовувати методи класу Math без посилання на нього
public class Task150{
    public static void main(String[] args) {
        final double a = 7.7; //параметр a, константа
        Scanner scanner = new Scanner(System.in);
        System.out.print("x = ");
        double x = scanner.nextDouble();
        double y = 0.0;//змінна повинна бути ініціалізована
        //оскільки компілятор вважає, що програма може не 
        // виконати жоден з блоків обчислення в if
        if(x >= 0 && x <= 5){
            y = x*pow(a*x*x*x + sin(x),1.0/3);
        }
        if(x < 0){ y = a*sin(x)*sin(x)*sin(x); }
        if(x > 5){
            y = log(abs(x*x*x-exp(x)))/log(x);
        }
        System.out.printf("y = %12.5f\n",y);
        scanner.close();
    }
}

