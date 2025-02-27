package org.walterfurrer

private val Monster.Companion.comicSansStabber: Any
    get() {}
val fira = Fira()

class Fira (
    private var level: Int = 1,
    private var totalHealth: Int = 10,
    var currentHealth: Int = totalHealth,
    private var strength: Int = 3,
    private var intellect: Int = 2
) {
    private fun swordAttack() {
        val swordDamage = strength * (1..3).random()
        val swordChance = (0..3).random()

        if (swordChance > 0) {
            println("You hit the ${Monster("Sans Sheriff").name} for $swordDamage damage!")
            monster.name -= monster.health
        }
        else {
            println("Your attack missed!")
        }
    }

    private fun fireball() {
        val fireballDamage = intellect * (1..3).random()
        val fireballChance = (0..3).random()

        if (fireballChance > 0) {
            println("Fira: Boom...bam...bap. Bada bop boom. Pow!")
            println("Your Fireball hit the ${placeholder} for $fireballDamage damage!")
            println("Fira: But I'm not a rapper.")
//            placeholder -= fireballDamage
        }
        else {
            println("Your Fireball missed!")
        }
    }

    private fun healthPotion() {
        val potionValue = totalHealth / 2
        currentHealth += potionValue
        println("You were healed for $potionValue")
    }

    fun playerTurn() {
        println("What would you like to do?")
        println("1. Swing your mighty sword")
        println("2. End this man's whole career")
        println("3. Use a potion")

        val playerChoice = readln()

        when (playerChoice) {
            "1" -> swordAttack()
            "2" -> fireball()
            "3" -> healthPotion()
        }
    }

    private fun fullHeal() {
        currentHealth = totalHealth
    }

    fun levelUp() {
        val strengthIncrease: IntRange = 3..4
        val intellectIncrease: IntRange = 2..3

        level ++
        totalHealth += 5
        strength += strengthIncrease.random()
        intellect += intellectIncrease.random()
        println("\nYou have leveled up! Your total health, strength, and intellect have increased.")
        fullHeal()
        println("\nPress Enter to continue...")
        readln()
    }
}











