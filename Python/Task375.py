import array
size = 6
M = [[1,2,3,4,5,6],
     [1,3,5,7,9,1],
     [1,4,4,3,9,1],
     [1,2,3,4,5,6],
     [2,2,2,3,3,5],
     [9,8,7,6,4,2]]
print('Бажаєте ввести матрицю з клавіатури?(так\ні)')
choise = input()
if choise == 'так':
    for k in range(size):
        tmp = array.array('i')
        for i in range(size):
            tmp.append(int(input()))
        M[k] = tmp
# Шукаємо максимальні елементи рядків 
# і зберігаємо їх в окремому масиві
max = array.array('i')
for line in M:
    m = line[0]
    for x in line:
        if x > m: m = x 
    max.append(m) 
print('Матриця M:')
for line in M:
    for x in line:
        print('%3i'% x, end='')
    print()
#Виконуємо перетворення
for i in range(size):
    M[i].pop(i) # вилучаємо i-ий елемент з рядка, на його
    M[i].insert(i, max[i]) # місце вставляємо максимум
print('Результат перетворення:')
for line in M:
    for x in line:
        print('%3i'% x, end='')
    print()
