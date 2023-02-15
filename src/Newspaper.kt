import Newspaper2.Newspaper2
//Вариант 3, практическая работа 8
open class Newspaper(var name: String, var number: Int, var date:String, var rating1: Double, var tema1:String):Newspaper2(rating1, tema1){
    var t:Boolean=true
   open fun info()
    {
        println("Название газеты: $name\nНомер газеты: $number\nДата выпуска: $date\n${rating}\n${tema}")
    }
   open fun vvod()
    {
        print("Введите название газеты: ")
        name = readLine()!!.toString()
            print("Введите номер газеты: ")
            number = readLine()!!.toInt()
                print("Введите дату выпуска газеты: ")
                date = readLine()!!.toString()

    }

    override fun input1() {
        super.input1()
    }
   open fun scan()
    {
        t=true
        if (rating1>0.0 && rating <=10.0)
        {
        if(name>="a" && name<="z" || name>="а" && name <="я" || name>="A" && name<="Z" || name>="А" && name <="Я" )
        {
            if (number<0) {
            println("Номер не может быть отрицательным"); t=false;}
        }else {println("Ввод числа и знаков в названии запрещен!"); t=false; }}
        else {println("Ввод рейтинга от 0 до 10"); t=false; }
    }
    }



