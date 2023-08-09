
# Rock Paper & Scissors with Kotlin

This is a simple project based on most popular real world game RPS, Here I have created game using kotlin programming language.
(*note: Two player game.*)


## Installation

Import my-project in IntelliJ
    
## Files Structures

There are total **3** important files:\
In data directory these are two classes->\
**data>Person**\
**data>RPSGame**\
\
app is:\
**Main.kt**

_**What does it do?:**_\
**data>Person** -> class take person name as input and it has **makeMove()** method which return one of following: rock, paper & scissor move gesture.

**data>RPSGame** -> class takes two Person objects as player1 & player2, It has **play()** method which carried logic of game based on Person objects **makeMove()**.

Main.kt -> where is _objects are initialized_ and called **RPSGame.play()** function.
## Usage/Examples

```kotlin
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
```


## Contributing

If you would like to contribute to the project,
you can:

* Report bugs.
* Suggest new features.
* Suggest code improment.
* Send pull requests.


## Contact

If you have any questions about the project,
you can contact me at:

-> *jposhapir@gmail.com*\
-> *sholdanposhapir@gmail.com*\
-> *https://twitter.com/Joel_Poshapir*
