package factory

class CurrencyFactory {
    fun currencyForCountry(country: Country): Currency? {
        when (country) {
            Country.Spain, Country.Greece -> return Euro()
            Country.Israel                -> return IsraeliShekel()
            Country.UnitedStates          -> return USDollar()
            else                          -> return null
        }
    }
}