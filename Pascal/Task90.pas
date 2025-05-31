    program mytime;
    {Задана кількість секунд, що пройшла від початку доби до поточного моменту. 
    Вивести поточний момент часу в годинах, хвилинах та секундах.}
    var t,tm: integer;
    h,m,s:integer;
    begin
        write('Time in seconds: ');
    	readln(t);
    	tm := t div 60;
    	s := t mod 60;
    	h := tm div 60;
    	m := tm mod 60;
    	writeln('Formated time: ', h:2,':',
    		m:2,':', s:2);
    end.