package edu.miamioh.upadhyi.memorygame.models

enum class BoardSize(val numCards: Int) {
    //different levels of game
    EASY(8),
    MEDIUM(18),
    HARD(24);

    companion object {
        fun getByValue(value: Int) = values().first { it.numCards == value }
    }

    fun getWidth(): Int {
        return when (this) {
            EASY -> 2
            MEDIUM -> 3
            HARD -> 4
        }
    }

    fun getHeight(): Int {
        return numCards / getWidth()
    }

    fun getNumPairs(): Int {
        return numCards / 2
    }
}