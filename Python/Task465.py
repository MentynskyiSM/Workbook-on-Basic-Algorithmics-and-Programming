import math

#Функція для обчислення значення радикала
def f(u,v):
  t = u * v * v
  res = -(-t) ** (1/3) if t < 0 else t ** (1/3) 
  return res


a = float(input('Введіть значення a: '))
b = float(input('Введіть значення b: '))
x = float(input('Введіть значення x: '))
y = float(input('Введіть значення y: '))
p = (f(y, b) + f(x, a)) * (f(b, x) - f(a, y))
print(f'Значення виразу {p:10.3f}')
