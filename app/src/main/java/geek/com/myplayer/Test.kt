package geek.com.myplayer

open class Person (val name:String, val age: Int)

class Developer(name:String) : Person(name, 20)

fun test(){
    val person = Person("John", 30) // does not need a new keyword
}