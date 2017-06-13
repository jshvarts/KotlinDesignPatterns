package command

class CommandProcessor {
    private val queue = ArrayList<OrderCommand>()

    fun addToQueue(orderCommand: OrderCommand): CommandProcessor
            = apply { queue.add(orderCommand) }

    // the above is equivalent to:
    //fun addToQueue(orderCommand: OrderCommand): CommandProcessor {
    //    queue.add(orderCommand)
    //    return this
    //}

    fun processCommands(): CommandProcessor = apply {
        queue.forEach { it.execute() }
        queue.clear()
    }
}