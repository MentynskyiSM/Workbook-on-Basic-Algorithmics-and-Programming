import java.util.Scanner;

public class Task300 {
    public static void main(String[] args){
        //оглошуємо масив та створюємо його
        int [] visits = new int [24];
        System.out.println("Ведіть відвідуваність " +
                "сайту кожної години протягом доби");
        Scanner input = new Scanner(System.in);
        //вводимо елементи масиву в циклі
        for (int i = 0; i < 24; i++){
            visits[i] = input.nextInt();
        }
        int s = 0;
        //цикл по елементах списку
        for (int i = 0; i < 24; i++){
            s += visits[i];
        }
        double a = (double)s / 24;
        //приводимо s до дійсного типу
        //інакше буде виконуватися ділення націло
        System.out.println("Добова відвідуваність " +
                a + " відвідувачів на годину.");
        System.out.println("Задайте відхилення у %");
        // оголошену змінну ініціалізуємо даними,
        // отриманими з консолі
        double p  = input.nextDouble();
        System.out.println("Години з менш, ніж "+ p +
                "-відсотковим відхиленням від " +
                "середньої відвідуваності:");
        for (int i = 0; i < 24; i++){
            if(Math.abs(visits[i] - a) < a * p / 100) {
                // години номеруємо 1..24
                System.out.printf(" %3d", i + 1);
            }
        }
        input.close();
    }
}



