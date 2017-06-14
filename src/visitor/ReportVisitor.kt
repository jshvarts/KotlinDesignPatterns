package visitor

interface ReportVisitor {
    fun visit(contract: ArtClassActivity)
    fun visit(contract: DanceClassActivity)
    fun visit(contract: DramaClassActivity)
}