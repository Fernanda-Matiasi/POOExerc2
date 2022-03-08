class Patinete (cor: String){
    /*
    Crie uma classe patinete e apresente os atributos e métodos referentes esta classe,
     em seguida crie um objeto patinete, defina as instancias deste objeto e apresente
     as informações deste objeto no console.
     */

    var rodas = 0
    var quidao = ""
    var buzina = false
    var lanterna = false
    var lanternaOnOff = false
    var velocidade = 0.0
    var motor = false

    fun buzinar(){
        if(buzina){
            println("Biiiibiiiiii")
        }else{
            println("Esse patinete não tem buzina")
        }
    }

    fun acelerar(valor: Double){
        velocidade += valor
    }

    fun freiar(valor: Double){
        velocidade -= valor

        if (velocidade < 0){
            velocidade = 0.0
        }
    }

    fun ligarLanterna(){
        if (lanterna){
            lanternaOnOff = !lanternaOnOff
        }
    }

    override fun toString(): String {
        return "Buzina - $buzina" +
                "\nVelocidade - $velocidade " +
                "\nLanterna - $lanternaOnOff "
    }
}