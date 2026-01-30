package outpostState

import kotlin.properties.Delegates
class ObservableResource(
    val name: String,
    startamount:Int
){
    var amount:Int by Delegates.observable(startamount){
        _,old,new->println("Ресурс $name изменен $old->$new")
    }
}