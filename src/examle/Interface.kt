package examle

interface Movable{
    var speed: Int
    val model: String
    val number: String
    fun move()
    fun stop(){
        println("останавливаемся...")
    }
}


class Car(override val model: String, override val number: String):Movable{

    override var speed: Int=60

    override fun move() {
        println("едеи на машине")
    }

}

class AirCraft(override val model: String, override val number: String):Movable{
    override var speed: Int=600

    override fun move() {
        println("Летим на самолете")
    }

    override fun stop() {
        println("приземляемся...")
    }
}

fun travel(obj:Movable)=obj.move()

interface Worker{
    fun work()
}

interface  Student{
    fun study()
}

class WorkingStudent(val name: String):Worker,Student {
    override fun work() {
        println("$name работает")
    }

    override fun study() {
        println("$name Учится")
    }

    interface VideoPlayable {
        fun play()=println("Play video")
    }

    interface AudioPlayable {
        fun play()=println("Play audio")

    }

    class MediaPlayer : VideoPlayable, AudioPlayable {
        override fun play() {
            println("Start playing")
            super<VideoPlayable>.play()
            super<AudioPlayable>.play()
        }
    }

    fun main() {
        val player = MediaPlayer()
        player.play()

        val car = Car("Lada", "134lad")
        val airCraft = AirCraft("Boeing", "243")
    }
}
//        val artem = examle.WorkingStudent("Артем")

//    val car=examle.Car()
//    val  aircraft=examle.AirCraft()
//    examle.travel(obj = car)
//    examle.travel(obj = aircraft)
//    car.move()
//    aircraft.move()

