program Task570;
Uses sysutils; { підключення модуля з деякими 
    системними підпрограмами, зокрема, функцією trim }
var comment, line, tmp: string; 
    javacode: text; 
    c_len, f_len, p_len: integer; comment_koef: real;
    start, stop, len  : integer;
begin
  assign(javacode, 'Task60.java');
  reset(javacode);
  c_len := 0; {кількість символів в коментарях}
  f_len := 0; {загальна довжина тексту у файлі}
  while not eof(javacode) do
  begin
  {читаємо чергову стрічку тексту}
    readln(javacode, tmp);
  {читаємо код програми без зайвих
    пробілів на початку та в кінці стрічки}    
    line := trim(tmp);
    {підраховуємо довжину тексту у файлі}    
    f_len := f_len + length(line);  
  {Вивід однострічкових коментарів}
    start := pos('//',line);
    len := length(line);
    if start > 0 then {гілка виконується, }
    begin {якщо в стрічці знайдено "//"}
      comment := copy(line, start, len - start + 1);
      writeln(comment);
      {підраховуємо загальну довжину коментарів}
      c_len  := c_len + length(comment); 
    end;  
  {Вивід багатосрічкових та блочних коментарів}
    start := pos('/*',line);
    stop := pos('*/',line);
    len := length(line);
    if start > 0 then{ вітка розгалуження} 
    begin{виконується лише, якщо в стрічці }  
      {знайдено символ початку блоку коментаря }
      if stop > 0 then {якщо коментар закінчується}
      begin {в тій же стрічці}
        comment := copy(line, start, stop-start + 3);
        writeln(comment);
        c_len  := c_len + length(comment);
      end
      else
      {коментар багаторядковий, потрібно читати
      наступні рядки з файла доки не зустрінеться 
      знак завершення коментаря }
      begin
        {перша стрічка знайденого коментаря}
        comment := copy(line, start, len-start + 1);
        repeat
            writeln(comment);
            c_len  := c_len + length(comment);
            readln(javacode, tmp);
            line := trim(tmp);
            {врахуємо довжину чергової стрічки з файлу 
             до зальної довжтини тексту у файлі}    
            f_len := f_len + length(line);
            comment := line;
            stop := pos('*/',line);
        until stop > 0; {вихід з циклу, якщо
        знайдено ознаку закінчення коментаря
        виводимо частину стрічки до закінчення коментар}
        comment := copy(line, 1, stop + 2);
        writeln(comment);
        c_len  := c_len + length(comment);
      end
    end  
  end;
  p_len := f_len - c_len;
  writeln('Code without comment has ', p_len, ' symbols');
  comment_koef := 100 * p_len / f_len;
  writeln('Working code is ', comment_koef:6:2,
                '% of the total text character');
  close(javacode);
end.