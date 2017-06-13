package strategy

fun main(args: Array<String>) {
    Printer(Printer.lowerCaseFormatter).apply { printString("Make Me LOWERCASE") }

    Printer(Printer.upperCaseFormatter).apply { printString("Make Me uppercase") }
}