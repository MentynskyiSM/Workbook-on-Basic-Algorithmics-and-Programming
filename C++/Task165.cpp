#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  double a,b,c,d;
  cout<<"Введіть коефіцієнти нерівності a,b,c\n";
  cin >> a >> b >> c;
  d = b * b - 4 * c;
  if (d < 0)//друга нерівність не має коренів
  {
    cout<< "["<<a<<";+inf)\n";  
  }
  else
  {//d не менше 0, тобто 0, або більше 0
    if (d == 0)
    {
      double x0 = -b/2;
      if (a < x0) 
      {
        cout<<"x Є ["<<a<< ";"<< x0 << 
          ")U("<<x0<<";+inf)\n";
      }
      else 
      {
        if(a == x0) cout<<"x Є ("<<a<<";+inf)\n"; 
        else  cout<<"x Є ["<<a<<";+inf)\n";
      }
    }
    else
    {//вітка, що виконується лише коли d > 0
      double x1 = (-b-sqrt(d))/2;
      double x2 = (-b+sqrt(d))/2;
      if (a < x1)
      {
        cout<<"x Є ["<<a<<";" << x1 <<")U("
                     <<x2<<";+inf)\n";
      }
      else{
        if (a <= x2) cout<<"x Є ("<<x2<<";+inf)\n";
        else cout<<"x Є ["<<a<<";+inf)\n";
      }
    }  
  }
  return 0;
}
