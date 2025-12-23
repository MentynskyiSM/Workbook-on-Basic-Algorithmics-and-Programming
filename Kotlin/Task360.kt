import kotlin.math.*
fun main() {
    //Оголошення та створення
    //двовимірного масиву дійсних чисел
    val p = Array(7) { DoubleArray(7) }
    /* Заповнення матриці p.
    Використовуємо пару вкладених циклів
    за індексами елементів
    індекси елементів пробігають значення 0..6 */
    for (i in 0..6) {
        for (j in 0..6) {
            //у виразі враховуємо, що індекси i, j
            //набувають значень 0..6 а не 1..7
            p[i][j] = (10 * sin(((3 * (i + 1)).toDouble()))
                    / (i + 1 + j + 1))
        }
    }

    //Обчислення елементів масиву Q
    val q = DoubleArray(7)
    for (i in 0..6) {
        var max = p[i][0]
        for (j in 0..6) {
            if (p[i][j] > max) max = p[i][j]
        }
        var min = p[0][i]
        for (j in 0..6) {
            if (p[j][i] < min) min = p[j][i]
        }
        q[i] = max - min
    }
    // Вивід  матриці P
    println("Матриця P:")
    for (i in 0..6) {
        for (j in 0..6) {
            print("%10.3f".format(p[i][j]))
        }
        println()
    }
    //Вивід  масиву Q
    println("Масив Q:")
    for (i in 0..6) {
        print("%10.3f".format(q[i]))
    }

}