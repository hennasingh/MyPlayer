package geek.com.myplayer

open class Person (name:String, age: Int){

    val name: String
    val age: Int

    init{
        this.name = name
        this.age = age
    }
}

class Developer(name:String) : Person(name, 20)

fun test(){
    val person = Person("John", 30) // does not need a new keyword
}