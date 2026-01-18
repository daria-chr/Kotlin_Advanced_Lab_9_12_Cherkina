package modules
import resources.Resourcemanager
import resources.OutpostResource
class ResearchLab: OutpostModule(
    name="Исследовательская лаборатория"
){
    override fun performAction(manager: Resourcemanager) {
        val minerals=manager.get("Minerals")
        if (minerals==null || minerals.amount<30) {
            println("недомтаточно минералов для исследования")
            return

        }
        minerals.amount-=30
        println("Лаборатория проводит исследование (минералы-30")

    }
}