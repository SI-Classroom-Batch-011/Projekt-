class Spiel() {

    var list = mutableListOf<Spielfeld>(
        Spielfeld(false , false) ,
        Spielfeld(false , true) ,
        Spielfeld(true , true),
        Spielfeld(false , true),
        Spielfeld(true , false)
    )

    fun spielSpielen(){
        for (spielfeld in list) {
            if (spielfeld.wand bb) {
                spielfeld.richtungsauswahl()
                spielfeld.kreuzung1()
            }
        }
    }


}