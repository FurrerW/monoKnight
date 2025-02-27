package org.walterfurrer

fun main() {
    gamePrologue()
    gameEnding()
}

fun gamePrologue() {
    println("Welcome to the Kingdom of Helvetica, where fonts of all types have prospered under King Garamond for a " +
            "number of years.")
    println("Recently, however, there have been murmurings of unrest amongst the population.")
    println("You play as the head of the monoKnights, Fira. A long trusted sword of the King. You receive word of a " +
            "potential hideout for those that would pose a threat to the throne amongst the cave system just outside " +
            "of Helvetica.")
    println("We start our adventure as Fira is exploring this cave. Equipped with a sword and a torch to light the " +
            "way, you make your way deeper into the cave, but haven't seen anything of note yet. That is until you " +
            "turn the corner and eye a Goblin 20ft ahead of you. You draw your sword and get closer, ready to strike.")
}

fun gameEnding() {
    println("After defeating Wingdings, you look around the camp and find a note detailing a planned attack on the " +
            "King this evening! You make haste for the King's side and pray you aren't too late...")
    println("That's it! Thanks for playing this stupid little project I made so I can practice some Kotlin.")
    return
}

fun gameOver() {
    println("\nGame Over!")
    println("Would you like to play again? (yes/no)")
    val playAgain = readln()
    if (playAgain == "yes") {
        gamePrologue()
    } else {
        println("Thank you for playing monoKnight!")
    }
}