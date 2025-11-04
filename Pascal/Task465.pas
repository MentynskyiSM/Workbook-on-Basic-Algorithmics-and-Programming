program Task465;
var  a, b, x, y, p: real;
{функція для обчислення виразів з радикадлами}
function f(u, v: real): real;
begin
    {обчислений результат передається за іменем функції}
    f := exp(1/3 * ln( u * v * v));
end;

{головна програма}
begin
    writeln('Введіть значення a та b');
    readln(a, b);
    writeln('Введіть значення x і y');
    readln(x, y);
    p := (f(y, b) + f(x, a)) * (f(b, x) - f (a, y));
    writeln('Значення виразу', p:10:4);
end.
