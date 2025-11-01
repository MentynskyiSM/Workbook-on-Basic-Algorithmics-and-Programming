#include <iostream>
using namespace std;
int main()
{
    double a, u = 1, s = u;
    cout << "Enter double value a = ";
    cin >> a;
    cout<<"Enter integer value n = ";
    int n;
    cin >> n;
    //цикл повторює виконання тіла n разів (i=0,1,…,n-1)
    for (int i = 0; i < n; i++) {
        u *= -a;  s += u;
    }
    printf("Summ s = %.3f", s);
}
