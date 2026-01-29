import resources.OutpostResource
import java.io.File
object FileStorage {
    private const val FILE_NANE = "outpost_state.txt"
    fun save(resources: List<OutpostResource>) {
        val file = File(FILE_NANE)
        file.writeText(
            resources.joinToString("\n") {
                "${it.id.toString().padEnd(3)}| ${it.name.padEnd(10)}| ${it.amount}"
            }
        )
        println("Состояние базы сохранено в файл")
    }

    fun load(): List<OutpostResource> {
        val file = File(FILE_NANE)
        if (!file.exists()) return emptyList()
        println("Загрузка состояния базы из файла")
        return file.readLines().map {
            val (id, name, amount) = it.split(";")
            OutpostResource(id.toInt(), name, amount.toInt())
        }
    }
}

