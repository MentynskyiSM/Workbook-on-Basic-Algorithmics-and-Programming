eps = 0.00001
print('Веедіть значення змінної x')
x = float(input())
s = 1; n = 2; u = x / 4
while abs(u) > eps: 
    s += u
    u *= -x * (4 * n - 5) / (4 * n)
    n += 1
f = (1 + x)**0.25
print('Сума ряду s = %12.5f' % s)
print('Значення функції f = %12.5f' % f)
print('Кількість доданків : %5d'% (n - 1))
