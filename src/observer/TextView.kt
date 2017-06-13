package observer

import kotlin.properties.Delegates

class TextView {

    var listener: TextChangedListener? = null

    var text: String by Delegates.observable("") { _, _, new ->
        listener?.onTextChanged(new)
    }
}
