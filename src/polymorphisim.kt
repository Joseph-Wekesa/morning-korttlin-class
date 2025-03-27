 open class shape{
    open fun draw(){
        println("drawing a shape")
    }
}
class cirle:shape(){
  override  fun draw(){
        println("drawing a circle")
    }
}class rectangle:shape(){
  override  fun draw() {
        println("drawing a rectangle")
    }
}
fun main() {
    var sh=shape()
    sh.draw()
    var cir=cirle()
    cir.draw()
    var rec=rectangle()
    rec.draw()
}