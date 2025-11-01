program Task195;
var a, s, u: real; n, i : integer;
begin
  u := 1;
  writeln('Введіть значення a = ');   readln(a);
  writeln('Введіть значення n = ');   readln(n);
  s := u;
  for i:=1 to n do
  begin
    u := u * -a; s := s + u;
  end;
  writeln('Шукана сума s = ', s:10:3);
end.
