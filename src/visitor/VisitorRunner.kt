package visitor

fun main(args: Array<String>) {
    val artClass = ArtClassActivity(costPerYear = 500)
    val dramaClass = DramaClassActivity(hours = 12, costPerHour = 10)
    val danceClass = DanceClassActivity(costPerMonth = 200)
    val anotherDanceClass = DanceClassActivity(costPerMonth = 250)

    val classes = arrayOf(artClass, dramaClass, danceClass, anotherDanceClass)

    val monthlyCostReportVisitor = MonthlyCostReportVisitor()
    classes.forEach { it.accept(monthlyCostReportVisitor) }
    println("Monthly cost: ${monthlyCostReportVisitor.monthlyCost}")
}