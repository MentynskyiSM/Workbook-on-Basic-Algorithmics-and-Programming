#include <iostream>
using namespace std;

int main()
{
    int visits[24]; //оглошуємо масив
    cout<<"Ведіть відвідуваність сайту ";
    cout<<"кожної години протягом доби";
    //вводимо елементи масиву в циклі
    for (int i = 0; i < 24; i++)
    {
        cin >> visits[i];
    }
    int s = 0;
    //цикл по елементах списку
    for (int i = 0; i < 24; i++)
    {
        s += visits[i];
    }
    double a = double(s) / 24;
    printf("Середньодобова відвідуваність %10.2f", a);
    cout<<"Задайте коефіцієнт відхилення у % :";
    double p;
    cin>>p;
    printf("Години з менш, ніж %5.2f -відсотковим", p);
    printf("відхиленням від сереньої відвідуваності:");
    for (int i = 0; i < 24; i++)
    {
        if (abs(visits[i] - a) < a * p / 100)
        {// Години номеруємо 1..24, тому i+1
            cout << i + 1 << endl;
        }
    }
}
