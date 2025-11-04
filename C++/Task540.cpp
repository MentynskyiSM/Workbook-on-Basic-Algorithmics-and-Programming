#include <iostream>
#include <cmath>
#define SIZE 12
using namespace std;

// прототипи функцій оголошуються до основної програми
void create_array(double m[SIZE]);
void print_array(double m[SIZE]);
double min_dist_el(double m[SIZE]);

int main()
{ // масиви, оголошені а головній функції
  // створюють безпосереднто інструкцією опису
    double A[SIZE], B[SIZE], C[SIZE];

    //заповнення масивів за допомогою підпрограми
    create_array(A);
    create_array(B);

    // заповнення третього масиву C
    double SumA = 0, min_d1;
    for (int i = 0; i < SIZE; i++)
    {
        SumA += A[i];
    }
    double avg = SumA / SIZE;
    for (int i = 0; i < SIZE; i++)
    {
        if (B[i] < 0)
        {
            C[i] = avg;// заміняємо середнім
        }
        else
        {
            C[i] = B[i];// беремо з масиву B
        }
    }
    cout << "Array A:\n";
    print_array(A);// вивід масиву
    min_d1 = min_dist_el(A);// пошук найближчого до 1
    printf("\nClosess to 1 is %10.2f\n", min_d1);
    cout << "Array B:\n";
    print_array(B);
    min_d1 = min_dist_el(B);// пошук найближчого до 1
    printf("\nClosess to 1 is %10.2f\n", min_d1);
    cout << "Array C:\n";
    print_array(C);
    min_d1 = min_dist_el(C);// пошук найближчого до 1
    printf("\nClosess to 1 is %10.2f\n", min_d1);
    return 0;
}

// реалізації функцій, оголошених прототипами вище
void create_array(double m[SIZE])
{
    int sign = -1;// -1^n при n = 1
    double p, q;
    cout << "p = "; cin >> p;
    cout << "q = "; cin >> q;
    for (int i = 0; i < SIZE; i++)
    {
        m[i] = sign * sqrt(((i + 1) * (i + 1) + p)*
            (i + 1 + q * q));
        sign *= -1; // обчислення -1 ^ (k + 1)
    }
}

void print_array(double m[SIZE])
{
    for (int i = 0; i < SIZE; i++)
    {
        printf("%7.2f, ", m[i]);
    }
}

double min_dist_el(double m[SIZE])
{
    double min = m[0];// початкове наближення
    // його відстань до 1
    double dist = abs(min - 1);
    for (int i = 0; i < SIZE; i++)
    {
        if (abs(m[i] - 1) < dist)
        {// знайдено новий елемент найближчий до 1
            min = m[i];
            dist = abs(min - 1);
        }
    }
    return min;
}