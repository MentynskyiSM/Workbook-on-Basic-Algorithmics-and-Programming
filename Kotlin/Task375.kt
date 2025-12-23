import java.util.*

fun main() {
    val size = 6
    val M = arrayOf<IntArray?>(
        intArrayOf(1, 2, 3, 4, 5, 6),
        intArrayOf(1, 3, 5, 7, 9, 1), intArrayOf(1, 4, 4, 3, 9, 1),
        intArrayOf(1, 2, 3, 4, 5, 6), intArrayOf(2, 2, 2, 3, 3, 5), intArrayOf(9, 8, 7, 6, 4, 2)
        )
    println("Бажаєте ввести значення для" +
                    "елементів матриці?(yes\\no)" )
    val scanner = Scanner(System.`in`)
    val choice = scanner.nextLine()
    if (choice.equals("yes", ignoreCase = true)) {
        for (i in 0..<size) {
            for (j in 0..<size) {
                M[i]!![j] = scanner.nextLine().toInt()
            }
        }
    }
    // Шукаємо максимальні елементи рядків
    // і зберігаємо їх в окремому масиві
    val max = IntArray(size)
    for (i in 0..<size) {
        max[i] = M[i]!![0]
        for (j in 0..<size) {
            if (M[i]!![j] > max[i]) max[i] = M[i]!![j]
        }
    }
    println("Матриця M:")
    for (i in 0..<size) {
        for (j in 0..<size) {
            System.out.printf("%9d", M[i]!![j])
        }
        println()
    }
    //Виконуємо перетворення
    for (i in 0..<size) {
        M[i]!![i] = max[i]
    }
    println("Перетворена матриця M:")
    for (i in 0..<size) {
        for (j in 0..<size) {
            System.out.printf("%9d", M[i]!![j])
        }
        println()
    }
}

