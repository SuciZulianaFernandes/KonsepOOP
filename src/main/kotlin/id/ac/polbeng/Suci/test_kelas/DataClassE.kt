package id.ac.polbeng.Suci.test_kelas

fun main() {
    val meri = Student("Meri", 20)
    //Destructuring declaration
    val(name, age) = meri
    println("Name = $name")
    println("Age = $age")
}