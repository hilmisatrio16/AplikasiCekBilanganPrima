class BilanganPrima {

    fun cekBilanganPrima(num : Int) : Boolean{
        if(num <= 1){
             return false
        }else if(num < 2){
             return false
        }else if(num % 2 == 0 || num % 3 == 0){
             return false
        }
        var bil = 5

        while (bil * bil <= num){
            if(num % bil == 0 || num % (bil + 2) == 0){
                return false
            }
            bil += 6
        }
        return true

    }

    fun printJenisBilangan(num: Int) {
        if (cekBilanganPrima(num)){
            println("$num adalah bilangan prima")
        }else{
            println("$num adalah bilangan prima")
        }
    }
}