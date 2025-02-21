package com.monoknight

class Goblin(
    val name: String = "Goblin",
    var health: Int = 8,
    private val strength: IntRange = 1..2,
    ) {
    fun goblinTurn() {
        val damage = goblin.strength.random()
        println("The ${goblin.name} attacks you for $damage damage!")
        currentHealth -= damage
    }
}

