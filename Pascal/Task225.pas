program Task225;
var m, f, fp, fn, n: integer;
begin
    fp := 1; fn := 1; {початкові члени послідовності}
    n := 2; {n - номер останнього числа послідовності}
    writeln('Введіть натуральне число:');
    readln(m);
    while fn < m do
    begin
        f := fp + fn;
        {переходимо до пари наступних чисел Фібоначчі}
        fp := fn; fn := f; n := n + 1
    end;
    if fn = m then
        writeln( m, ' є ', n, '-им числом Фібоначчі')
    else  writeln( 'Найближче до ', m, 
        ' справа число Фібоначчі: ', fn);
end.
