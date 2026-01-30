package outpostState

fun main() {
    val manager by lazy {
        println("Менеджер создан")
        OutpostManager()
    }
    val watcher= ResourceObserver()
    val loaded= StateStorage.load()
    if (loaded.isNotEmpty()){
        loaded.forEach { manager.addItems(it) }
    } else{
        manager.addItems(ObservableResource("Минералы",300))
        manager.addItems(ObservableResource("Газ",100))
    }
    manager.itemList.forEach {
        it.amount+=50
        watcher.onResourceChanged(it,it.amount-50, it.amount)
    }
    StateStorage.save(manager.itemList)
}