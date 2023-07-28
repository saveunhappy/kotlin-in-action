package ch04.ex4_2_2_CompanionObjects1

fun getFacebookName(accountId: Int) = "fb:$accountId"
//工具类，不能让你创建对象，只能让你用类名.方法名调用，那不就是工具类么。
class User private constructor(val nickname: String) {
    companion object {
        fun newSubscribingUser(email: String) =
            User(email.substringBefore('@'))

        fun newFacebookUser(accountId: Int) =
            User(getFacebookName(accountId))
    }
}

fun main(args: Array<String>) {
    val subscribingUser = User.newSubscribingUser("bob@gmail.com")
    val facebookUser = User.newFacebookUser(4)
    println(subscribingUser.nickname)
    println(facebookUser.nickname)
}
