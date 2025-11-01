#include <iostream>
#include <math.h>
using namespace std;

int main() {
	double x,y;
	cin>>x>>y;
	//змінні описуємо по мірі їх використання
	double u,v;
	u = cos(x) + sin(y);
	v = exp((3*x)*log(y)) +	exp((5*y)*log(x));
	double p;	
	p= abs(exp(u*u) + exp(-3*u))/(log(v)/log(3));
	//форматований вивід p на 10 позицій
	//з 4-ма знаками після коми
	printf("Значення виразу %10.4f\n",p);
    //функцію printf "плюси" запозичили в С
	return 0;
}
