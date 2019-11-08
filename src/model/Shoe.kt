package model
//agregando parentesis y variables indispensables se convierte en constructor primario
class Shoe(name:String, description:String,sku: Int, var brand: String): Product(name, description, sku),ICrudAction {

    override fun create():String{
        saludar("Hola desde create")
        return "Create Sohe"
    }

    override fun read(): String {
        return "Read Sohe"
    }

    override fun update(): String {
        return "Update Sohe"
    }

    override fun delete(): String {
        return "Delete Sohe"
    }

//    override fun toString(): String {
//        return super.toString()
//    }

    override fun toString(): String {//Polimorfimos: modificamos un metodo de la clase padrepara que se comporte distinto
        return super.toString()+ "SKU id $sku \nMarca $brand \nModelo $model \nSize $size \nColor $color"
    }//se reutiliza la clase padre y se concatena

    init {
        println("Sku id: $sku")
        println("Marca: $brand")
        toString()
    }
    var size: Int = 34 // minimo
        set(value) {
            if (value>=34){
                field=value
            }else{
                field=34
            }
        }
        get() = field

    var color: String = "White"//cool
    var model: String = "Boots"// no sean tennis
        set(value) {
        if (value.equals("Tennis")){
            field="Boots"
        }else{
            field=value
        }
    }
        //get() = field
}