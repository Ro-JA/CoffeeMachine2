class City(val name: String) {
    var population: Int = 0
        set(value)  {
            if (value > 50_000_000)
                field = value
        }
}