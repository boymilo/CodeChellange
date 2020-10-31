class Controller(private val listener:Callback){
    private var guntingBatuKertas:GuntingBatuKertas? = null

    fun result(){
        var result = ""
        if(guntingBatuKertas!!.getPlayer1() == guntingBatuKertas!!.getPlayer2()){
            result = "DRAW!"
        }
        else if((guntingBatuKertas!!.getPlayer1() == "kertas" && guntingBatuKertas!!.getPlayer2() == "batu") || (guntingBatuKertas!!.getPlayer1() == "batu" && guntingBatuKertas!!.getPlayer2() == "gunting") || (guntingBatuKertas!!.getPlayer1() == "gunting" && guntingBatuKertas!!.getPlayer2() == "kertas")){
            result = "Pemain 1 MENANG!"
        }
        else{
            result = "Pemain 2 MENANG!"
        }
        listener.hasil(result)
    }

    fun setGuntingBatuKertas(guntingBatuKertas: GuntingBatuKertas){
        this.guntingBatuKertas = guntingBatuKertas
    }

    fun cek(): Boolean {
        var hasil = false
        if ((guntingBatuKertas?.getPlayer1() == "gunting" || guntingBatuKertas?.getPlayer1() == "batu" || guntingBatuKertas?.getPlayer1() == "kertas") && (guntingBatuKertas?.getPlayer2() == "gunting" || guntingBatuKertas?.getPlayer2() == "batu" || guntingBatuKertas?.getPlayer2() == "kertas")) hasil = true
        return hasil
    }

    fun start(){
        listener.start()
    }

    fun stop(){
        listener.stop()
    }

    fun setPlayer1(player1:String){
        guntingBatuKertas?.setPlayer1(player1)
    }

    fun setPlayer2(player2:String){
        guntingBatuKertas?.setPlayer2(player2)
    }

    fun menu():String{
        return(listener.menu().toString())
    }
}