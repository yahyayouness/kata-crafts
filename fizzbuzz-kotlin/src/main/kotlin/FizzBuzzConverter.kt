class FizzBuzzConverter {
    fun convert(input: Int): String {
        val isInputModuloThreeAndFive: Boolean = (input%3 == 0) && (input%5 == 0)
        val isInputModuloThree: Boolean = (input%3 == 0)
        val isInputModuloFive: Boolean = (input%5 == 0)

        if(isInputModuloThreeAndFive) return "FizzBuzz"
        if (isInputModuloThree) return "Fizz"
        if (isInputModuloFive) return "Buzz"

        return input.toString()
    }

}
