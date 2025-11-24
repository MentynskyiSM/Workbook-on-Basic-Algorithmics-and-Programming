#include <iostream>
#include <math.h>
using namespace std;

int main()
{ //Оголошення та створення двовимірного
    double p[7][7];// масиву дійсних чисел
    // Заповнення матриці p. Використовуємо пару
    // вкладених циклів за індексами елементів,
    // індекси елементів пробігають значення 0..6
    for (int i = 0; i < 7; i++)
    {
        for (int j = 0; j < 7; j++)
        {//у виразі враховуємо, що індекси i, j  
            //набувають значень 0..6 а не 1..7 
            p[i][j] = 10 * sin(3 * (i+1) )
                / (i + 1 + j + 1);
        }
    }
    //Обчислення елементів масиву Q
    double q[7];
    for(int i = 0; i < 7; i++)
    {
        double max = p[i][0];
        for (int j = 0; j < 7; j++)
        {
            if (p[i][j] > max) max = p[i][j];
        }
        double min = p[0][i];
        for (int j = 0; j < 7; j++)
        {
            if (p[j][i] < min) min = p[j][i];
        }
        q[i] = max - min;
    } 
    // Вивід  матриці P
    cout<<"Матриця P:"<<endl;
    for (int i = 0; i < 7; i++)
    {
        for (int j = 0; j < 7; j++)
            printf("%10.3f", p[i][j]);
        cout << endl;
    } 
    cout<<"Масив Q:";
    for (int i = 0; i < 7; i++)   //Вивід  масиву Q
    {
        printf("%10.3f", q[i]);
    }
    return 0; 
}
