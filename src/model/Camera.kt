package model

class Camera {

    private var isOn: Boolean = false
    private var resolution: Int = 640
    private var screen: Boolean = false
    private var headset: Boolean = false

    fun setHeadsetStatus(){
        if (headset){
            headset=false
        }else{
            headset=true
        }
    }

    fun getHeadsetStatus(): String{
        return if (headset) "headset is plugged" else "headset is unplugged"
    }

    fun setScreenStatus(){
        if (screen){
            screen=false
        }else{
            screen=true
        }
    }

    fun getScreenStatus(): String{
        return if (screen) "power-on" else "Spower-off"
    }

    fun  setResolution(resolution: Int){
        this.resolution = resolution
    }

    fun getResolution(): Int{
        return this.resolution
    }

    fun turnOn(){
        isOn = true
    }

    fun turnOff(){
        isOn = false
    }

//    fun cameraStatus(): String{
//        //val message: String = if (isOn) "Camera is Turned" else "Camera is not Turned"
//        //return  message
//        return if (isOn) "Camera is Turned" else "Camera is not Turned"
//    }

    fun getCameraStatus(): String{
        return if (isOn) "Camera is Turned" else "Camera is not Turned"
    }

//    fun setCameraStatus(onOff: Boolean){
//        isOn = onOff
//    }
}