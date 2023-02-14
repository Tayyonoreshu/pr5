fun main(args: Array<String>) {
    while(true)
    {
        println("Выбирете действие ‘0’, ‘+’, ‘-‘, ‘*’, ‘/’")
        val a = readln().toString()
        if (a == "+")
        {
            println("Введите два числа")
            val c1 = readln().toString().toDouble()
            val c2 = readln().toString().toDouble()
            val deyst = c1 + c2
            println("Ответ: " + c1 + " + " + c2 + " = " + deyst)
        }
        else if (a == "-")
        {
            println("Введите два числа")
            val c1 = readln().toString().toDouble()
            val c2 = readln().toString().toDouble()
            val deyst = c1 - c2
            println("Ответ: " + c1 + " - " + c2 + " = " + deyst)
        }
        else if (a == "*")
        {
            println("Введите два числа")
            val c1 = readln().toString().toDouble()
            val c2 = readln().toString().toDouble()
            val deyst = c1 * c2
            println("Ответ: " + c1 + " * " + c2 + " = " + deyst)
        }
        else if (a == "/")
        {
            println("Введите два числа")
            val c1 = readln().toString().toDouble()
            if (c1 > -1 && c1 < 2)
            {
                println("На 0 делить нельзя")
            }
            else
            {
                val c2 = readln().toString().toDouble()
                val deyst = c1 / c2
                println("Ответ: " + c1 + " / " + c2 + " = " + deyst)
            }
        }
        else if (a == "0")
        {
            println("Цикл завершён")
            break
        }
        else
        {
            println("Нет такого варианта")
        }
    }
}