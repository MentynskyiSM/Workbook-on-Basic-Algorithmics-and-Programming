import kotlin.random.Random
fun main() {
    print("k = ")
    val k = readLine()!!.toInt()
    // список M
    val M = Array(100) { Random.nextInt(1, k + 1) }
    // друк списку
    println(M.joinToString(", "))
    // список зі 100 порожніх множин
    val sets = Array<MutableSet<Int>>(100) { mutableSetOf<Int>() }
    // розкладання елементів по множинах
    for (a in M) {
        var i = 0
        while (true) {
            if (a in sets[i]) {
                i++
            } else {
                sets[i].add(a)
                break
            }
        }
    }
    // шукаємо кількість заповнених множин
    var n = 0
    while (n < sets.size && sets[n].isNotEmpty()) n++
    // вилучаємо елементи, що входять у наступні множини
    for (i in 0 until n - 1) {
        sets[i] -= sets[i + 1]
    }
    // вивід результату
    for (i in 0 until n) {
        if (sets[i].isNotEmpty()) {
            println("Числа, які зустрічаються в списку ${i + 1} разів: ${sets[i]}")
        }
    }
}
