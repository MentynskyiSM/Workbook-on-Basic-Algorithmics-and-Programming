fun main(){
    println("Введіть значення x та y");
    // Опис змінних, кожна змінна в окремому рядку,
    // або кілька рядків, розділені ";"
    var v: Double; var u : Double
    // Ввід даних. Функція readln() читає текст
    // числові дані слід отримуємо після
    // перетворення  прочитаного тексту
    // опис можна поєднувати з присвоєнням
    val x : Double = readln().toDouble();
    val y: Double = readln().toDouble();
    u = Math.cos(x) + Math.sin(y)
    v = Math.exp((3 * x) * Math.log(y)) + Math.exp((5 * y) * Math.log(x))
    val p: Double = Math.abs(Math.exp(u * u) +
            Math.exp(-3  * u)) / (Math.log(v) / Math.log(3.0))
    /* усі математичні функції, в тому числі, піднесення
    до степеня є статичними методами бібліотечного класу
    Math, так як в Java*/
    //вивід результату p 5-ма знаками після коми
    println("Значення виразу %10.5f".format(p))
}



