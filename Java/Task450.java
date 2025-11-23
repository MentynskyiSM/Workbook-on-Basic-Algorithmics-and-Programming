import java.util.*;

public class Task450 {
    public static void main(String[] args) {
        // список навчальних предметів
        List<String> subjects = Arrays.asList("Алгеба",
                     "Хімія", "Фізика", "Інформатика");
        // список студентів
        List<String> students = new ArrayList<>(Arrays
       .asList("Вовк", "Заєць", "Ведмідь", "Лис", "Лось"));
        // результати сесії: студент -> (предмет -> оцінка)
        Map<String, Map<String, Integer>> session = 
                                  new LinkedHashMap<>();
        Random rnd = new Random();
        for (String student : students) {
            Map<String, Integer> marks =
                              new LinkedHashMap<>();
            for (String subject : subjects) {
                marks.put(subject, 50 + rnd.nextInt(51));
            }
            session.put(student, marks);
        }
        // друк результатів
        System.out.println("Успішність студентів:");
        for (String student : session.keySet()) {
            System.out.print(student + " : ");
            for (String subject :
                   session.get(student).keySet()) {
                System.out.print(subject + " - " +
              session.get(student).get(subject) + "; ");
            }
            System.out.println();
        }
        // формуємо рейтинг
        System.out.println("Невпорядкований рейтинг");
        Map<String, Double> rating = new LinkedHashMap<>();
        for (String student : session.keySet()) {
            int sum = 0;
            int count = session.get(student).size();
            for (String subject : 
                 session.get(student).keySet()) {
                sum += session.get(student).get(subject);
            }
            double rate = (double) sum / count;
            rating.put(student, rate);
            System.out.println(student + " : " + rate);
        }
        // формуємо список студентів за рейтингом
        List<String> ratingList = new ArrayList<>();
        for (String student : rating.keySet()) {
            int id = 0;
            for (String surname : ratingList) {
                if (rating.get(surname) <
                            rating.get(student)) {
                    break;
                }
                id++;
            }
            ratingList.add(id, student);
        }
        // друк рейтингу
        System.out.println("Рейтинг студентів ");
        for (String student : ratingList) {
            System.out.println(student + " : " +
                  rating.get(student));
        }
    }
}
