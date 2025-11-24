program Task405;
var i, j: integer; p:char;  
    m: array[1..6,1..6] of integer =((2,3,4,5,6,7),
        (7,7,7,7,7,9),(1,2,3,4,5,6),
        (4,5,12,2,3,4),(1,1,1,14,5,3),(9,8,5,2,4,3));
        max: array[1..6] of integer;
begin
    writeln('Ввести дані для матриці? y/n');
    readln(p);
    if p = 'y' then
    begin 
        {Ввід матриці}
        for i:=1 to 6 do
            for j:=1 to 6 do
                readln(m[i,j]);
    end;
{Формування вектора для заміни в матриці}
    for i:=1 to 6 do
    begin
        max[i] := m[i, 1]; 
        for j:=1 to 6 do
            if m[i, j] > max[i] then 
                    max[i]:= m[i, j];
    end;
{Вивід  матриці M}
    writeln('Початкова матриця M:');
    for i:=1 to 6 do
    begin
        for j:=1 to 6 do
            write(m[i,j]:10);
        writeln();{перехід на наступну стрічку}
    end;
{Перетворення матриці M}
    for i:=1 to 6 do
        m[i, i] := max[i];
{Вивід  матриці M після перетворення}
    writeln('Перетворена матриця M:');
    for i:=1 to 6 do
    begin
        for j:=1 to 6 do
            write(m[i,j]:10);
        writeln();{перехід на наступну стрічку}
    end;
end.
