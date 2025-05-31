program Task120;
var n: integer;
begin
  write ('Enter a natural number ');
  writeln ('between 1 and 9999');
  readln(n);
  if (n > 0) and (n < 10000) then
    begin
      if n < 10 then writeln(n, ' - single digit number')
        { після if-then можна ставити лише один оператор}
      else 
        begin
          if n < 100 then
               writeln(n, ' -  two-digit number')
          { розбиття операторів на кілька стрічок 
            компілятор Pascal до уваги не бере }
          else 
            if (n < 1000) then
                writeln(n, ' - three-digit number')
            else 
                writeln(n, ' - four-digit number')
          { if-then-else вважається суцільною 
            синтаксичною конструкцієюЮ тому
            begin .. end можна не ставити }
        end
    end {знак ; ставити перед else не можна}
  else 
    writeln('The number you entered does not ',
             'belong to the specified range.');
end.
