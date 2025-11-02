#оголошуємо масив (список) A та заповнюємо
#його введеними користувачем числами
A = []
print('Введіть розмір масиву A')
size_a = int(input())
print('Введіть елементи масиву A')
for i in range(0,size_a):
    A.append(float(input()))
#оголошуємо масив (список) B та заповнюємо
#його введеними користувачем числами
B = []
print('Введіть розмір масиву B')
size_b = int(input())
print('Введіть елементи масиву B')
for i in range(0,size_b):
    B.append(float(input()))
#оголошуємо результуючий масив (список) 
#та організовуємо його заповнення
C = []
C.append(A[0])
for i in range(1,size_a):
    present = False
    for el in C:
        if el == A[i]:
            present = True
            break    
    if not present: 
        C.append(A[i])
for i in range(0,size_b):
    present = False
    for el in C:
        if el == B[i]:
            present = True
            break    
    if not present : 
        C.append(B[i])
#Виводимо масиви
print('Масив A')
for el in A:
    print(" %8i" % el, end=' ')
print() #Перехід на новий рядок
print('Масив B')
for el in B:
    print(" %8i" % el, end=' ')
print() #Перехід на новий рядок
print('Масив C')
for el in C:
    print(" %8i" % el, end=' ')
print() #Перехід на новий рядок
