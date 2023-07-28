package ch06.ex1_7_TheLetFunction

fun sendEmailTo(email: String) {
    println("Sending email to $email")
}

fun main(args: Array<String>) {
    var email: String? = "yole@example.com"
    //如果不是空，就执行这段逻辑，不用写if else了，这个还是比较人性化的。
    email?.let { sendEmailTo(it) }
    email = null
    email?.let { sendEmailTo(it) }
}
