package com.github.huyhoang1706.dqlx

class Node : DQLizer {
    private var attributes: DQLizer? = null
    private var parentName: String? = null
    private var edges: Map<String, List<QueryBuilder>>? = null
    private var hasParentAttributes: Boolean = false


    override fun toDQL(): Pair<String, Map<String, Any>> {
        TODO("Not yet implemented")
    }
}
