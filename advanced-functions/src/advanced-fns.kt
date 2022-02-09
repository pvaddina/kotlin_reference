fun FindUserAndPrint(items: List<Int>, predicate: (Int)->Boolean) {
    items.forEach {
        if (predicate(it)) {
            print("$it: Cheat user, ")
        } else {
            print("$it: Normal user, ")
        }
    }
}

fun FindUser(items: List<Int>, predicate: ((Int)->Boolean)?) {
    items.forEach {
        if (predicate?.invoke(it) == true) {
            print("$it: Advanced user, ")
        } else {
            print("$it: Normal user, ")
        }
    }
}

enum class PredicateType {
    FIND_CHEATER, FIND_AGE
}

val cheater_predicate: (Int) -> Boolean = {
    it > 60
}
val age_predicate: (Int) -> Boolean = {
    it > 20
}

fun GetPredicate(ptype: PredicateType) : (Int)->Boolean {
    return when(ptype) {
        PredicateType.FIND_CHEATER -> cheater_predicate
        PredicateType.FIND_AGE -> age_predicate
    }
}

fun main() {
    FindUserAndPrint(listOf(4,6,23,2,54,11,7), { it > 20 })
    println("")
    FindUser(listOf(4,60,23,2,54,11,7), { it > 50 })
    println("")
    val ages = listOf(11,22,33,44,99,88,77,66,44,33,49,33,22)
    FindUser(ages, GetPredicate(PredicateType.FIND_CHEATER))
    println("")
    FindUser(ages, GetPredicate(PredicateType.FIND_AGE))
}

