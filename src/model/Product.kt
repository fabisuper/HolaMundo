package model

//open class Product (var name:String, var description:String, var sku:Int): Any(){
abstract class Product (var name:String, var description:String, var sku:Int): Any(){

    override fun toString(): String {
        return "\nName: $name\nDescription: $description\nSKU $sku"
    }

//    open fun create():String{//se les pone open por que esta cerrado por defecto//se paso a class shoe
//        return "create"
//    }
    //abstract fun create():String//se paso a la interface

//    open fun  read():String{
//        return "read"
//    }
    //abstract fun  read():String

//    open fun  update():String{
//        return "update"
//    }
    //abstract  fun  update():String

//    open fun  delete():String{
//        return "delete"
//    }
    //abstract fun  delete():String

}