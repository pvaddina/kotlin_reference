enum class GameLevel {
    Easy, Medium, Hard, CheatUser
}

object GameUserFactory {
    fun Create(gl: GameLevel) : Game {
        return when(gl) {
            GameLevel.Easy -> Game.Easy("Harry", 30)
            GameLevel.Medium -> Game.Medium("Ron", 25, 99.4)
            GameLevel.Hard -> Game.Hard("Voldemort", 50, 5)
            GameLevel.CheatUser -> Game.CheatUser("Dumbledore", 33, 55, 995.95)
        }
    }
}

sealed class Game {
    data class Easy(val user: String, val startlevel: Int) : Game() {
        override fun toString(): String {
            return "Easy: Username:$user, CurrentLevel:$startlevel"
        }
        override fun equals(other: Any?): Boolean {
            return super.equals(other)
        }
        override fun hashCode(): Int {
            return super.hashCode()
        }
    }
    data class Medium(val user: String, val startlevel: Int, val life: Double) : Game() {
        override fun toString(): String {
            return "Medium: Username:$user, CurrentLevel:$startlevel, Life left:$life"
        }
    }
    data class Hard(val user: String, val startlevel: Int, val weapons: Int) : Game() {
        override fun toString(): String {
            return "Hard: Username:$user, CurrentLevel:$startlevel, Number of weapons:$weapons"
        }
    }
    data class CheatUser(val user: String, val startlevel: Int, val weapons: Int, val cheatPrice: Double) : Game() {
        override fun toString(): String {
            return "Cheatuser: Username:$user, CurrentLevel:$startlevel, Number of weapons:$weapons, Price paid for the cheat codes: $cheatPrice"
        }
    }
}

fun Game.CheatUser.PrintVal() {
    println("Cheat user with advanced skills")
}

val Game.Hard.MaxUsers : Int
    get() = 100

fun main() {
    val cheat_user = GameUserFactory.Create(GameLevel.CheatUser)
    println(cheat_user)
    val med = GameUserFactory.Create(GameLevel.Medium)
    println(med)
    val easy = GameUserFactory.Create(GameLevel.Easy)
    println(easy)
    val hard = GameUserFactory.Create(GameLevel.Hard)
    println(hard)
}