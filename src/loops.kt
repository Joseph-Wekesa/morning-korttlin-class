fun main() {

    //while loop
    var number = 20
    while (number <= 25) {
        println("number : $number")
        number++

    }




    var num = 40
    while (num >= 35) {
        println("num :$num")
        num--
    }



//for loop
for (a in 100..105){
    println("Number is $a")
}



for (a in 'a'..'d') {
    var letter = ""
    println("my letter is $letter")
}


    //do..while loop
    var x =30
    do {
        println("nnumber is $x")
        x++
    }
        while (x<=35)



        //Break
        for (b in 70..75) {
            if (b == 73) {
                break
            }

        }






        //continue
        for (character in 'd'..'h') {
            if (character == 'f') {
                continue
            }
            println("character is $character")

        }


    }

