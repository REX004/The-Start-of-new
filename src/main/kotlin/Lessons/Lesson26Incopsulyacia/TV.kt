package Lessons.Lesson26Incopsulyacia

class TV {
    private var channels = arrayOf("BBC", "FOX", "NBC")
    private var currentChannel = channels[0]
    private var type = "AM"
    private var frequency = 200

    fun setChannels(newChannels: Array<String>){
        channels = newChannels

    }
    fun getChannels() = channels
    fun watch(channelNumber: Int){
        currentChannel = channels[channelNumber]

        when (channelNumber){
            0 -> {
                type = "AM"
                frequency = 200
            }
            1 -> {
                type = "FM"
                frequency = 95
            }
            2 -> {
                type = "AM"
                frequency = 150
            }
        }

        println("You are watching $currentChannel")
        println("Channel type $type")
        println("Frequency $frequency")

    }
}