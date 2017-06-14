package visitor

class DramaClassActivity(val costPerHour: Long, val hours: Long) : ReportVisitable {
    override fun accept(visitor: ReportVisitor) = visitor.visit(this)
}