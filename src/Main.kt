import kotlin.system.exitProcess

class Main{
    companion object: Callback{
        @JvmStatic
        fun main(args: Array<String>) {
            while(true){
                var guntingBatuKertas = GuntingBatuKertas()
                val controller = Controller(this)
                controller.setGuntingBatuKertas(guntingBatuKertas)
                when(controller.menu()){
                    "1" -> {
                        controller.start()
                        print("1. Masukkan pemain 1: ")
                        controller.setPlayer1(readLine()!!)
                        print("2. Masukkan pemain 2: ")
                        controller.setPlayer2(readLine()!!)
                        if(controller.cek()){
                            controller.result()
                        }
                        else {
                            println("Inputan tidak sesuai (Hanya bisa memasukan gunting/batu/kertas)")
                        }
                    }
                    "2" -> controller.stop()
                    else -> println("Inputan tidak sesuai")
                }
            }
        }

        override fun hasil(result: String) {
            println("Hasil: ")
            println(result)
        }

        override fun menu(): String {
            var pilihan:String? = ""
            while(true){
                println("==========================")
                println("MENU")
                println("1. Mulai game")
                println("2. Keluar")
                print("Masukkan pilihan:")
                pilihan = readLine()
                return pilihan.toString()
            }
        }

        override fun start(){
            println("==========================")
            println("GAME SUIT TERMINAL VERSION")
            println("==========================")
        }

        override fun stop() {
            exitProcess(200)
        }
    }
}