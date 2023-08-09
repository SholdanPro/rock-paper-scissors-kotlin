package data

import kotlinx.coroutines.delay

/* RPSGame class takes two Person object as players & it's play() function
*  has RPSGame logic based on players moves.
*
* suspend function : coroutine use for delaying of two seconds
*
* recursive function : recursive function used for players plays until 'draw'.
*  */

class RPSGame(
        private val player1: Person,
        private val player2: Person
) {

    suspend fun play () {
        val RPS: Map<String, String> = mapOf("rock" to "✊", "paper" to "✋", "scissor" to "🤘")
        val playerGuess: MutableList<String> = mutableListOf()
        player1.makeMove()?.let { playerGuess.add(it) }
        player2.makeMove()?.let { playerGuess.add(it) }
        val playerGuessed: List<String> = playerGuess
        val p1 = playerGuessed[0]
        val p2 = playerGuessed[1]

        //Define for recursive behaviour
        var functionReturn = "continue"

        println("Player1 ${player1.name} : ${RPS[p1]} (${p1})")
        println("Player2 ${player2.name} : ${RPS[p2]} (${p2})")

        //RPS Logic
        if (p1 == "rock" && p2 == "paper") {
            println("Congratulation!")
            println("${player2.name} Won!\n")
        } else if(p1 == "rock" && p2 == "scissor") {
            println("Congratulation!")
            println("${player1.name} Won!\n")
        } else if(p1 == "paper" && p2 == "rock") {
            println("Congratulation!")
            println("${player1.name} Won!\n")
        } else if(p1 == "paper" && p2 == "scissor") {
            println("Congratulation!")
            println("${player2.name} Won!\n")
        } else if (p1 == "scissor" &&  p2 == "rock") {
            println("Congratulation!")
            println("${player2.name} Won!\n")
        } else if (p1 == "scissor" && p2 == "paper") {
            println("Congratulation!")
            println("${player1.name} Won!\n")
        } else {
            println("DRAW!")
            functionReturn = "draw"
        }

        //Recursive Logic
        println(functionReturn)
        if (functionReturn == "draw") {
            println("Exited")
        } else {
            //Two seconds delay
            delay(2000)
            play()
        }

    }

}