package outpostState

class OutpostManager {
    private val items=mutableListOf<ObservableResource>()
    val itemList: List<ObservableResource>
        get()=items.toList()
    fun addItems(item: ObservableResource){
        items.add(item)
        println("Добавлен: ${item.name}(${item.amount})")
    }
}