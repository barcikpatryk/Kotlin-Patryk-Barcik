fun main(){
    var name:String? = "Patryk Barcik"


    println("Długość napisu $name: ${name?.length}")

    try {
        println("Długość napisu $name: ${name!!.length}")
    }catch(e: NullPointerException){
        println("Przechwycono wyjątek: ")
        println(e.stackTraceToString())
    }
}