#include <iostream>
using namespace std;
int main()
{
    setlocale(LC_ALL, "ukr");
    int t, t1;
    cout<<"Введіть кількість секунд, що пройшла після опівночі: ";
    cin >> t;
    t1 = t / 60;
    int s = t % 60;
    int h = t1 / 60;
    int m = t1 % 60;
    printf("Час %02d:%02d:%02d\n", h, m, s);
    return 0;
}