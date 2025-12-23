
fun main() {
    println("Введіть розмір масиву A")
    val sizeA: Int = readln().toInt()
    val A = IntArray(sizeA)
    println("Введіть елементи масиву A")
    for (i in 0..<sizeA) {
        A[i] = readln().toInt()
    }
    println("Введіть розмір масиву B")
    val sizeB = readln().toInt()
    val B = IntArray(sizeB)
    println("Введіть елементи масиву B")
    for (i in 0..<sizeB) {
        B[i] = readln().toInt()
    }
    //Для масиву C використовуємо список
    val listC = ArrayList<Int>()
    listC.add(A[0]) // записуємо в список перший
    //елемент A та переглядаємо решту елементів
    for (i in 1..<sizeA) {
        var present = false
        for (el in listC) {
            if (el == A[i]) {
                present = true
                break //завершуємо перевірку
            } //якщо такий елемент вже знайдено
        }
        if (!present) {
            listC.add(A[i])
        }
    }
    for (i in 0..<sizeB) {
        var present = false
        for (el in listC) {
            if (el == B[i]) {
                present = true
                break
            }
        }
        if (!present) {
            listC.add(B[i])
        }
    }
    println("Масив A:")
    for (i in A.indices) {
        print("%5d".format(A[i]))
    }
    println()
    println("Масив B:")
    for (i in B.indices) {
        print("%5d".format(B[i]))
    }
    println()
    println("Масив C:")
    for (i in listC.indices) {
        print("%5d".format(listC[i]))
    }
    println()
}


