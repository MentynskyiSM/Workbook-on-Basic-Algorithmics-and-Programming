#include <iostream>
#include <fstream>
#include "Windows.h"
using namespace std;
//Оголошуємо тип даних для опису однієї книги
struct book
{
  char publisher[50];
  char book_title[255];
  char author[100];
  int publish_year;
  double price;
  int count;
};
//назва файлу з даними
const char db_name[] = "books_shop.db";
//прототип функції для читання усіх книг
void readall(const char *);
//прототип функції для вводу даних про окрему книгу
book inputbook();
//функція для створення нового файлу з книгами 
void writenewfile(const char* filename);
//прототип функції для дозапису нової книги у файл
void writebook(const char*, book);
//прототип функції для пошуку книг за авторами
void show_by_authors(const char*, const char*);
//прототип функції для пошуку книг за назвою
void show_by_name(const char*, const char*);
//прототип функції для пошуку книг за видавництвом
void show_by_publisher(const char*, const char*);

//головна функція (програма)
int main()
{
  SetConsoleCP(1251); SetConsoleOutputCP(1251);
  int choise;
  do {
    system("cls");
    cout << "Оберіть потрібну дію : \n";
    cout << "1 - шукати книги за прізвищем автора \n";
    cout << "2 - шукати книги за назвою \n";
    cout << "3 - шукати книги за видавництвом \n";
    cout << "4 - переглянути всі книги в базі \n";
    cout << "5 - створити/перестворити базу книг. \n";
    cout << "6 - дописати нову книгу в базу \n";
    cout << "0 - завершити роботу програми \n";
    cin >> choise; cin.get();
    char buff[255] = {};//фрагмент тексту для пошуку
    switch (choise) {
    case 1:
      cout << "Введіть прізвище автора: ";
      cin.getline(buff, 255);
      show_by_authors(db_name, buff);
      break;
    case 2:
      cout << "Введіть назву книги або її частину: ";
      cin.getline(buff, 255);
      show_by_name(db_name, buff);
      break;
    case 3:
      cout << "Введіть назву видавництва: ";
      cin.getline(buff, 255);
      show_by_publisher(db_name, buff);
      break;
    case 4:
      readall(db_name);
      break;
    case 5:
      writenewfile(db_name);
      break;
    case 6:
      book tmp = inputbook();
      writebook(db_name, tmp);
      break;
    }
  } while (choise != 0);
  
  return 0;
}

void readall(const char* filename)
{
  book data;
  FILE* database;
  fopen_s(&database, filename, "rb");
  while (true)
  {
    int count = fread(&data, sizeof(data), 1, database);
    if (count == 0) break;
    cout << data.author << " " << data.book_title
      << " " << data.publisher << " " 
        << data.publish_year << endl;
  }
  system("pause");
  fclose(database);
}
 
book inputbook()
{
  book result;
  cout << "Введіть інформацію про нову книгу\n";
  cout << "Автор(автори):";
  cin.getline(result.author, 100);
/* функція getline використовується для читання з консолі
    тексту влючно з пробілами та розділовими знаками,
    результат читання поміщається в змінну, передану першим
    параметром, а другий її параметр обмежує максимальну 
    кількість символів, яку можна прочитати*/
  cout << "Назва:";
  cin.getline(result.book_title, 255);
  cout << "Видавництво:";
  cin.getline(result.publisher, 50);
  cout << "Рік видання:"; cin >> result.publish_year;
  cout << "Ціна:"; cin >> result.price;
  cout << "Кількість:"; cin >> result.count;
  cin.get();//зчитує символ закінчення рядка
  //який залишається після вводу числових даних
  //і може бути сприйнятий програмою як текст
  //при наступному вводі текстових даних
  return result;
}

void writenewfile(const char* filename)
{
  FILE* database;
  int choise;
  book tmp;
  fopen_s(&database, filename, "wb");
  do {
    tmp = inputbook();
    fwrite(&tmp, sizeof(tmp), 1, database);
    cout << "Додати ще одну книгу ? \n";
    cout << "1 - так, додати ще;\n";
    cout << "0 - зберегти дані і вийти.\n";
    cin >> choise; cin.get();
  }while(choise == 1);
  cout << "нову базу книг стоврено"<< endl;
  fclose(database);
}

void writebook(const char* filename, book data)
{
  FILE *database, *dump_file;
  // відкриваємо існуючий файл "бази даних" 
  // для запису даних в кінець файлу
  fopen_s(&database, filename, "ab");
  //дописуємо нову книгу в файл та закриваємо його
  fwrite(&data, sizeof(book), 1, database);
  // записуємо дані з буфера на диск
  fflush(database);
  // закриваємо файл
  fclose(database);
  cout << "книга додана в базу" << endl;
  system("pause");
}

void show_by_authors(const char* filename, 
                               const char* author)
{
  book data;
  FILE* database;
  fopen_s(&database, filename, "rb");
  while (true)
  {
    int count = fread(&data, sizeof(data), 1, database);
    if (count == 0) break;
    if (strstr(data.author, author) != NULL)
    {/*Функція strstr повертає покажчик на перший символ 
     першого входження вказаного фрагмента 
     у задану стрічку. Якщо співпадіння не 
     знайдено, - повертається нульовий вказівник NULL*/
      cout << data.author << " " << data.book_title
        << " " << data.publisher << " "
        << data.publish_year << endl;
    }
  }
  system("pause");
}

void show_by_name(const char* filename, 
                            const char* title_fragment)
{
  book data;
  FILE* database;
  fopen_s(&database, filename, "rb");
  while (true)
  {
    int count = fread(&data, sizeof(data), 1, database);
    if (count == 0) break;
    if (strstr(data.book_title, title_fragment) != NULL)
    {
      cout << data.author << " " << data.book_title
        << " " << data.publisher << " "
        << data.publish_year << endl;
    }
  }
  system("pause");

}

void show_by_publisher(const char* filename, 
                                const char* publisher)
{
  book data;
  FILE* database;
  fopen_s(&database, filename, "rb");
  while (true)
  {
    int count = fread(&data, sizeof(data), 1, database);
    if (count == 0) break;
    if (strcmp(data.publisher, publisher) == 0)
    {
      cout << data.author << " " << data.book_title
        << " " << data.publisher << " "
        << data.publish_year << endl;
    }
  }
  system("pause");
}
