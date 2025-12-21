import kotlin.math.sqrt

fun main() {
    println("Введіть коефіцієнти нерівності")

    val a = readLine()!!.toDouble()
    val b = readLine()!!.toDouble()
    val c = readLine()!!.toDouble()

    val d = b * b - 4 * c

    if (d < 0) {
        // друга нерівність не має коренів
        println("x ∈ [$a; +inf)")
    } else {
        if (d == 0.0) {
            val x0 = -b / 2
            if (a < x0) {
                println("x ∈ [${"%.3f".format(a)}; ${"%.3f".format(x0)}) U (${ " %.3f".format(x0)}; +inf)")
            } else {
                if (a == x0) {
                    println("x ∈ (${ "%.3f".format(a) }; +inf)")
                } else {
                    println("x ∈ [${"%.3f".format(a)}; +inf)")
                }
            }
        } else {
            // d > 0
            val x1 = (-b - sqrt(d)) / 2
            val x2 = (-b + sqrt(d)) / 2  // тут гарантовано x1 < x2

            if (a < x1) {
                println(
                    "x ∈ [${"%.3f".format(a)}; ${"%.3f".format(x1)}) U (${ "%.3f".format(x2)}; +inf)"
                )
            } else {
                if (a <= x2) {
                    println("x ∈ (${ "%.3f".format(x2) }; +inf)")
                } else {
                    println("x ∈ [${"%.3f".format(a)}; +inf)")
                }
            }
        }
    }
}
