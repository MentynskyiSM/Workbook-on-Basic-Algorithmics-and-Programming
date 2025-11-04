program Task540;
const SIZE = 12;
type my_array = array[1..SIZE] of real;

var A, B, C : my_array; i : integer;
    SumA, min_d1, avg: real;
{в підпрограмі для заповнення масиву сам масив 
 повинен бути вхідно-вихідним параметром (var)}
procedure create_array(var m: my_array);
var p, q: real; i, sign: integer;
begin
    sign := -1;// -1^n при n = 1
    writeln('p = '); readln(p);
    writeln('q = '); readln(q);
    for i := 1 to SIZE do
    begin
        m[i] := sign * sqrt((i * i + p)*
            (i + q * q));
        sign := sign * -1; // обчислення -1 ^ (k + 1)
    end;
end;

procedure print_array(m : my_array);
var i: integer;
begin
    for i := 1 to SIZE do
        write(m[i]:7:2);
    writeln(); {завершення стрічки з виводом масиву}
end;

function min_dist_el(m: my_array): real;
var min, dist : real; i: integer;
begin
    min := m[1]; {початкове наближення для пошуку}
    { його відстань до 1}
    dist := abs(min - 1);
    for i := 1 to SIZE do
        if abs(m[i] - 1) < dist then
        begin {знайдено новий елемент найближчий до 1}
            min := m[i];
            dist := abs(min - 1);
        end;
    min_dist_el := min;
end;
begin
    {заповнення масивів за допомогою підпрограми}
    create_array(A);
    create_array(B);
    {заповненя  третього масиву C}
    SumA := 0;
    for i := 1 to SIZE do
        SumA := SumA + A[i];
    avg := SumA / SIZE;
    for i := 1 to SIZE do
        if B[i] < 0 then
            C[i] := avg {заміняємо середнім}
        else
            C[i] := B[i]; {беремо з масиву B}
    { закінчення циклу заповнення масиву C }
    
    {опрацювання масивів}
    writeln('Array A:');
    print_array(A); {вивід масиву A}
    min_d1 := min_dist_el(A); {пошук найближчого до 1}
    writeln('Closess to 1 is ', min_d1:10:2);
    writeln('Array B:');
    print_array(B); {вивід масиву B}
    min_d1 := min_dist_el(B); {пошук найближчого до 1}
    writeln('Closess to 1 is ', min_d1:10:2);
    writeln('Array C:');
    print_array(C); {вивід масиву C}
    min_d1 := min_dist_el(C); {пошук найближчого до 1}
    writeln('Closess to 1 is ', min_d1:10:2)
end.