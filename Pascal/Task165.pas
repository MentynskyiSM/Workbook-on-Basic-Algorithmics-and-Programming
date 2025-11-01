program Task165;
var a, b, c, d : real;
x0, x1, x2 : real;
begin
  writeln('Введіть коефіцієнти нерівності a,b,c');
  readln( a, b, c);
  d := b * b - 4 * c;
  if d < 0 then {друга нерівність не має коренів}
    writeln('[', a:8:2, ';+inf)')    
  else
    {d не менше 0, тобто 0, або більше 0}
    if d = 0 then
      begin
        x0 := -b/2;
        if a < x0 then writeln( 'x Є [', a:8:2, ';', 
               x0:8:2, ') U (', x0:8:2, '; +inf)')
        else 
          if a = x0 then writeln('x Є (', a:8:2, '; +inf)')
          else writeln('x Є [', a:8:2, '; +inf)')
      end
    else  {вітка, що виконується лише коли d > 0}
      begin
        x1 := (-b-sqrt(d))/2;   x2 := (-b+sqrt(d))/2;
        if a < x1 then
          writeln('x Є [', a:8:2, ';', x1:8:2, 
                  ')U(', x2:8:2, ';+inf)')
        else 
          if a <= x2 then 
              writeln('x Є (', x2:8:2, ';+inf)')
          else writeln('x Є [', a:8:2, ';+inf)')
      end    
end.
