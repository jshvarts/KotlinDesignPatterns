package visitor

interface ReportVisitable {
    fun accept(visitor: ReportVisitor)
}