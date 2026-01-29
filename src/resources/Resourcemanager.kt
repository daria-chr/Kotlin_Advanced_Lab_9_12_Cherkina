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
    fun getAll(): List<OutpostResource> =resources.toList()
}
