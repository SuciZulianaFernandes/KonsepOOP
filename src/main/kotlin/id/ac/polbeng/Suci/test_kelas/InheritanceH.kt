package id.ac.polbeng.Suci.test_kelas

open class Rectangle {
    open fun draw(){
        println("From Base class Rectangle")
    }
}

interface Polygon {
    fun draw(){ // interface members are open by default
        println("From interface Polygon")
    }
}

class Square() : Rectangle(), Polygon {
    // The compiler requires draw() to be ovveridden:
    override fun draw() {
        super<Rectangle>.draw() // call to rectangle.draw()
        super<Polygon>.draw()
    }
}

fun main() {
    val square = Square()
    square.draw()
}