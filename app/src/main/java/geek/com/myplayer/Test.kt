package geek.com.myplayer

open class Person (name:String, val age: Int){
    var name: String = name
    get() ="Name: $field"

    set(value) {
        if(value!= field){
            field = value
        }
    }
}

class Developer(name:String) : Person(name, 20)

fun test(){
    val person = Person("John", 30)
    val age = person.age
    val name = person.name
}