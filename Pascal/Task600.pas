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
    end;
    close(database);
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
    end;
    close(database);
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
    end;
    close(database);
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
    end;
    close(database);
end;

function inputbook() : book;
    var result : book;
begin
    writeln('Введіть про нову книгу');
    write('Автор(автори):'); readln(result.author);
    write('Назва:'); readln(result.book_title);
    write('Видавництво:'); readln(result.publisher);
    write('Рік видання:'); readln(result.publish_year);
    write('Ціна:'); readln(result.price);
    write('Кількість:'); readln(result.count);
    inputbook := result;
end;

procedure writenewfile(filename: string);
var choise: integer; 
begin
    assign(database, filename);
    rewrite(database);
    repeat
    tmp := inputbook();  
    write(database, tmp);
    writeln('Додати ще одну книгу?');
    writeln('1 - так, додати ще;');
    writeln('0 - зберегти дані і вийти');
    readln(choise);
    until(choise<>1);
    writeln('нову базу книг стоврено');
    close(database);
end;

procedure writebook(filename: string; data: book);
const tmp_filename = 'database.dump';
var dump_file: file of book;
begin
    assign(database, filename);
    reset(database);
    assign(dump_file, tmp_filename);
    rewrite(dump_file);
    while eof(database)=false do
    begin
        read(database,tmp);
        write(dump_file,tmp)
    end;
    
    write(dump_file, data);
    close(dump_file);
    rewrite(database);
    reset(dump_file);
    while eof(dump_file)=false do
    begin
        read(dump_file,tmp);
        write(database,tmp)
    end;
    writeln('книга додана в базу');
    close(database);
    close(dump_file);
    deletefile(tmp_filename)
end;

begin
  repeat
    writeln('Оберіть потрібну дію:');
    writeln('1 - шукати книгу за назвою.');
    writeln('2 - шукати книги за прізвищем автора.');
    writeln('3 - вивести книги вказаного видавництва');
    writeln('4 - переглянути всі книги в базі');
    writeln('5 - створити/перестворити базу книг.');
    writeln('6 - дописати нову книгу в базу');
    writeln('0 - завершити роботу');
    readln(choise);
    case (choise) of
      1:find_book(db_name);
      2:find_by_author(db_name);
      3:read_by_publisher(db_name);
      4:readall(db_name);
      5:writenewfile(db_name);
      6:writebook(db_name, inputbook());
    end;
  until(choise = 0)
end.
