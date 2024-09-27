package id.ac.polbeng.Suci.test_kelas

open class MyBase{
    //Must use "open" modifier to allow chil classes to ovveride it
    open fun think(){
        println("Hey!! i am thinking")
    }
}

class MyDerived: MyBase() {
    override fun think(){
        println("I am from child")
    }
}

fun main(){
    val myBase = MyBase()
    myBase.think()
    var myDerived = MyDerived()
    myDerived.think()
}