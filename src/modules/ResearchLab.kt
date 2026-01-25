package modules
import resources.Resourcemanager
import resources.OutpostResource
class ResearchLab: OutpostModule(
    name="Исследовательская лаборатория"
) {
    override fun performAction(manager: Resourcemanager): ModuleResult {
        val minerals = manager.get("Minerals")
        if (minerals == null || minerals.amount < 30) {
            return ModuleResult.NotEnoughResources(
                resourceName = "Minerals",
                30,
                avaible = minerals?.amount ?: 0
            )

        }
        minerals.amount -= 30
        return ModuleResult.Success("Исследование завершено")
    }
}