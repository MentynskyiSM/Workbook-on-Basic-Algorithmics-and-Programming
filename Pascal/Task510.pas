program Task510;
var m: integer;
procedure print_posix(q, n : integer);
begin
  {якщо число n в системі з основою q одноцифорове}
  if n < q then write(n) {виводимо його}
  else
    begin
    { рекурсивний виклик функції для виводу старших 
    розрядів числа з параметром – часткою від ділення}
    print_posix(q, n div q);
    write(n mod q); {виводимо останню цифру числа n}
    end {у системі числення з основою q}
  end;
begin
  writeln('Введіть натуральне число');
  readln(m);
  print_posix(2, m);
  write('(2) = ');
  print_posix(3, m);
  write('(3) = ');
  print_posix(7, m);
  write('(7) = ');
  writeln(m, '(10)');
end.