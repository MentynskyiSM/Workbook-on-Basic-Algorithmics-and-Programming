#include <iostream>
#include <cmath> // містить елементарні математичні ф-ції
using namespace std;
int main()
{    //параметр a задаємо як константу
    const double a = 7.7;
    cout<<"x = ";
    double x, y;
    cin>>x;
    if(x >= 0 && x <= 5)
    {
        y = x*pow(a*x*x*x + sin(x),1.0/3);
    }
    // синтаксис дозволяє один оператор після if записувати без {  }
    if(x < 0) y = a*sin(x)*sin(x)*sin(x);
    if(x > 5)
    {
        y = log(abs(x*x*x-exp(x)))/log(x);
    }
    printf("y = %12.5f\n", y);
    return 0;
}
