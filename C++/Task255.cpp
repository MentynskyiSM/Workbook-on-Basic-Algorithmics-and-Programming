#include <iostream>
#include <cmath>
using namespace std;
int main()
{
    double a, b, c, d, u;
    cout << "Enter variable x bounds"<<endl;
    cin >> a >> b;
    double x = a, hx = (b - a) / 7;
    cout << "Enter variable y bounds" << endl;
    cin >> c >> d;
    double y = c, hy = (d - c) / 7;
    cout<<"y\\x  ";
    for (int i = 0; i < 8; i++)
    {
       printf("%8.2f", x + hx * i);
    }
    cout << endl;
    for (int i = 0; i < 8; i++) {
        printf("%5.2f", y);
        x = a;
        for (int j = 0; j < 8; j++) {
            u = sqrt(2 * x * y + 4 * y * y * y);
            printf("%8.2f", u);
            x += hx;
        }
        cout<<endl;
        y += hy;
    }
}
