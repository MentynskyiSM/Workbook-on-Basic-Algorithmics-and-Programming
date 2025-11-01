program Task150;
const  a = 7.7; {параметр a описуємо як константу}
var x,y: real;
begin
  writeln('x = ');
  readln(x);
  if(x >= 0) and (x <= 5) then  { умова xЄ[0;5] }
    y := x*exp(1/3*ln(a*x*x*x + sin(x)));
  if x < 0 then
    y := a*sin(x)*sin(x)*sin(x);
  if x > 5 then
    y := ln(abs(x*x*x-exp(x)))/ln(x);
  writeln('y = ', y:12:5);
end.
