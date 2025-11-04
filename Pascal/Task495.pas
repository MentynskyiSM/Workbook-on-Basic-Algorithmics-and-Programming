program Task495;
var m, s, a, b, max_a: integer;
function isprime(n : integer) : integer;
var p, max_div, result : integer;
begin
  result := 0; {для початку перевірки припускаємо, що
    отримане число просте, якщо в ході перевірки знайдеться
    який-небудь його дільник, то він буде результатом
    функції, якщо ж ні, то функція поверне 0 }
  max_div := round(sqrt(n));
  for p := 2 to max_div do
    begin
      if n mod p = 0 then
        begin
          result := p;
          break;
      end
    end;   
  isprime := result;
end;
begin
  write('Введіть парне натуральне число для ');
  writeln('перевірки гіпотези Гольдбаха >>');
  readln(m);
  max_a := m div 2 + 1;
  for a := 2 to max_a do
  begin
    s := isprime(a);
    {якщо s>0, то a складене, переходимо до 
    наступного значення}
    if s > 0 then continue;
    b := m - a;
    s := isprime(b);
    if s > 0 then
      continue
    {якщо s>0, то b складене, переходимо до 
    наступного значення a}
    else
      {якщо s=0 і для a, і для b, то потрібний розклад у
      вигляді суми простих чиcел знайдено,
      гіпотезу підтверджено }
      break
  end;
  if a = max_a then 
    writeln('Гіпотеза Гольдбаха не підтверджується')
  else
  begin
    writeln(m, ' = ', a, ' + ', b);
    writeln('Гіпотезу Гольдбаха підтверджено')
  end
end.
