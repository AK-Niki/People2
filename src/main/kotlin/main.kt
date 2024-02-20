fun main() {
    val likes = 41
    println(getLikesMessage(likes))
}

fun getLikesMessage(likes: Int): String {
    return "Понравилось $likes ${if (likes % 10 == 1 && likes % 100 != 11) "человеку" else "людям"}"
}