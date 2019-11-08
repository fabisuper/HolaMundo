import model.Camera
import model.Movie
import model.Shoe
import java.lang.NullPointerException
import javax.print.attribute.standard.PrinterLocation
import javax.smartcardio.Card

fun main(arg: Array<String>) {
    println("Hola Mundo")
    println(1+1)
    println(3-1)
    println(2*2)
    println(4/2)
    println(7%2)

    var a = -2
    val b = a.unaryMinus()

    println(a.plus(b))
    println(a.minus(b))
    println(a.times(b))
    println(a.div(b))

    println("b: $b")

    val d = true
    var e = d.not()

    println("e: $e")

    a = 0
    a = ++a
    println("++a. $a")
    a = a++
    println("++a. $a")
    a = a.inc()
    println("a. $a")

    //val name: String = arg[0]
    //val zoo = 0

    //println(name)

    val nombre = "hola Fabi"
    val apellido:String = "Anzola"

    println("Tu nombre es: $nombre $apellido")
    //Especiales \t, \b, \n, \r, \', \", \\ y \$

    val nombrApellido = "\\y\$Fabian\n \"Anzola\""

    //Raw String
    val parrafo = """
        Lorem Ipsum is simply dummy text of the printing and typesetting
        ** industry. Lorem Ipsum has been the industry's standard dummy
        text ever since the 1500s, when an unknown printer took a galley
        ** of type and scrambled it to make a type specimen book. It has
        survived not only five centuries, but also the leap into electronic
        typesetting, remaining essentially unchanged. It was popularised
        in the 1960s with the release of Letraset sheets containing Lorem
        Ipsum passages, and more recently with desktop publishing
        software like Aldus PageMaker including versions of Lorem Ipsum.
    """.trimIndent()

    println(parrafo.trimMargin(marginPrefix = "**"))
    println("Tu nombre es: $nombrApellido")

    var o:Int = 5
    var p:String=o.toString()
    println(p)

    //rango
    val unoAlCien: IntRange = 1..5
    for (i:Int in unoAlCien){
        println(i)
    }

    //val aALaLetraCe ='a'..'c'
    for (letra:Char in 'A'..'C')
        println(letra)

    //if operadores logicos
    val numero=2
    if (numero.equals(2)){//true
        println("Si son iguales")
    }else{
        println("No son iguales")
    }

    //when
    when(numero){
        in 1..5-> println("Si esta entre 1 y 5")
        in 1..3-> println("Si esta entre 1 y 3")
        !in 5..10-> println("No esta entre 5 y 10")
        else -> println(" No esta en ninguno de los anteriores")
    }

    //while
    var i = 1
    while (i<=1 ){
        println("Mensaje $i")
        i++
    }

    //i=1

    do {
        println("Mensaje DoWWhile $i")
        i++
    }while (i<1)

    var daysOfWeek = listOf("Domingo","Lunes","Martes","Miercoles","Jueves","Viernes","Sabado")
    for(day in daysOfWeek){
        println(day)
    }
    //acceso al indice
    for((index,day) in daysOfWeek.withIndex()){
        println("$index :$day")
    }
    daysOfWeek.forEach{
        println(it)//forEach es 10x mas lento que el for
    }

    //break
    for (i in 1..3) {
        println("\ni: $i ")
        for (j in 1..5) {
            if (j.equals(3)) break
            println("j: $j")
        }
    }

    //continue
    for (i in 1..3) {
        println("\ni: $i ")
        for (j in 1..5) {
            if (j.equals(3)) continue
            println("j: $j")
        }
    }

    //sin nada
    for (i in 1..3) {
        println("\ni: $i ")
        for (j in 1..5) {
            if (j.equals(3))
                println("j: $j")
        }
    }

    //Saltar hacia un label(etiqueta): "nombre"@
    //break
    println("ESTE ES BREAK & LABEL")
    for (i in 1..3) {
        println("\ni: $i ")
        for (j in 1..3) {
            println("\nj: $j")
            for (k in 1..5) {
                if (k.equals(3)) break
                println("k: $k")
            }
        }
    }

    println("Así se verían nuestros for’s usando un label")
    terminarTodoCiclo@ for (i in 1..3) {
        println("\ni: $i ")
        for (j in 1..3) {
            println("\nj: $j")
            for (k in 1..5) {
                if (k.equals(3)) break@terminarTodoCiclo
                println("k: $k")
            }
        }
    }
    println("Ahora veamos cómo se comporta con Continue:")
    for (i in 1..3) {
        println("\ni: $i ")
        for (j in 1..3) {
            println("\nj: $j")
            for (k in 1..5) {
                if (k.equals(3)) continue
                println("k: $k")
            }
        }
    }
    println("Continue+Label")
    escaparJ@ for (i in 1..3) {
        println("\ni: $i ")
        for (j in 1..3) {
            println("\nj: $j")
            for (k in 1..5) {
                if (k.equals(3)) continue@escaparJ
                println("k: $k")
            }
        }
    }

    //ecepciones valor null se usan como falla de seguridad error de java

    /*try {
        var compute: String?
        compute = null
        var longitud: Int = compute!!.length
    }catch (e: NullPointerException){
        print("No aceptamos valores nulos")
    }*/

    //llamada segura
    var compute:String? = null
    var longitud: Int? = compute?.length //null
    println("Longitud: $longitud")

    //Operador Elvis
    var teclado: String? = null
    var longitudTeclado: Int = teclado?.length ?: 0
    print("Longitud teclado: $longitudTeclado")

    val listWithNull: List<Int?> = listOf<Int?>(7,null,null,4)
    println("Lista con null: ${listWithNull}")

    val listWithNulls: List<Int?> = listWithNull.filterNotNull()
    println("Lista sin null: ${listWithNulls}")


    //arreglos a array
    val countries = arrayOf("India", "Mexico", "Colombia","Argentina", "Chila")

    val days = arrayOf<String>("Lunes", "Martes", "Miercoles")

    //Promedio de los numeros dados
    val numbers = intArrayOf(1,2,3,4,26)
    //mi forma
    var plusNumbers = 0
    var contaNumbers = 0
    for (num:Int in numbers ){
        println("Numbers: $num")
        plusNumbers=plusNumbers+num
        contaNumbers++
    }
    println("Promedio de arreglo es: ${plusNumbers/contaNumbers}")
    //clase
    var suma=0
    for (num in numbers){
        suma += num
    }
    println("Promedio de arreglo es: ${suma/numbers.size}")

    var arrayObject= arrayOf(1,2,3)
    var intPrimitive : IntArray = arrayObject.toIntArray()

    suma = arrayObject.sum()
    println("La suma del array es: $suma")

    arrayObject=arrayObject.plus(4)

    suma = arrayObject.sum()
    for (a:Int in arrayObject){
        println("array: $a")
    }
    println("La suma del array es: $suma")

    //invertir los datos del arreglo
    arrayObject=arrayObject.reversedArray()
    for (a:Int in arrayObject){
        println("array reverseArray: $a")
    }

    arrayObject.reverse()
    for (a:Int in arrayObject){
        println("array reverseArray: $a")
    }

    //Expresiones y valores
    var x=5
    println("x es igual a 5: ${x==5}")//true

    var mensaje = "El valor de x es: $x"
    x++
    println("${mensaje.replace("es","fue")}, x es igual a: $x")

    //funciones de kotlin
    println("La raiz cuadrada de: ${Math.sqrt(4.0)}")

    val numbersFun = intArrayOf(1,2,3,4,26)
    println("El promedio de los numeros es: ${averageNumbers(numbersFun,2)}")

    //funcion con valores por defecto, solo el segundo elemento es opcional
    println("${evaluate(4)}")

    //Lambdas
    val saludo ={ println("Hola mundo")}
    saludo()

    //var suma = {instrucciones -> sentencias}
    var plus = {a: Int, b: Int, c: Int -> a+b+c}
    val result = plus(3,4,5)
    println(result)
    println(plus(1,2,3))
    println({a: Int, b: Int, c: Int -> a+b+c}(2,3,4))

    val calculateNumber = {n:Int ->
        when(n){
            in 1..3-> println("El numero esta entre 1 y 3")
            in 4..7-> println("El numero esta entre 4 y 7")
            in 8..10-> println("El numero esta entre 8 y 10")
        }
    }
    println(calculateNumber(6))

    val camera = Camera()
    camera.turnOn()
    //println("La camara esta ${camera.isOn}")
    println(camera.getCameraStatus())
    camera.turnOff()
    println(camera.getCameraStatus())

    camera.setResolution(1080)
    println("Camera resolution is: ${camera.getResolution()}")

    camera.setScreenStatus()
    println("Camera screen is: ${camera.getScreenStatus()}")

    camera.setScreenStatus()
    println("Camera screen is: ${camera.getScreenStatus()}")

    camera.getHeadsetStatus()
    println("${camera.getHeadsetStatus()}")

    camera.getHeadsetStatus()
    println(" ${camera.getHeadsetStatus()}")

    //camera.isOn = false//no se debe alteral de forma externa

    var shoe = Shoe("Shoe","Zapato",1234,"Praga")
    println("Shoe: ${shoe.toString()}")
    shoe.create()
//    shoe.size=31
//    println(shoe.size)
//
//    println(shoe.mark)
//
//    shoe.model="Tennis"
//    println(shoe.model)

    val movie = Movie("COCO","Pizar",120)
    println("Movie")
    println(movie.title)
    println(movie.creator)
    println("${movie.duration}")
}

//data class Movie (val title: String, val creator: String, val duration: Int)

fun evaluate(number: Int = 2, character: Char = '='): String {
    return "$number es $character"
}

fun averageNumbers(numbers: IntArray, n: Int): Int {
    //val numbers = intArrayOf(1,2,3,4,26)
    var suma=0
    for (num in numbers){
        suma += num
    }
    return (suma/numbers.size) + n
}