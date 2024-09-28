package id.ac.polbeng.Suci.test_kelas

interface A{
    fun demo(){
        println("From interface A")
    }
}

interface B{
    fun demo(){
        println("From interface B")
    }
}

//this class implements x and y interfaces
class MyClassB: A, B{
    override fun demo(){
        super<A>.demo()
        super<B>.demo()
    }
}

fun main(){
    val obj = MyClassB()
    obj.demo()
}