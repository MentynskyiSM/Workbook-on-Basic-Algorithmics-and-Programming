#include <iostream>
using namespace std;
double min(double a, double b, double c)
{
    double result;
    if (a < b)
    {
        result = a;
    }
    else
    {
        result = b;
    }
    if (c < result)
    {
        result = c;
    }
    return result;
}
double max(double a, double b)
{
    return a > b ? a : b;
}
// основна програма
int main()
{
    double s, t, x, y, p, p1, p2;
    cout << "Enter input values for s,t,x,y\n";
    cin >> s >> t >> x >> y;
    // Значення виразу знайдемо як суму двох частин:
    //   віднімемо перші два дороби і наступні два
    p1 = min(t, x, y) / min(s, t, y) -
         max(t, s) / min(s, t, x);
    p2 = max(x, y) / min(s, x, y) -
         max(t + s, x + y) / max(x + s, t + y);
    p = p1 + p2;
    printf("p =  %12.5f\n", p);
}