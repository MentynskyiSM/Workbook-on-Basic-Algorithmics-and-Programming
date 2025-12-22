#include <iostream>
using namespace std;
int main()
{
    int m, f, fp = 1, fn = 1, n = 2;
    cout<<"Enter number m \n>>";
    cin>>m;
    while (fn < m) {
        f = fp + fn;
        fp = fn; fn = f;
        n++;
    }
    if (fn == m) {
        cout << m << " is "<< n 
            <<" Fibonacci number " << endl;
    }
    else {
        cout << "First Fibonacci number after " 
            << m <<" is " << fn << endl;
    }
}
