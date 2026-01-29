import modules.EnergyGenerator
import modules.ModuleResult
import modules.ResearchLab
import resources.OutpostResource
import resources.Resourcemanager
import javax.annotation.processing.Messager

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
object SystemLogger{
    init {
        println("SystemLogger инициализирован")
    }
    fun log(messager: String){
        println("[LOG] $messager")
    }
}
val logger by lazy {
    SystemLogger
}
    fun main() {

        val manager = Resourcemanager()
        val gas = OutpostResource(1, "Gas", 100)
        val mineral = OutpostResource(2, "Mineral", 150)
        manager.add(gas)
        manager.add(mineral)
        manager.printAll()
//        val bonusmineral = mineral.copy(3, amount = mineral.amount + 70)
//        println("Бонусные минералы $bonusmineral")
//        val generatorResult = generator.performAction(manager)
//        val labResult = lab.performAction(manager)
//        handleModuleResult(generatorResult)
//        handleModuleResult(labResult)
//        println()
        manager.printAll()
        logger.log("Запуск базы")
        val loadedResources=FileStorage.load()
        loadedResources.forEach { manager.add(it) }
        if (loadedResources.isEmpty()){
            manager.add(OutpostResource(1,"Minerals",300))
            manager.add(OutpostResource(2,"Gas",100))
        }
        FileStorage.save(manager.getAll())
    }
