package id.ac.polbeng.Suci.test_kelas

open class NewPerson {
    open var age: Int = 1
}

class CheckedPerson : NewPerson() {
    override var age: Int = 1
        set(value) {
            field = if (value > 0) value else throw IllegalArgumentException("Age cannot be negative")
        }
}

fun main() {
    val person = NewPerson()
    person.age = -5 // works, but not recommended

    val checkedPerson = CheckedPerson()

    // Pastikan untuk memeriksa nilai sebelum mengatur
    val newAge = -5
    if (newAge > 0) {
        checkedPerson.age = newAge
    } else {
        println("Invalid age: $newAge. Age cannot be negative.")
    }
}
