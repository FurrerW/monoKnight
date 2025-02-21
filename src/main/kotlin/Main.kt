package com.monoknight

var currentHealth = player.currentHealth


fun main() {
    gameStart()
}

fun gameStart() {
    println("\nWelcome to monoKnight!")
    println("\nYou play as the brave knight, ${player.name}. You are currently patrolling a cave near the kingdom of " +
            "Helvetica.")
    println("Equipped with a sword, shield, and a torch to light the way, you continue your patrol until you hear a " +
            "cry from deeper within the cave...")
    println("\nPress Enter to continue...")
    readln()
    goblinBattle()
    println("Just as you are resting from your battle, you hear the clanking of armor and the sound of footsteps " +
            "echoing through the cave.\nPrepare yourself, brave knight!")
}

fun gameOver() {
    println("\nGame Over!")
    println("Would you like to play again? (yes/no)")
    val playAgain = readln()
    if (playAgain == "yes") {
        gameStart()
    } else {
        println("Thank you for playing monoKnight!")
    }
}

fun goblinBattle() {
    println("\nA Goblin appears from the shadows!")
    while (goblin.health > 0 && currentHealth > 0) {
        player.playerOptions()
        goblin.goblinTurn()
        println("Your health: ${currentHealth}/${player.totalHealth}")
    }
    if (goblin.health <= 0) {
        println("\nYou have defeated the Goblin!")
        player.levelUp()
    }
    else {
        gameOver()
    }
}
