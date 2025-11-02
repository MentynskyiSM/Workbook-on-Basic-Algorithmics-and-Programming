import java.util.*;
public class Task345 {
    public static void main(String[] args) {
        int A[], B[];    int sizeA, sizeB;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть розмір масиву A");
        sizeA = scanner.nextInt();
        A = new int[sizeA];// Java Virtual Machine
        //створює масиви  в ході виконання програми
        System.out.println("Введіть елементи масиву A");
        for (int i = 0; i < sizeA; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.println("Введіть розмір масиву B");
        sizeB = scanner.nextInt();
        B = new int[sizeB];
        System.out.println("Введіть елементи масиву B");
        for (int i = 0; i < sizeB; i++) {
            B[i] = scanner.nextInt();
        }
        //Для масиву C використовуємо список
        ArrayList<Integer> listC = new ArrayList<>();
        listC.add(A[0]);// записуємо в список перший
        //елемент A та переглядаємо решту елементів
        for (int i = 1; i <sizeA; i++) {
            boolean present = false;
            for (Integer el: listC){
                if(el==A[i]) {
                    present = true;
                    break; //завершуємо перевірку
                } //якщо такий елемент вже знайдено
            }
            if(!present){
                listC.add(A[i]);
            }
        }
        for (int i = 0; i <sizeB; i++) {
            boolean present = false;
            for (Integer el: listC){
                if(el==B[i]) {
                    present=true;
                    break;
                }
            }
            if(!present){
                listC.add(B[i]);
            }
        }
        System.out.println("Масив A:");
        for (int i = 0; i < A.length; i++){
            System.out.printf("%5d",A[i]);
        }
        System.out.println();
        System.out.println("Масив B:");
        for (int i = 0; i < B.length; i++){
            System.out.printf("%5d",B[i]);
        }
        System.out.println();
        System.out.println("Масив C:");
        for (int i = 0; i < listC.size(); i++){
            System.out.printf("%5d",listC.get(i));
        }
        System.out.println();
        scanner.close();
    }
}
