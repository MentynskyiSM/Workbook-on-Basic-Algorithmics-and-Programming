program Task255;
var a, b, c, d, u, x, hx, y, hy : double;
    i, j : integer;
begin
    writeln('Задайте відрізок для змінної x');
    readln( a, b);{з консолі можна читати кілька значень}
    x := a; hx := (b - a) / 7;
    writeln('Задайте відрізок для змінної y');
    readln( c, d);
    y := c; hy := (d - c) / 7;
    write(' y\x ');{подальший вивід буде в тому ж рядку}
    {виводимо заголовок таблиці зі значеннями х}
    for i := 0 to 7 do write((x + hx * i):8:3);
    writeln();{перехід на новий рядок}
    {Зовнішній цикл за аргументом y}
    for i := 1 to 8 do
    begin
        write(y:5:2);
        x := a; {вкладений цикл за аргументом х}
        for j := 1 to 8 do
        begin
            u := sqrt(2 * x * y + 4 * y * y * y);
            write(u:8:2);
            x := x + hx;
        end;
        writeln();
        y := y + hy;
    end
end.
