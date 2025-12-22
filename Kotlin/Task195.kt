fun main() {
    println("Введіть значення a")
    val a: Double = readln().toDouble()
    println("Введіть значення n")
    val n = readln().toInt()
    var u = 1.0
    var s = u
    for (i in 0 until n) {
        u *= -a
        s += u
    }
    println("Значення суми s = %.3f".format(s))
}
