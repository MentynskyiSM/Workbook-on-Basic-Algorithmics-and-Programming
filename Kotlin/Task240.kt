import java.lang.Math.pow
import kotlin.math.abs
import kotlin.math.pow

fun main() {
    println("Введіть значення x")
    val x: Double = readln().toDouble()
    var u: Double = x / 4
    var s = 1.0
    val eps = 0.00001
    var n = 2
    while (abs(u) > eps) {
        s += u
        u *= -x * (4 * n - 5) / (4 * n)
        n++
    }
    println("Значення суми s = %.6f".format(s))
    println("Значення функції: %.6f"
        .format((1 + x).pow(0.25)))
    println("Кількість доданків " + (n - 1))
}
