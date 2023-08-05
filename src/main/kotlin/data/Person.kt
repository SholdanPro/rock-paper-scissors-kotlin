package data

import kotlin.random.Random

class Person(
        val name: String,
) {

    fun makeMove(): String? {

        val RPS: Map<Int, String> = mapOf(0 to "rock", 1 to "paper", 2 to "scissor")
        val randomNum = Random.nextInt(until = 3)

        return RPS.get(randomNum)

    }

}