//import kotlin.math.abs
import kotlin.math.abs
import kotlin.random.Random

fun main() {
    val P = DoubleArray(17)
    val Q = DoubleArray(17)
    val S = DoubleArray(17)

    println("Введіть елементи масиву P")
    for (i in 0 until 17) {
        P[i]  = readLine()!!.toDouble()

    }

    for (i in 0 until 17) {
        Q[i] = Random.nextDouble() * 1400 / 100 - 7
    }

    var s = 0.0
    var count = 0

    for (d in Q) {
        if (d < 0) {
            s += d
            count++
        }
    }

    val a = s / count

    for (i in 0 until 17) {
        S[i] = P[i] + a
    }

    var p5 = P[0]
    println("Масив P:")
    for (i in 0 until 17) {
        print(String.format(" %8.2f", P[i]))
        if (abs(P[i] - 5) < Math.abs(p5 - 5))
            p5 = P[i]
    }
    println()
    println(String.format("Найближче до 5: %10.2f", p5))

    var q5 = Q[0]
    println("Масив Q:")
    for (i in 0 until 17) {
        print(String.format(" %8.2f", Q[i]))
        if (abs(Q[i] - 5) < abs(q5 - 5))
            q5 = Q[i]
    }
    println()
    println(String.format("Найближче до 5 %10.2f", q5))

    var s5 = S[0]
    println("Масив S:")
    for (x in S) {
        print(String.format(" %8.2f", x))
        if (abs(x - 5) < abs(s5 - 5))
            s5 = x
    }
    println()
    println(String.format("Найближче до 5: %10.2f", s5))

}
