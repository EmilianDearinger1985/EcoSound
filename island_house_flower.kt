//Customizable style
interface HeadphoneStyle {
    fun playMusic()
    fun pauseMusic()
    fun adjustVolume(volume: Int)
    fun muteSound()
}

//Noise-cancelling style
interface NoiseCancellingStyle {
    fun activateNoiseCancelling()
    fun adjustNoiseCancellingIntensity(intensity: Int)
    fun deactivateNoiseCancelling()
}

//Sustainable style
interface SustainableStyle {
    fun powerOn()
    fun powerOff()
    fun useEcoFriendlyMaterials()
}

//Combined style
class SustainableNoiseCancellingHeadphones: HeadphoneStyle, NoiseCancellingStyle, SustainableStyle {
    override fun playMusic() {
        //code to play music
    }
    
    override fun pauseMusic() {
        //code to pause music
    }
    
    override fun adjustVolume(volume: Int) {
        //code to adjust volume
    }
    
    override fun muteSound() {
        //code to mute sound
    }
    
    override fun activateNoiseCancelling() {
        //code to activate noise-cancelling
    }
    
    override fun adjustNoiseCancellingIntensity(intensity: Int) {
        //code to adjust noise-cancelling intensity
    }
    
    override fun deactivateNoiseCancelling() {
        //code to deactivate noise-cancelling
    }
    
    override fun powerOn() {
        //code to power on
    }
    
    override fun powerOff() {
        //code to power off
    }
    
    override fun useEcoFriendlyMaterials() {
        //code to use eco-friendly materials
    }
}

//Usage
fun useHeadphones() {
    val sustainableNoiseCancellingHeadphones = SustainableNoiseCancellingHeadphones()
    sustainableNoiseCancellingHeadphones.playMusic()
    sustainableNoiseCancellingHeadphones.adjustVolume(10)
    sustainableNoiseCancellingHeadphones.activateNoiseCancelling()
    sustainableNoiseCancellingHeadphones.adjustNoiseCancellingIntensity(2)
    sustainableNoiseCancellingHeadphones.useEcoFriendlyMaterials()
    sustainableNoiseCancellingHeadphones.muteSound()
    sustainableNoiseCancellingHeadphones.deactivateNoiseCancelling()
    sustainableNoiseCancellingHeadphones.powerOff()
}