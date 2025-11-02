#include <iostream>
#include <vector>
using namespace std;
int main() 
{
    vector<int> A, B, C;
    int sizeA, sizeB;
    cout << "Enter size of array A:" << endl;
    cin >> sizeA;
    cout << "Enter array A elements:" << endl;
    for (int i = 0; i < sizeA; i++) {
        int ai;//змінна для вводу елемента масиву A
        cin >> ai;//зчитування значення
        A.push_back(ai);//додавання в список
    }
    cout << "Enter size of array B:" << endl;
    cin >> sizeB;
    cout << "Enter array B elements:" << endl;
    for (int i = 0; i < sizeB; i++) {
        int bi;//змінна для вводу елемента масиву B
        cin >> bi;//зчитування значення
        B.push_back(bi);//додавання в список
    }
    // записуємо в список перший елемент A
    C.push_back(A[0]);/* vector допускає 
    доступ до елементів за індексом в [ ] */
    /* Переглядаємо решту елементів масиву A
    метод size() визначає кількість елементів */
    for (int i = 1; i < A.size(); i++) {
        bool present = false;
        for (int el : C) {// цикл for each дозволяє пере-
        // глянути усі елементи контейнера в т.ч. масиву
            if (el == A[i]) {
                present = true;
                break;
            }//завершуємо перевірку достроково
            //якщо знаходимо такий елемент
        }
        if (!present) C.push_back(A[i]);
    }
    //Переревіряємо котрі з елементів масиву B
    //потрібно дописати до списку C
    for (int i = 0; i < B.size(); i++) {
        bool present = false;
        for (int el : C) {
            if (el == B[i]) {
                present = true;
                break;
            }
        }
        if (!present) {
            C.push_back(B[i]);
        }
    }
    cout << "Array A:" << endl;
    for (int el : A) cout << el << '\t';
    cout << endl;
    cout << "Array B:" << endl;
    for (int el : B) cout << el << '\t';
    cout << endl;
    cout << "Array C:" << endl;
    for (int el : C) cout << el << '\t';
    cout << endl;
}

