package visitor

class ArtClassActivity(val costPerYear: Long) : ReportVisitable {
    override fun accept(visitor: ReportVisitor) = visitor.visit(this)
}