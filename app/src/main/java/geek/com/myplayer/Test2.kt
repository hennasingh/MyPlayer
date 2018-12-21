package geek.com.myplayer

data class User(val name:String, val age: Int)

fun test(list: List<User>){

    for ((name, age) in list){
        print(name)
        print(age)
    }

}
