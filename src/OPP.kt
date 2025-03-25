class Myclass{

    //    data member
    var myname: String= "My name is Njeri Kahoro."

    //    member function
    fun display() {
    println(myname)
}
}

fun main (args: Array<String>) {
//    create an instance object
    val myobj=Myclass()
    myobj.display()

//    instance of an object
    val obj2= Car()
    obj2.brand= "Toyota"
    obj2.model= "Axio"
    obj2.yom= "2015"
    println("My favourite car brand is ${obj2.brand} and model is ${obj2.model} manufactured in ${obj2.yom}")

}

class Car{
    var brand=" "
    var model=""
    var yom=""
}