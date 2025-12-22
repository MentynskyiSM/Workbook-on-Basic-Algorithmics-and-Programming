fun main() {
    println("Введіть натуральне число для перевірки: ")
    val m = readln().toInt()
    var fp = 1
    var fn = 1
    var n = 2 // номер останнього числа послідовності
    var f:Int;
    while (fn < m) {
        f = fp + fn
        fp = fn; fn = f
        n += 1
    }
    if (fn == m) println("%d є ".format(m) +
            "%d-им числом Фібоначчі".format(n))
    else println("Найближче до %d, ".format(m) +
            "справа число Фібоначчі: %d".format(fn))
}
