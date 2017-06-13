package strategy

class Printer(val stringFormatterStrategy: (String) -> String) {
    companion object {
        val lowerCaseFormatter = { it: String -> it.toLowerCase() }
        val upperCaseFormatter = { it: String -> it.toUpperCase() }
    }

    fun printString(string: String) = println(stringFormatterStrategy.invoke(string))
}


