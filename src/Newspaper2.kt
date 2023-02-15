package Newspaper2
open class Newspaper2(var rating: Double, var tema:String) {
    open fun rating()
    {
        println("Рейтинг газеты: $rating")
    }
    open fun tema()
    {
        println("Тематика: $tema")
    }
    open fun input1()
    {
        print("Рейтинг газеты: ")
        rating= readLine()!!.toDouble()
        print("Тематика: ")
        tema= readLine()!!.toString()
    }
}