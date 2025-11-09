#include <iostream>
#include <set>
#include <ctime>
using namespace std;

int main()
{
    // активуємо генератор випадкових чисел
    srand(time(NULL));
    int k;
    cout << "k = ";
    cin >> k;
    // оголошуємо і заповняємо початковий
    int M[100];
    for (int i = 0; i < 100; i++)
    {
        M[i] = 1 + rand() % k;
    }

    // вивід елементів
    for (int x : M)
    {
        cout << x << ", ";
    }
    cout << "\n";

    // створюємо 100 порожніх множин
    set<int> sets[100];

    // розкладаємо за правилами
    for (int a : M)
    {
        int i = 0;
        while (true)
        {
            if (sets[i].count(a) > 0)
            { // множина вже містить такий елемент
                i++;
            }
            else
            {
                sets[i].insert(a);
                break;
            }
        }
    }

    // шукаємо кількість заповнених множин
    int n = 0;
    while (n < 100 && !sets[n].empty())
    {
        n++;
    }

    // прибираємо елементи, що зустрічаються в наступних множинах
    for (int i = 0; i < n - 1; i++)
    {
        for (int x : sets[i + 1])
        {
            sets[i].erase(x);
        }
    }

    // вивід результатів
    for (int i = 0; i < n; i++)
    {
        cout << "Числа, які зустрічаються в списку "
             << (i + 1) << " разів: { ";
        for (int x : sets[i])
        {
            cout << x << ", ";
        }
        cout << "}\n";
    }
    return 0;
}
