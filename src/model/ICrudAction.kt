package model

interface ICrudAction{
    fun create():String
    fun  read():String
    fun  update():String
    fun  delete():String
    fun saludar(mensaje: String){
        println("Hola hola desde interfaz ICrudAction $mensaje")
    }
}