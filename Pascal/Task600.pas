program Task600;
uses sysutils;
{Оголошуємо тип даних для опису однієї книги}
type book = record
    publisher : string[50];
    book_title : string[255];
    author : string[100];
    publish_year : integer;
    price : real;
    count : integer
    end;
const db_name : string = 'books_shop.db';
var tmp : book;
    database : file of book;
    choise : integer;
    
procedure readall(filename: string);
    var data: book;
begin
    assign(database, filename);
    reset(database);
    
    while eof(database)=false do
    begin
        read(database,data);
        writeln(data.author,'  ',data.book_title,
        ' ', data.publisher,' ',data.publish_year);
    end    
end;

procedure find_by_author(filename: string);
    var data: book;
    author : string[100]; {змінна для пошуку 
    співпадає за типом з відповідним полем запису}
begin
    assign(database, filename);
    reset(database);
    write('Введіть прізвище автора:');
    readln(author);
    while eof(database)=false do
    begin
        read(database,data);
        if pos(author, data.author) > 0 then
            writeln(data.author,'  ',data.book_title,
            ' ', data.publisher,' ',data.publish_year);
    end    
end;

procedure find_book(filename: string);
    var data: book;
    book_title : string[255];{локальна змінна для
        назви книги, або фрагмента назви}
begin
    assign(database, filename);
    reset(database);
    write('Введіть назву книги, або її частину:');
    readln(book_title);
    while eof(database)=false do
    begin
        read(database,data);
        if pos(book_title, data.book_title) > 0 then
            writeln(data.author,'  ',data.book_title,
            ' ', data.publisher,' ',data.publish_year);
    end    
end;
procedure read_by_publisher(filename: string);
    var data: book;
    publisher : string[50]; {локальна змінна для пошуку 
    співпадає за типом з відповідним полем запису}
begin
    assign(database, filename);
    reset(database);
    write('Видавництво:'); readln(publisher);
    while eof(database) = false do
    begin
        read(database,data);
        if data.publisher = publisher then
        writeln(data.author,'  ',data.book_title,
        ' ', data.publisher,' ',data.publish_year);
    end    
end;

begin
  repeat
    writeln('Оберіть потрібну дію:');
    writeln('1 - шукати книгу за назвою.');
    writeln('2 - шукати книги за прізвищем автора.');
    writeln('3 - вивести книги вказаного видавництва');
    writeln('4 - перегляднути всі книги в базі');
    writeln('0 - завершити роботу');
    readln(choise);
    case (choise) of
      1:find_book(db_name);
      2:find_by_author(db_name);
      3:read_by_publisher(db_name);
      4:readall(db_name);
    end;
  until(choise = 0)
end.
