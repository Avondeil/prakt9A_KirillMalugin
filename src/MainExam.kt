//Вариант 15, практическая работа 8
fun main()
{
    try {

        var stud:Exam=Exam("Кирилл", "Математика", "23/03/2000", 4.0, "ПР-12",12)
        stud.Scan()
        if(stud.b==true)
        {
            stud.Info()

        }
        stud.Vodim()
        stud.input()
        stud.Scan()
        if(stud.b==true)
        {
            stud.Info()
        }
    } catch (e:Exception)
    {
        println("Найдена ошибка при вводе данных")
    }
}
