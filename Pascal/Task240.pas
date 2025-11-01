program Task240;
const eps = 0.00001;
var x, s, u, f : double;
n: integer;
begin
    writeln('Введіть значення змінної x');
    readln(x);
    s := 1; n := 2; u := x / 4;
    while abs(u) > eps do 
    begin
        s := s + u;
        u := -x * (4 * n - 5) / (4 * n) * u;
        n := n + 1
    end;
    f :=  sqrt(sqrt(1 + x));
    {корінь 4-степеня можна записати і так}
    writeln('Сума ряду s = ', s:12:5);
    writeln('Значення функції f = ', f:12:5);
    writeln('Кількість доданків : ', n - 1 )
end.
