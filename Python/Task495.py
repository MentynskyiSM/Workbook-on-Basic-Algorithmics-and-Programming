
import math
def isprime(n):
  result = True
  max_div = round(math.sqrt(n))
  for p in range(2, max_div + 1):
    if (n % p == 0):
      result = False
      break
  return result


print('Введіть парне натуральне число для ')
print('перевірки гіпотези Гольдбаха >>')
m = int(input())
max_a = int(m / 2) + 1 # максимально можливе
# значення першого доданка шуканої суми
for a in range(2, max_a + 1):
  # якщо a складене, переходимо до 
  # наступного значення
  if not isprime(a):
    continue
  b = m - a
  if not isprime(b):
    continue
  # якщо  b складене, переходимо до 
  #  наступного значення a
  else:
    break
if (a == max_a):
  # якщо можливе значення першого доданка 
  # досягло максимуму, то потріний розклад
  # у вигляді суми не знайдено
  print('Гіпотеза Гольдбаха не підтверджується')
else:
  print(m, ' = ', a, ' + ', b)
  print('Гіпотезу Гольдбаха підтверджено')
