import math #для обчислення кореня квадратного
print('Задайте відрізок для змінної x')
a = float(input())
b = float(input())
x = a; hx = (b - a) / 7
print('Задайте відрізок для змінної y')
c = float(input())
d = float(input())
y = c; hy = (d - c) / 7
print(" y\\x ", end ="")
for i in range(0, 8):
    print("%8.2f" % (x + i*hx), end ="")
print() # перехід виводу на нову стрічку
#Зовнішній цикл за аргументом y
for i in range(0,8):
    print("%5.2f" % y, end ="")
    x = a
    #вкладений цикл за аргументом х
    for j in range(0,8):
        u = math.sqrt(2 * x * y + 4 * y * y * y)
        print("%8.2f" % u, end ="")
        x += hx
    print()
    y += hy
