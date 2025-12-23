#include <iostream>
#include <cmath>
using namespace std;
int main()
{
    double x, u, s = 1, eps = 0.00001;
    cout<<"Enter variable x value: ";
    cin >> x;
    u = x / 4;
    int n = 2;
    while (abs(u) > eps) 
    {
        s += u;
        u *= -x * (4 * n - 5) / (4 * n);
        n++;
    }
    printf("Summ value s = %.6f\n", s);
    printf("Function value : %.6f\n", pow(1 + x, 0.25));
    cout<<"Count of additions n =  " << n - 1;
}
