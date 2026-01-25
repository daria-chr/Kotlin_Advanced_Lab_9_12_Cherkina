package gameCharacter

fun handle(state: CharacterState){
    when(state){
        CharacterState.Idle -> println("Персонаж ничего не делает")
        CharacterState.Running -> println("Персонаж бежит")
        is CharacterState.Die ->println("Персонаж погиб: ${state.reason}")
        is CharacterState.Attacking -> println("Персонаж атакует. урон ${state.damage}")
    }
}
fun main(){
    val person= GameCharacter("Человек-паук")
    handle(person.state)
    person.change(CharacterState.Running)
    handle(person.state)
    person.change(CharacterState.Attacking(40))
    handle(person.state)
    person.change(CharacterState.Die("разбился"))
    handle(person.state)
}