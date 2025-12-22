public class Task180{
   public static void main(String[] args) {
      System.out.println("Введіть номер місяця: ");
      int n, k=0;// k виводиться у будь-якому випадку
      //воно залишиться 0 при вводі неправильного номера
      java.util.Scanner scanner = 
                     new java.util.Scanner(System.in); 
      n = scanner.nextInt();
      switch(n){
         case 2: k=28; break;
         case 4: //перемикач у java дозволяє використуовати
         case 6: //тестові змінні, але списки значень також
         case 9: //не дозволені тому використовуємо групу
         case 11: k=30; break;// case до першого break  
         case 1: 
         case 3: 
         case 5:
         case 7: 
         case 8: 
         case 10:
         case 12: k=31; break;
         default: System.out.print("Нема такого місяця "); 
      }
      System.out.println("Кількість днів " + k);
    scanner.close();
    }
}
