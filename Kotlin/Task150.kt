import kotlin.math.*

fun main() {
    val a = 7.7
    print("x = ")
    val x = readLine()!!.toDouble()

    val y = when {
        x in 0.0..5.0 ->
            x * (a * x * x * x + sin(x)).pow(1.0 / 3)

        x < 0 ->
            a * sin(x).pow(3)

        else ->  // x > 5
            ln(abs(x * x * x - exp(x))) / ln(x)
    }

    println("y = %12.5f".format(y))
}
