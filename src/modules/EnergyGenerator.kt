package modules

import resources.OutpostResource
import resources.Resourcemanager
class EnergyGenerator: OutpostModule(name = "Генератор энергии") {
    override fun performAction(manager: Resourcemanager): ModuleResult {
        println("Генератор работает...Производит 20 энергии")
        val energy = manager.get("Energy")
        return if (energy!=null){
            energy.amount+=20
            ModuleResult.ResourceProduced("Energy",20)
        } else{
            manager.add(OutpostResource(id=99,"Energy",20))
            ModuleResult.Success("Энергия создана впервые")
        }
    }
}