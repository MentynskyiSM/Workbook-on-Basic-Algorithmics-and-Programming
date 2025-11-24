program Task360;
var i, j: integer; max, min : real; 
p: array[1..7,1..7] of real; q: array[1..7] of real;
begin
{Заповнення матриці P}
    for i:=1 to 7 do
        for j:=1 to 7 do
            p[i,j] := 10*sin(3*i)/(i+j);

{Обчислення елементів масиву Q}
    for i:=1 to 7 do
    begin            
        max := p[i, 1]; 
        for j:=1 to 7 do
            if p[i, j] > max then max:= p[i, j];
        min := p[1, i];
        for j:=1 to 7 do
            if p[j, i] < min then min := p[j, i];
        q[i] := max - min;     
    end;
    writeln('Матриця P:');
    {Вивід  матриці P}
    for i:=1 to 7 do
    begin
        for j:=1 to 7 do
            write(p[i,j]:10:4);
        writeln();{перехід на наступну стрічку}
    end;
    writeln('Масив Q:');    
    {Вивід  масиву Q}
    for i:=1 to 7 do write(q[i]:10:3);
end.
