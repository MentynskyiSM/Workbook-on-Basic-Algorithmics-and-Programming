program Task315;
var P, Q, S: array[1..17] of real;
    i, k: integer;
    m, a, p5, q5, s5: real;
begin
writeln('Введіть масив P');
randomize();{ініціюємо генератор випадкових чисел}
for i:= 1 to 17 do
    readln(P[i]);
for i:= 1 to 17 do
    Q[i] := random(1400)/100 - 7;
m := 0.0; k := 0;
for i:= 1 to 17 do
    if Q[i] < 0 then 
    begin 
        m := m + Q[i]; 
        k := k + 1
    end;
    a := m / k;
for i:= 1 to 17 do
    S[i] := P[i] + a;
{Вибираємо перший елемент за найближчий до 5}
p5 := P[1];
writeln('Масив P');
for i:= 1 to 17 do
begin
    write(P[i]:8:2);
    if abs(P[i] - 5) < abs(p5 - 5) then p5 := P[i];
end;
writeln(); {Перехід на новий рядок}
writeln('Найближче до 5 число ', p5:8:2);
q5 := Q[1];
writeln('Масив Q');
for i:= 1 to 17 do
begin
    write(Q[i]:8:2);
    if abs(Q[i] - 5) < abs(q5 - 5) then q5 := Q[i];
end;
writeln(); {Перехід на новий рядок}
writeln('Найближче до 5 число ', q5:8:2);
s5 := S[1];
writeln('Масив S');
for i:= 1 to 17 do
begin
    write(S[i]:8:2);
    if abs(S[i] - 5) < abs(s5 - 5) then s5 := S[i];
end;
writeln(); {Перехід на новий рядок}
writeln('Найближче до 5 число ', s5:8:2)
end.
