fun main(args: Array<String>) { 
println("Введіть число секунд, що пройшли від початку доби: ") 
// зчитування цілого числа з консолі інструкція вводу даних 
var t: Int = readln().toInt() 
val tm = t / 60 
val s = t % 60 
val h = tm / 60 
val m = tm % 60 
println("%02d".format(h) + ":" + "%02d:%02d".format(m,s)) 
} 