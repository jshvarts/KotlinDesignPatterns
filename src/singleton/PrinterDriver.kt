package singleton

object PrinterDriver {
    init {
        println("Initializing object: $this")
    }

    fun print() = println("Printing with object: $this")
}