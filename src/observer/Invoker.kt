package observer

fun main(args: Array<String>) {
    val textView: TextView = TextView()
    textView.text = "INITIAL"
    textView.text = "INITIAL UPDATE"
    textView.listener = PrintTextChangedListener()
    textView.text = "CHANGE"
    textView.text = "ANOTHER UPDATE"

    // Prints:
    //Text is changed to: CHANGE
    //Text is changed to: ANOTHER UPDATE
}