#include <iostream>
#define size 6 
using namespace std;
int main()
{
    int M[][size] = { { 1, 2, 3, 4, 5, 6 }, {1,3,5,7,9,1},
            {1,4,4,3,9,1}, {1,2,3,4,5,6}, {2,2,2,3,3,5}, 
        {9,8,7,6,4,2 }};
    cout<<"Do you want to enter matrix elements?(y\\n)"
             <<endl;
    char choise;
    cin >> choise;
    if (choise == 'y')
    {
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                cin >> M[i][j];
            }
        }
    }
    // Шукаємо максимальні елементи рядків
    // і зберігаємо їх в окремому масиві
    int max[size];
    for (int i = 0; i < size; i++)
    {
        max[i] = M[i][0];
        for (int j = 0; j < size; j++)
        {
            if (M[i][j] > max[i])
            {
                max[i] = M[i][j];
            }
        }
    }
    cout<<"Matrix M:"<<endl;
    for (int i = 0; i < size; i++)
    {
        for (int j = 0; j < size; j++)
        {
            printf("%5i", M[i][j]);
        }
        cout<<endl;
    }
    //Виконуємо перетворення
    for (int i = 0; i < size; i++)
    {
        M[i][i] = max[i];
    }
    cout<<"Transformation result:"<<endl;
    for (int i = 0; i < size; i++)
    {
        for (int j = 0; j < size; j++)
        {
            printf("%5i", M[i][j]);
        }
        cout << endl;
    }
}
