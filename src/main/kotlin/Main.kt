fun main(args: Array<String>) {

    val patinete = Patinete( "Vermelho")

    patinete.buzina = true
    patinete.lanterna = true

    patinete.acelerar(10.0)

    patinete.buzinar()
    patinete.buzinar()
    patinete.buzinar()
    patinete.buzinar()

    patinete.ligarLanterna()

    println(patinete)

    patinete.freiar(50.0)

    patinete.ligarLanterna()

    println(patinete)
}