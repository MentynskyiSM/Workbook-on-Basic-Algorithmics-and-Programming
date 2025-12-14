using System;
namespace Task300
{
    class Program
    {
        public static void Main(string[] args)
        {
            // оглошуємо масив та створюємо його
            int [] visits = new int [24]; 
            Console.WriteLine("Ведіть відвідуваність " +
                "сайту кожної години протягом доби");
            //вводимо елементи масиву в циклі
            for (int i = 0; i < 24; i++)
            {
                visits[i] = Convert.ToInt32(
                                Console.ReadLine());
                //дані з консолі вводяться у формі
                // тексту, тому їх слід конвертувати
                // у відповідний числовий тип 
            }
            int s = 0;
            //цикл по елементах списку
            for (int i = 0; i < 24; i++)
            {
                s += visits[i];
            }
            double a = (double)s / 24;
            //приводимо s до дійсного типу
            //інакше буде виконуватися ділення націло
            Console.WriteLine("Добова відвідуваність " +
             a + " відвідувачів на годину.");
            Console.WriteLine("Задайте відхилення у %");
            //оголошену змінну ініціалізуємо даними,
            // отриманими з консолі
            double p  = Convert.ToDouble(
                                 Console.ReadLine());
            Console.WriteLine("Години з менш, ніж "+ p +
                      "-відсотковим відхиленням від " +
                        "середньої відвідуваності:");
            for (int i = 0; i < 24; i++)
            {
                if(Math.Abs(visits[i] - a) < a * p / 100)
                {// години номеруємо 1..24
                    Console.WriteLine(i + 1);
                }
            }
        }
    }
}
