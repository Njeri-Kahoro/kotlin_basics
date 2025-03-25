fun main(args: Array<String>) {
//    while loop

    var num = 10
    while (num>=5) {
        println("Loop: $num")
        num--
    }

//    for loop
    val students= arrayOf("Njeri", "Jane", "Maria", "Ellay", "Emma")
    students.sort()
    for (i in students)
        println(i)

    val nambari= arrayOf(-4, 0, 9, 10,100, 87, 24, 21, -9, 21, 14, 1, 1009, 33, -18)
    nambari.sort()
    for (i in nambari)
        println(i)
}