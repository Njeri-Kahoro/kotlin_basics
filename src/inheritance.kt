open class MyparentClass{
    val father= "He likes watching football"
    val mother= "She likes going shopping"


}
class Myboychildclass: MyparentClass(){
    fun boy () {
        println(father)
    }


}
class Mygirlchildclass:MyparentClass(){
    fun girl () {
        println(mother)
    }



}
fun main (args: Array<String>) {
    val myobj1=Myboychildclass()
    myobj1.boy()

    val myobj2=Mygirlchildclass()
    myobj2.girl()
}
