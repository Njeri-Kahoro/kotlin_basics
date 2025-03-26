class Student(val name: String, var age:Int) {

//    this class is empty./ i call my constructor
}
fun main(args: Array<String>) {
    val student1=Student(name = "Edwin", age = 18)
    println("Student name is ${student1.name} and student's age is ${student1.age} years old.")
}