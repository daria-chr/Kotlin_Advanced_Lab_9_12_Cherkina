package examle

import kotlin.properties.Delegates

class GameHero(startNane: String) {
    var name: String by Delegates.observable(startNane) { _, old, new ->
        println("[$old] получил новое имя $new")
    }
    var mana: Int by Delegates.observable(100) { _, old, new ->
        println("Мана $old->$new")
    }
    val ultumate: String by lazy {
        println("Загружаем анимацию способности...")
        "Метеоритный дождь"
    }
}

fun main() {
    println("Создаем героя...")
    val hero= GameHero("Воин света")

    println("\nТекущая иана: ${hero.mana}")

    println("\nгерой пытается использовать способности")
    println("Способность: ${hero.ultumate}")

    println("\nПовторный вызов способности")
    println("Способность: ${hero.ultumate}")

    println("\nМеняем имя героя")
    hero.name="Темный паладин"

    println("\nГерой восстанавливает ману")
    hero.mana=200



}
