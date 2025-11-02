#include <iostream>
#include <math.h>
using namespace std;
int main()
{
    srand(time(0));
    // ініціюємо ГВЧ rand()
    double P[17], Q[17], S[17];
    cout << "Enter array P:";
    for (int i = 0; i < 17; i++)
    {
        cin >> P[i];
    }
    for (int i = 0; i < 17; i++)
    {
        Q[i] = double(rand() % 1400) / 100 - 7;
    }
    double s = 0;
    int count = 0;
    for (double d : Q) // цикл для обчислення середнього
        if (d < 0)     // арифметичного від’ємних елементів
        {
            s += d;
            count++;
        }
    double a = s / count;
    for (int i = 0; i < 17; i++)
    {
        S[i] = P[i] + a;
    }
    double p5 = P[0];
    cout << "Array P:\n";
    for (int i = 0; i < 17; i++)
    {
        cout << P[i] << '\t';
        if (abs(P[i] - 5) < abs(p5 - 5))
            p5 = P[i];
    }
    cout << "\nClosess to 5 is " << p5 << endl;
    double q5 = Q[0];
    cout << "Array Q:\n";
    for (int i = 0; i < 17; i++)
    {
        cout << Q[i] << '\t';
        if (abs(Q[i] - 5) < abs(q5 - 5))
            q5 = Q[i];
    }
    cout << "\nClosess to 5 is " << q5 << endl;
    double s5 = S[0];
    cout << "Array S:\n";
    for (int i = 0; i < 17; i++)
    {
        cout << S[i] << '\t';
        if (abs(S[i] - 5) < abs(s5 - 5))
            s5 = S[i];
    }
    cout << "\nClosess to 5 is " << s5 << endl;
    return 0;
}
