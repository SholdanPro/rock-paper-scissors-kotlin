import data.Person
import data.RPSGame
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

suspend fun main() {

    //Two persons objects for RPSGame
    val person1 = Person("John")
    val person2 = Person("Ada")

    val playRPSGame = RPSGame(person1, person2)

    /* Here we implemented coroutine because we add 2 seconds delay and
    *  RPSGame.play() method has recursive function it will print winners until
    *  we get 'draw' */
    coroutineScope {
        launch{
            println(playRPSGame.play())
        }
    }

}