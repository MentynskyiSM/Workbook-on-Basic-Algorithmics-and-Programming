#include <iostream>
using namespace std;
//прототип функції рекурсивного виводу числа
void print_posix(int, int);
int main()   //головна програма (функція)
{
    int m;
    cout << "Enter number:\n";    cin >> m;
    print_posix(2, m);//вивід числа в двійковій системі
    cout << "(2) = ";
    print_posix(3, m); //вивід числа в трійковій системі
    cout << "(3) = ";
    print_posix(7, m); //вивід числа в сімковій системі
    cout << "(7) = ";
    cout <<m <<"(10)"<<endl;
}
//функція виводу числа n в системі з основою q
void print_posix(int q, int n)
{
    if (n < q)
    {//число n в системіз основою q одноцифорове
        cout << n;
    }
    else
    {//рекурсивний виклик функції для виводу старших 
        print_posix(q, n / q);//розрядів числа
        cout << n % q;// виводимо останню цифру 
    }
}
