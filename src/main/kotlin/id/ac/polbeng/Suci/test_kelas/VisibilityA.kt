package id.ac.polbeng.Suci.test_kelas

private class privateExample{
    private val i = 1
    private fun doSomething(){
        println("Welcom to private access!")
        println("Private Access : $i")
    }
    fun calldoSomething(){
        doSomething();
    }
}

///protected
open class C(){
    protected val i = 1
}
class D : C(){
    fun getValue() : Int{
        println("Welcome to protcted access!")
        return i
    }
}

//internal
class internalExample{
    internal  val i = 1
    internal fun doSomething(){
        println("Welcome to internal access")
        println("Internal Access : $i")
    }
}

//puvlic
class publicExample{
    val i = 1
    fun doSomething(){
        println("Welcome to public access!")
        println("Public access : $i")
    }
}

fun main(){
    val objPrivate = privateExample()
    objPrivate.calldoSomething()
    val objProtected = D()
    println(println("Protected Access : ${objProtected.getValue()}"))
    val objInternal = internalExample()
    objInternal.doSomething()
    val objPublic = publicExample()
    objPublic.doSomething()
}