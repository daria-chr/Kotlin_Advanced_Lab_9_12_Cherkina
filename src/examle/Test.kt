package examle

var age: Int = 18
    set(value){
        if ((value>0) and (value<100))
            field=value
    }

//abstract class Figure{
//    abstract fun perimeter(): Float
//    abstract fun area(): Float
//}
//class Rectangle(val width: Float,
//    val height: Float) :Figure() {
//    override fun perimeter(): Float {
//        return 2*(width+height)
//    }
//}

fun main(){
 //   println(examle.age)
    age=55
    println(age)
    age=-43
    println(age)
//    val sword=examle.Item(1,"Sword",1)
//    val bettersword=sword.copy(quantity = 2, name = "Better Sword")
//    println(sword.toString())
//    println(bettersword.toString())
//    val (id,name, quantity)=bettersword
//    println("$id | $name | $quantity")
    val denis:Human=Person("Denis",23)
    val anton:Person=Person("Anton",20)
}

data class Item(
    val id: Int,
    val name: String,
    val quantity:Int
){
    override fun toString(): String {
        return "ID: $id | name: $name |  quantity: $quantity"
    }
}

abstract class Human(val name: String){
    abstract var age: Int
    abstract fun hello()
}
class Person(name: String,override var age: Int=0):Human(name){
//    override var examle.age: Int=0

    override fun hello() {
        println("My name is $name")
    }
}