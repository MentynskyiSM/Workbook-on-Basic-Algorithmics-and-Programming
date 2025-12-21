import math
print("Введіть коефіцієнти нерівності")
a = float(input())
b = float(input())
c = float(input())
d = b * b - 4 * c
if d < 0: #друга нерівність не має коренів
  print("x Є [{0:.2f}; +inf)".format(a))
else:
  if d == 0:
    x0 = -b/2
    if a < x0:
      print("x Є [{0:.3f}; {1:.3f}) U ({2:.3f}; +inf)"
          .format(a, x0, x0))
    elif a == x0:
      print("x Є ({0:.3f}; +inf)".format(a))
    else:
      print("x Є [{0:.3f}; +inf)".format(a))
  else:
    # вітка, що виконується лише при d > 0
    x1 = (-b - math.sqrt(d))/2;
    x2 = (-b + math.sqrt(d))/2;
    # формули для x1 та x2 обрані так, що x1 < x2
    if a < x1:
      print("x Є [{0:.3f}; {1:.3f}) U ({2:.3f}; +inf)"
          .format(a, x1, x2))
    elif a <= x2:
      print("x Є ({0:.3f}; +inf)".format(x2));
    else:
      print("x Є [{0:.3f}; +inf)".format(a));
