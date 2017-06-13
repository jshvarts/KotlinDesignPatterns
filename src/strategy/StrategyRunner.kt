package strategy

fun main(args: Array<String>) {
    val lowerCasePrinter = Printer(Printer.lowerCaseFormatter)
    lowerCasePrinter.printString("Make Me LOWERCASE")

    val upperCasePrinter = Printer(Printer.upperCaseFormatter)
    upperCasePrinter.printString("Make Me uppercase")

    val prefixPrinter = Printer({ "Prefix: " + it })
    prefixPrinter.printString("Add prefix please")
}