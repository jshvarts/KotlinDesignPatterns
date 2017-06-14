package factory

fun main(args: Array<String>) {
    val noCurrencyCode = "No Currency Code Available"

    val israelCode = CurrencyFactory().currencyForCountry(Country.Israel)?.code ?: noCurrencyCode
    println("Israel currency: $israelCode")

    val greeceCode = CurrencyFactory().currencyForCountry(Country.Greece)?.code ?: noCurrencyCode
    println("Greece currency: $greeceCode")

    val spainCode = CurrencyFactory().currencyForCountry(Country.Spain)?.code ?: noCurrencyCode
    println("Spain currency: $spainCode")

    val usCode = CurrencyFactory().currencyForCountry(Country.UnitedStates)?.code ?: noCurrencyCode
    println("US currency: $usCode")

    val ukCode = CurrencyFactory().currencyForCountry(Country.UK)?.code ?: noCurrencyCode
    println("UK currency: $ukCode")
}
