fun main(args: Array<String>) {
    print("Masukkan bilangan: ")
    val masukan = readln().toInt()
    val bilanganPrima = BilanganPrima()
    bilanganPrima.printJenisBilangan(masukan)

}