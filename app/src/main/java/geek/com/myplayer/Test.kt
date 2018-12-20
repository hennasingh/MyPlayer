package geek.com.myplayer

open class Person (name:String = "Peter", val age: Int = 10){
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

    val p2 = Person("Tom") // will create person with name Tom and age 10 (default value)
    val p3 = Person(age = 20)
    val p4 = Person(age=30, name="Thomas") //makes use of constructor overloading here, this works in Kotlin
}