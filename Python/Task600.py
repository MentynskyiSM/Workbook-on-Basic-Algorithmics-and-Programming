import csv
# назва файла з даними у папці з програмою 
db_name = 'books_shop.csv'

# функція для вводу даних про окрему книжку
# формує і повертає словник з даними
def input_book():
	book_title = input('Назва книги: ')
	authors = input('Автори: ')
	publisher = input('Видавництво: ')
	publish_year = int(input('Рік видання: '))
	price = float(input('Ціна: '))
	count = int(input('Кількість: '))
	book = {'book_title' : book_title, 'authors': authors,
		   'publisher' : publisher, 'publish_year': 
		   publish_year, 'price' : price, 'count' : count}
	return book

# функція для створення\перестворення бази
# ввід даних про книжки і запис їх у файл
def write_new_file(filename):
	books = [] # список книг для запису у файл
	again = 1
	with open(filename, 'w', newline='', encoding='cp1251') as file:
		columns = ['book_title', 'authors', 'publisher', 'publish_year', 'price', 'count']
		writer = csv.DictWriter(file, fieldnames=columns)
		writer.writeheader()
		while again > 0:
			books.append(input_book())  
			print('Додати ще одну книгу?')
			print('1 - так, додати ще;')
			print('0 - зберегти дані і вийти')
			again = int(input('>>>'))
		writer.writerows(books)
		print('нову базу книг стоврено')

# зчитування даних про книги з csv-файла 
# та вивід їх на консоль
def read_all(filename):
    with open(filename, 'r', newline='', encoding='cp1251') as file: 
        reader = csv.DictReader(file)
        for row in reader:
            print(row['authors'], ' ', row['book_title'],', - ', row['publisher'], ': ',
			    row['publish_year'],'. ', row['price'], ' грн., ', row['count'], ' в наявності.')

# дозапис даних про нову книгу
def write_book(filename, data):
	with open(filename, 'a', newline='', encoding='cp1251') as file:
		columns = ['book_title', 'authors', 'publisher', 'publish_year', 'price', 'count']
		writer = csv.DictWriter(file, fieldnames=columns)
		writer.writerow(data)

# функція для пошуку записів про книги
# за вказаним прізвищем одного з авторів
def find_by_author(filename):
  author = input('Введіть прізвище автора\n>> ')
  with open(filename, 'r', newline='', 
        encoding='cp1251') as file:
    reader = csv.DictReader(file)
    for row in reader:
      if author in row['authors']:
        print(row['authors'],' ', row['book_title'],', - ', row['publisher'], ': ', row['publish_year'],'. ',
          row['price'],' грн., ' , row['count'], ' в наявності.')

# функція для пошуку записів про книги
# за назвою, або її частиною
def find_by_title(filename):
  book = input('Введіть назву книги\n>> ')
  with open(filename, 'r', newline='', 
        encoding='cp1251') as file:
    reader = csv.DictReader(file)
    for row in reader:
      if book in row['book_title']:
        print(row['authors'],' ', row['book_title'],', - ',
          row['publisher'], ': ', row['publish_year'],'. ',
          row['price'],' грн., ' , row['count'],
          ' в наявності.')

# функція для пошуку записів про книги
# за вказаним видавництвом
def find_by_publisher(filename):
  publisher = input('Введіть видавництво\n>> ')
  with open(filename, 'r', newline='', 
        encoding='cp1251') as file:
    reader = csv.DictReader(file)
    for row in reader:
      if publisher == row['publisher']:
        print(row['authors'],' ', row['book_title'],', - ',
          row['publisher'], ': ', row['publish_year'],'. ',
          row['price'],' грн., ' , row['count'],
          ' в наявності.')

# Основна програма ненульове значення для входу в цикл
choise = 7 
# за умовою в меню 0 - вихід з циклу, якщо 
# ініціалізувати choise нулем, цикл не виконається
# жодного разу, а оголошення та ініціалізація
# змінної choise потрібні до початку циклу   
while choise != 0:
    print('Оберіть потрібну дію:')
    print('1 - пошук книг за автором')
    print('2 - пошук книг за назвою')
    print('3 - пошук книг за видавництвом')
    print('4 - переглянути всі книги в базі')
    print('5 - створити/перестворити базу книг.')
    print('6 - дописати нову книгу в базу')
    print('0 - завершити роботу програми')
    choise = int(input('>>>  '))
    if choise == 1:
        find_by_author(db_name)
    elif choise == 2:
        find_by_title(db_name)
    elif choise == 3:
        find_by_publisher(db_name)
    elif choise == 4:
        read_all(db_name)
    elif choise == 5:
        write_new_file(db_name)
    elif choise == 6:
        write_book(db_name, input_book())
