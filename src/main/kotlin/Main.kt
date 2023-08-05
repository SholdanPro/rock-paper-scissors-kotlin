import data.Person
import data.RPSGame
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

suspend fun main() {

    val person1 = Person("John")
    val person2 = Person("Ada")

    val playRPSGame = RPSGame(person1, person2)

    coroutineScope {
        launch{
            println(playRPSGame.play())
        }
    }

}