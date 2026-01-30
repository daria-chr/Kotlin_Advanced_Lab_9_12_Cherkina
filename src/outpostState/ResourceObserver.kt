package outpostState

class ResourceObserver{
    fun onResourceChanged(item: ObservableResource,old: Int, new: Int){
        println("[наблюдающий] '${item.name}' изменился $old->$new")
    }
}