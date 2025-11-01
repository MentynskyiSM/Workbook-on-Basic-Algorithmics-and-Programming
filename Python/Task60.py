# Підключення модуля елементарних математичних функцій
import math 
x = float(input('x = ')) # ввід дійсних значень та створення
y = float(input('y = ')) # змінних x, y типу float
u = math.cos(x) + math.sin(y)
v = y ** (3*x) + x ** (5*y)
p = abs(math.exp(u*u) + 
math.exp(-3*u))/(math.log(v)/math.log(3))
# Вивід значення p з чотирма знаками після коми на 10 позицій
print("Значення виразу %10.4f\n" % p)
