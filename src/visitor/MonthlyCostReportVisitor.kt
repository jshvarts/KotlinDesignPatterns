package visitor

class MonthlyCostReportVisitor(var monthlyCost: Long = 0) : ReportVisitor {
    override fun visit(activity: ArtClassActivity) {
        monthlyCost += activity.costPerYear / 12
    }

    override fun visit(activity: DanceClassActivity) {
        monthlyCost += activity.costPerMonth
    }

    override fun visit(activity: DramaClassActivity) {
        monthlyCost += activity.costPerHour * activity.hours
    }

}