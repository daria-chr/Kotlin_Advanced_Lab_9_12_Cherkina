package modules
import resources.Resourcemanager

abstract class OutpostModule(
    val name: String,
    var level:Int=1
) {
    fun upgrade(){
        level++
        println("$name улучшен до уровня $level")
    }
    abstract fun performAction(manager: Resourcemanager)
}