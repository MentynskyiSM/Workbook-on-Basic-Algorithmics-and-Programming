program Task180;
var n, k : integer;
begin
  writeln ('Введіть номер місяця:');
  readln(n);
  if (n>0) and (n<13) then
  begin
    case (n) of
      2: k:=28;
      4, 6, 9, 11: k:=30;
      1, 3, 5, 7, 8, 10, 12: k:=31;
    end;{закінчення оператора case}
    writeln('Кількість днів: ', k);
  end
  else writeln('Нема такого місяця');
end.
