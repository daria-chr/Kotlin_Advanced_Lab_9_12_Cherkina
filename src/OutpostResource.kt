data class OutpostResource(
    val id: Int,
    val name: String,
    val amount: Int
){
    override fun toString(): String {
        return "ваш ресурс: $id | Имя $name | количество $amount"
    }
}

fun main(){
    val gas=OutpostResource(1,"Gas", 100)
    val mineral=OutpostResource(2,"Mineral", 150)
    println("успех. вы добыли дополнительное кол-во минералов: ${mineral.amount+70}")
    val bonusmineral=mineral.copy(3, amount = mineral.amount+70)
    println(gas.toString())
    println(mineral.toString())
    println(bonusmineral.toString())
}