import math # використовуємо математичні функції
a = 7.7 #задаємо значення параметра
print('Введіть значення x:')
x = float(input())
y = a * math.sin(x) ** 3 if x < 0 else \
math.log(abs(x ** 3 - math.exp(x)))/math.log(x) if x>5 \
else x*((a * x ** 3 + math.sin(x)) ** (1.0/3))
print("Значення виразу %10.4f" % y)
