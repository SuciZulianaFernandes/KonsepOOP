package id.ac.polbeng.Suci.test_kelas

fun main(){
    //cretaing an instance of the interface
    var programmer: Human = object : Human{
        override fun think(){
            print("I am an example of anonymous Inner Class")
        }
    }
    programmer.think()
}

interface Human{
    fun think()
}