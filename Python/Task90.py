t = int(input('time in second: '))
tm = t // 60
s = t % 60
h = tm // 60
m = tm % 60
print("Час %02d:%02d:%02d\n" % (h, m, s))
