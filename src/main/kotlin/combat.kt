package org.walterfurrer

fun combat() {
    if (fira.currentHealth > 0 && monsters.currentHealth > 0) {
        playerTurn()
    }
    if (Creature.currentHealth <= 0) {
        endCombat()
    }
    else {
        gameOver()
    }
}