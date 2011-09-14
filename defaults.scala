object UserInfo {
    val age = -1
    val firstname = ""
    val surname = ""
}

class UserInfo(val age:Int = UserInfo.age, val firstname:String = UserInfo.firstname, val surname:String = UserInfo.surname) {
    override def toString = "age: " + age + " firstname: " + firstname + " surname:" + surname
}

println(new UserInfo)
println(new UserInfo(age = 10))
println(new UserInfo(10, surname = "surname"))
