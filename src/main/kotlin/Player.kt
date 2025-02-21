package com.monoknight

val player = Player()
val goblin = Goblin()

class Player(
    val name: String = "Fira",
    private var level: Int = 1,
    var totalHealth: Int = 10,
    var currentHealth: Int = totalHealth,
    private var strength: Int = 2,
    private var intellect: Int = 1,
    )
{
    fun playerOptions() {
        println("\nWhat would you like to do?")
        println("1. Sword Attack")
        println("2. Fireball\n")
        val playerChoice = readln()
        when (playerChoice) {
            "1" -> playerAttack()
            "2" -> fireball()
            else -> {
                println("\nInvalid choice. Please try again.")
                playerOptions()
            }
        }
    }
    private fun playerAttack() {
        val damage = strength * (1..2).random()
        val attackChance = (0..3).random()
        if (attackChance >= 1) {
            println("\nYou strike the ${goblin.name} with your Sword and deal $damage damage!")
            goblin.health -= damage
        }
        else {
            println("\nYour attack missed!")
        }
    }

    private fun fireball() {
        val fireballDamage = intellect * (1..3).random()
        val fireballChance = (0..3).random()
        if (fireballChance >= 1) {
            println("\nYou cast Fireball and hit the ${goblin.name} for $fireballDamage damage!")
            goblin.health -= fireballDamage
        }
        else {
            println("\nYour Fireball missed!")
        }
    }

    private fun fullHeal() {
        currentHealth = totalHealth
    }

    fun levelUp() {
        val strengthIncrease: IntRange = 2..3
        val intellectIncrease: IntRange = 1..2

        level ++
        player.totalHealth += 5
        strength += strengthIncrease.random()
        intellect += intellectIncrease.random()
        println("\nYou have leveled up! Your total health, strength, and intellect have increased.")
        fullHeal()
        println("\nPress Enter to continue...")
        readln()
    }
}






