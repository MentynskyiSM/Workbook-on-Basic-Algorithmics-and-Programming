program Task480;
var t, s, x, y : real; 
    p, p1, p2 : real;
function min(a, b, c: real): real;
var result:real;
begin
    if a < b then result := a
        else result := b;
    if c < result then result := c;
    min := result
end;
function max(a, b : real): real;
begin
    if a > b then max := a
        else max := b
end;
begin
    writeln ('Введіть вхідні дані (s,t,x,y)');
    readln(s, t, x, y);
    {Значення виразу знайдемо як суму двох частин
    віднімемо перші два дороби і наступні два}
    p1 := min(t, x, y) / min(s, t, y) -
        max(t, s) / min(s, t, x);
    p2 := max(x, y) / min(s,x,y) -
        max(t + s, x + y) / max(x + s, t + y);
    p := p1 + p2;
    writeln('Значення виразу ', p:12:5);
end.