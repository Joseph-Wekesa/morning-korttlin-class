//parent class/base class/supr class
 open class animal{
    var gnder="male"
    var age=3


    fun makesound(){


        println("animal is speaking")
    }

}
//child class/derived class/sub class
class dog:animal(){
    fun bark(){

        println("woof! woof!")

    }

}
class cat{

    var color ="white"
    var hasfur=true

    fun meow(){
        println("meow! meow!")


    }

}

fun main() {
    var a =animal()
    var d=dog()
    var c=cat()

}