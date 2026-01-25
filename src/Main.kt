import modules.ModuleResult
import resources.OutpostResource
import resources.Resourcemanager

fun handleModuleResult(result: ModuleResult) {
    when (result) {
        is ModuleResult.Success ->
            println("Успех: ${result.message}")

        is ModuleResult.ResourceProduced ->
            println("Произведено: ${result.resourceName}+${result.amount}")

        is ModuleResult.NotEnoughResources ->
            println(
                "Недостаточно ресурса ${result.resourceName}." +
                        "Нужно: ${result.required}, есть: ${result.avaible}"
            )

        is ModuleResult.Error ->
            println("Ошибка: ${result.reason}")
    }
}
    fun main() {
        val manager = Resourcemanager()
        val gas = OutpostResource(1, "Gas", 100)
        val mineral = OutpostResource(2, "Mineral", 150)
        manager.add(gas)
        manager.add(mineral)
        manager.printAll()
        val bonusmineral = mineral.copy(3, amount = mineral.amount + 70)
        println("Бонусные минералы $bonusmineral")
//        val generatorResult = generator.performAction(manager)
//        val labResult = lab.performAction(manager)
//        handleModuleResult(generatorResult)
//        handleModuleResult(labResult)
//        println()
//        manager.printAll()
    }
