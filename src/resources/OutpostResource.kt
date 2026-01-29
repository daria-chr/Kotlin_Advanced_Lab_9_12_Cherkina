package resources
import kotlin.properties.Delegates
data class OutpostResource(
    val id: Int,
    val name: String,
    var amountInit: Int
){
    var amount: Int by Delegates.observable(amountInit){
        _,old,new->println("Ресурс [$name] Изменился $old->$new")
    }
}

fun main(){
    val gas=OutpostResource(1,"Gas", 100)
    val mineral=OutpostResource(2,"Mineral", 150)
    println("успех. вы добыли дополнительное кол-во минералов: ${mineral.amount+70}")
    val bonusmineral=mineral.copy(3, amountInit = mineral.amount+70)
    println(gas.toString())
    println(mineral.toString())
    println(bonusmineral.toString())
}