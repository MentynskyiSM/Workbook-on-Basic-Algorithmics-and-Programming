program Task345;
var sizeA, sizeB, sizeC, i, j: integer;
    A, B : array [1..1000] of integer;
    C : array [1..2000] of integer;
    present : integer;
begin
    writeln('Введіть розмір масиву A');
    readln(sizeA);
    writeln('Введіть елементи масиву A');
    for i := 1 to sizeA do readln(A[i]);
    writeln('Введіть розмір масиву B');
    readln(sizeB);
    writeln('Введіть елементи масиву B');
    for i := 1 to sizeB do readln(B[i]);
    sizeC := 0;{в sizeC будемо підраховувати кількість 
        елементів доданих в масив C   }
    C[1] := A[1]; 
    sizeC := sizeC + 1; {збільшуємо значення лічильника}
    for i := 1 to sizeA do
    begin
        present := 0;{ встановлюємо значення 0 для
        чергового елемента, якщо після циклу це значення
        залишиться рівним 0, це буде означати, що такого
        елемента в результуючому масиві ще немає}
        for j := 1 to sizeC do
            if A[i]=C[j] then
            begin
                present := 1;
                break
            end;
        {внутрішній цикл по j містить в тілі лише один 
        оператор розгалуження, begin-end не використовуємо,
        тут закінчується  тіло цього циклу}
        if present = 0 then
        begin
            sizeC := sizeC + 1;
            C[sizeC] := A[i]
        end
    end;
    {Переревіряємо котрі з елементів масиву B
    потрібно записати в масив C}
    for i := 1 to sizeB do
    begin
        present := 0;
        for j := 1 to sizeC do
            if B[i]=C[j] then
            begin
                present := 1;
                break
            end; {тут закінчується тіло циклу по j}
        if present = 0 then
        begin
            sizeC := sizeC + 1;
            C[sizeC] := B[i]
        end
    end;
    writeln('Масив A:');
    for i:=1 to sizeA do write(A[i]:8);
    writeln();
    writeln('Масив B:');
    for i:=1 to sizeB do write(B[i]:8);
    writeln();
    writeln('Масив C:');
    for i:=1 to sizeC do write(C[i]:8);
    writeln();
end.
