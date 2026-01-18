package actions
import resources.Resourcemanager
interface ModuleAction {
    fun execute(manager: Resourcemanager)
}