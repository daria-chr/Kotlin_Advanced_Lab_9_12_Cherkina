package resources

import modules.EnergyGenerator
import modules.ResearchLab

class Resourcemanager {
    private val resources=mutableListOf<OutpostResource>()
    fun add(resource: OutpostResource){
        resources.add(resource)
        println("добавлен ресурс ${resource.name}")
    }
    fun get(name: String): OutpostResource?{
        return  resources.find { it.name==name}
    }
    fun printAll(){
        println("ресурсы базы")
        resources.forEach { println("${it.name}:${it.amount}") }
    }
}
fun main(){
    val manager=Resourcemanager()
    manager.add(OutpostResource(1, "Minerals", 120))
    manager.add(OutpostResource(2, "Gas", 40))
    val generator= EnergyGenerator()
    val lab= ResearchLab()
    generator.performAction(manager)
    lab.performAction(manager)
    println()
    manager.printAll()
}