import random # модуль для випадкових чисел
P = []
Q = []
S = []
print('Введіть елементи масиву P')
for i in range(0,17):
    P.append(float(input()))
for i in range(0,17):
    Q.append(round(random.uniform(-7.0,7.0),2))
m = 0.0
k = 0
# Цикл «for each» на Python виглядає так:
for d in Q: #шукаємо середнє
    if d<0: #лише від'ємних елементів
        m+=d
        k+=1
a = m/k
for i in range(0,17):
    S.append(P[i]+a)
#Вибираємо перший елемент за найближчий до 5
P5 = P[0]
print('Масив P')
# цикл «for each» переглядає усі елементи масиву P,
# поміщаючи їх по черзі у змінну d
for d in P: 
    print(" %8.2f" % d, end=' ')
    if(abs(d - 5) < abs(P5 - 5)):
        P5 = d
print() #Перехід на новий рядок
print('Найближче до 5 число %8.2f' % P5)

Q5 = Q[0]
print('Масив Q')
for d in Q:
    print(" %8.2f" % d, end=' ')
    if(abs(d - 5) < abs(Q5 - 5)):
        Q5 = d
print() #Перехід на новий рядок
print('Найближче до 5 число %8.2f' % Q5)

S5 = S[0]
print('Масив S')
for d in S:
    print(" %8.2f" % d, end=' ')
    if(abs(d - 5) < abs(S5 - 5)):
        S5 = d
print() #Перехід на новий рядок
print('Найближче до 5 число %8.2f' % S5)
