package visitor

class DanceClassActivity(val costPerMonth: Long) : ReportVisitable {
    override fun accept(visitor: ReportVisitor) = visitor.visit(this)
}