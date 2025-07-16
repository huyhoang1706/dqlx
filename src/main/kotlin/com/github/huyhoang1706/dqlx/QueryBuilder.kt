package com.github.huyhoang1706.dqlx

fun Query(rootQueryFun: FilterFun): QueryBuilder {
    TODO("Not yet implemented")
}

class QueryBuilder(
    val type: Class<*>,
    val alias: String? = null,
    val variables: List<QueryBuilder>? = null,
    val childrenEdges: Map<String, List<QueryBuilder>>? = null) {


}