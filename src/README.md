 Лабораторная работа №9-10: Продвинутое ООП на Kotlin
## Описание
Лабораторная работа посвящена изучению продвинутых концепций объектно-ориентированного
программирования в Kotlin.
## Структура проекта
Проект содержит примеры реализации продвинутых механизмов ООП, а также пояснения к ключевым
концепциям.
## Как запустить проект
1. Клонируйте репозиторий:
```bash
git clone <URL_репозитория>
```
2. Откройте проект в IntelliJ IDEA.
3. Запустите любой пример через контекстное меню или напрямую из `characters.characters.main`.
## Автор
Черкина Дарья Алексеевна
## Лицензия
Проект создан в учебных целях.

## геттеры и сеттеры
Позволяют контролировать доступ к свойствам класса. Пример:
  
    var age: Int = 18
    set(value){
    if ((value>0) and (value<100))
    field=value
    }
## инкапсуляция 
Скрытие внутренней реализации, защита данных от некорректных изменений. Пример:
    
    var level: Int=1
    private set
    fun levelup(){
    level++
    println("$name повысил уровень до $level")
    }
##  data-классы
Классы хранения данных. Пример:

    data class Item(
    val id: Int,
    val name: String,
    val quantity:Int
    ){
    override fun toString(): String {
    return "ID: $id | name: $name |  quantity: $quantity"
    }
    }
##  абстрактные классы
Общий код и обязательные иетоды/ свойства для наследников. Пример:

    abstract class Human(val name: String){
    abstract var age: Int
    abstract fun hello()
    }
    class Person(name: String,override var age: Int=0):Human(name){
    override fun hello() {
        println("My name is $name")
    }
    }
## интерфейсы.
Определяют контракт поведения без хрранения состояния. Пример:

    interface Movable{
    fun move()
    }
    class Car(override val model: String, override val number: String):Movable{
    override fun move() {
        println("едеи на машине")
    }
    }
