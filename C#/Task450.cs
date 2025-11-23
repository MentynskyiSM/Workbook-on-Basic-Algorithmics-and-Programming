using System;
using System.Collections.Generic;

public class Task450
{
    public static void Main(string[] args)
    {
        // список навчальних предметів
        List<string> subjects = new List<string>
        {
            "Алгеба", "Хімія", "Фізика", "Інформатика"
        };
        // список студентів
        List<string> students = new List<string>
        {
            "Вовк", "Заєць", "Ведмідь", "Лис", "Лось"
        };
        // результати сесії: студент -> (предмет -> оцінка)
        Dictionary<string, Dictionary<string, int>> session =
            new Dictionary<string, Dictionary<string, int>>();

        Random rnd = new Random();
        foreach (var student in students)
        {
            var marks = new Dictionary<string, int>();

            foreach (var subject in subjects)
            {
                marks[subject] = 50 + rnd.Next(51);
            }
            session[student] = marks;
        }
        // друк результатів
        Console.WriteLine("Успішність студентів:");
        foreach (var student in session.Keys)
        {
            Console.Write(student + " : ");
            foreach (var subject in session[student].Keys)
            {
                Console.Write(subject + " - " +
                              session[student][subject] + "; ");
            }
            Console.WriteLine();
        }
        // формуємо рейтинг
        Console.WriteLine("Невпорядкований рейтинг");
        Dictionary<string, double> rating =
            new Dictionary<string, double>();
        foreach (var student in session.Keys)
        {
            int sum = 0;
            int count = session[student].Count;
            foreach (var subject in session[student].Keys)
            {
                sum += session[student][subject];
            }
            double rate = (double)sum / count;
            rating[student] = rate;
            Console.WriteLine(student + " : " + rate);
        }
        // формуємо список студентів за рейтингом
        List<string> ratingList = new List<string>();
        foreach (var student in rating.Keys)
        {
            int id = 0;
            foreach (var surname in ratingList)
            {
                if (rating[surname] < rating[student])
                {
                    break;
                }
                id++;
            }
            ratingList.Insert(id, student);
        }
        // друк рейтингу
        Console.WriteLine("Рейтинг студентів ");
        foreach (var student in ratingList)
        {
            Console.WriteLine(student + " : " + rating[student]);
        }
    }
}
