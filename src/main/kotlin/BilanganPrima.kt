class BilanganPrima {

    fun cekBilanganPrima(num : Int) : Boolean{

        if(num == 0 || num == 1){
            return false
        }else{
            for(i in 2 .. num/2){
                if(num % i == 0){
                    return false
                    break
                }
            }
            return true
        }




    }

    fun printJenisBilangan(num: Int) {
        if (cekBilanganPrima(num)){
            println("$num adalah bilangan prima")
        }else{
            println("$num adalah bukan prima")
        }
    }
}