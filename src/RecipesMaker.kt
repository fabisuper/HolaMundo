import model.Ingrediente

var recetas = ""

fun main() {
    println("\n   BIENVENIDO A RECIPES MAKER")

    do{
        println("""     Selecciona la opción deseada
        1. Hacer una receta
        2. Ver mis recetas
        3. Inventario
        4. Salir""")

        val response:String? = readLine()
        when(response){
            "1" -> makeRecipe()
            "2" -> viewRecipe()
            "3" -> recipes()
            "4" -> println("escogio SALIR")
            else -> println("opcion no valida")
        }
    }while (response!="4")
}

fun makeRecipe() {
    var receta=""
    println("\n\nescogio crear receta\n\nIngrese el nombre de la reseta")
    do{
        val nombRereceta:String? = readLine()
        println("El nombre de su receta es ${nombRereceta}, es correcto: si o no")
        val response:String? = readLine()
        receta = nombRereceta+"\n"
        if (((response=="si")or(response=="SI")).not()){
            println("Agregue nuevamente el nombre:")
        }
    }while (((response=="si")or(response=="SI")).not())

    var ingredientes = listOf("Agua","Leche","Carne","Verduras","Frutas","Cereal","Huevos","Aceite")
    for(ingrediente in ingredientes){
        println("le agregas $ingrediente: si o no")
        val response:String? = readLine()
        if ((response=="si")or(response=="SI")){
            receta=receta+"     $ingrediente\n"
        }
    }
    println("tu receta ${receta}quieres agregarla: si o no")
    val response:String? = readLine()
    if ((response=="si")or(response=="SI")){
        recetas=recetas+receta+"\n"
        println("Recete agregada\n")
    }else{
        println("Recete no agregada")
    }
}

fun viewRecipe() {
    println("\n\n\nEstas son tus recetas\n\n$recetas\n\n\n")

}

fun recipes(){
    val grupos = arrayOf(
        "FRUTAS",
        "LACTEOS",
        "CARNES LEGUMBRES Y HUEVOS",
        "GRANOS",
        "ACEITES",
        "VERDURAS",
        "AGUA"
    )
    var inventario = arrayOf(
        Ingrediente("Fresa","FRUTAS"),
        Ingrediente("Plátano","FRUTAS"),
        Ingrediente("Plátano","FRUTAS"),
        Ingrediente("Uvas","FRUTAS"),
        Ingrediente("Manzana","FRUTAS"),
        Ingrediente("Naranja","FRUTAS"),
        Ingrediente("Pera","FRUTAS"),
        Ingrediente("Cereza","FRUTAS"),
        Ingrediente("Avena","GRANOS"),
        Ingrediente("Trigo","GRANOS"),
        Ingrediente("Arroz","GRANOS"),
        Ingrediente("Maiz","GRANOS"),
        Ingrediente("Agua","AGUA"),
        Ingrediente("Leche","LACTEOS"),
        Ingrediente("Carne","CARNES LEGUMBRES Y HUEVOS"),
        Ingrediente("Repollo","VERDURAS"),
        Ingrediente("Abichuela","VERDURAS"),
        Ingrediente("Huevos","CARNES LEGUMBRES Y HUEVOS"),
        Ingrediente("Remolacha","VERDURAS"),
        Ingrediente("Aceie de Olivo","ACEITES")
    )

    for (con in grupos){
        println("Grupo de alimentos: $con")
        var num=1
        for (cont in inventario){
            if (cont.grupo.equals(con)){
                println("$num  ${cont.nombre}")
                num++
            }
        }
        println("\n\n")
    }
}