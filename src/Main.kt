fun main(){
    val manager=Resourcemanager()
    val gas=OutpostResource(1,"Gas", 100)
    val mineral=OutpostResource(2,"Mineral", 150)
    manager.add(gas)
    manager.add(mineral)
    manager.printAll()
    val bonusmineral=mineral.copy(3, amount = mineral.amount+70)
    println("Бонусные минералы $bonusmineral")
}