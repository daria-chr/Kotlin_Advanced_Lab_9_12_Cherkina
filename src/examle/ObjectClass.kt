package examle

object GameSession {
    init {
        println("Игровая сесия создана")
    }

    var isActiive: Boolean = false
    fun start() {
        isActiive = true
        println("Игра началась")
    }

    fun end() {
        isActiive = false
        println("Игра завершена")
    }

    object Logger {
        var count = 0

        fun log(message: String) {
            count++
            println("[$count] $message")
        }

        object AppSetting {
            val version = "1.0.0"
            var isDarkMode = true

            fun toggleTheme() {
                isDarkMode = !isDarkMode
            }

            fun checkTheme() {
                if (AppSetting.isDarkMode) {
                    println("Темная тема включена")
                }
            }
            object Colors{
                const val RED="#FF0000"
                const val GREEN="#00FF00"
                const val  BLUE="#0000FF"
            }

            class MyCar(val model: String){
                fun drive()=println("$model едет")
                object TrafficController{
                    var carCount=0
                    fun carPassed(){
                        carCount++
                    }
                }
            }


            fun main() {
                println("Прогрпмма запущена")
                println("Проверяем состояние, но не трогаем GameSession")
                println("Теперь запускаем игру")
                GameSession.start()
                println("Проверяем состояние еще раз")
                println("Активна ли сессия: ${GameSession.isActiive}")

                Logger.log("Первое сообщение")
                Logger.log("Второе сообщение")
                val logger1 = Logger
                val logger2 = Logger
                println(logger1 == logger2)

                val handler=object {
                    val name="Обработчик"
                    fun handle(){
                        println("Обрабатываю...")
                    }
                }
                println(handler.name)
                handler.handle()

                MyCar("Toyota")
                MyCar("BMW")
                MyCar.TrafficController.carPassed()
            }
        }
    }
}