package org.walterfurrer

class Monster(
    val name: String,
    var health: Int,
    val strength: Int,
) {
    fun attack(): Int {
        return strength
    }

    fun takeDamage(amount: Int) {
        health -= amount
        if (health < 0) health = 0
    }

    fun isAlive(): Boolean {
        return health > 0
    }
}

object MonsterLibrary {
    val comicSansStabber = Monster("Comic Sans Stabber", 15, 1)
    val sansSheriff = Monster("Sans Sheriff", 22, 3)
    val wingdings = Monster("Wingdings",30,5)

    fun getMonster(name: String): Monster? {
        return when(name) {
            "Sans Sheriff" -> sansSheriff.copy()
            "Wingdings" -> wingdings.copy()
            "Comic Sans Stabber" -> comicSansStabber.copy()
            else -> null
        }
    }

    private fun Monster.copy(): Monster {
        return Monster(this.name, this.health, this.strength)
    }
}


