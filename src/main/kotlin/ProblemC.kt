class ProblemC {
    fun main() {
        var n = readInt()// объявляем переменные
        var sum = 0
        val list: List<Int> = readListInt()
        val newlist = list.sorted() // сортируем список, нужно для того чтобы расположить
        // студентов с близким уровнем навыка рядом, чтобы в дальнейшем просуммировать разницу
        // в уровне навыка между ближайшими студентами

        for(i in 1..n step 2){
            sum += newlist[i] - newlist[i - 1]
        }
        println(sum)


    }
}
