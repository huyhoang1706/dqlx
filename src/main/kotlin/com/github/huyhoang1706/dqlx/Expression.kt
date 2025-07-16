package com.github.huyhoang1706.dqlx

enum class FunType(val value: String) {
    EQ_FUN("eq"),
    GE_FUN("ge"),
    GT_FUN("gt"),
    LE_FUN("le"),
    LT_FUN("lt"),
    HAS_FUN("has"),
    TYPE_FUN("type"),
    ALL_OF_TERMS_FUN("allofterms"),
    ANY_OF_TERMS_FUN("anyofterms"),
    REGEXP_FUN("regexp"),
    MATCH_FUN("match"),
    ALL_OF_TEXT_FUN("alloftext"),
    ANY_OF_TEXT_FUN("anyoftext"),
    COUNT_FUN("count"),
    EXACT_FUN("exact"),
    TERM_FUN("term"),
    FULLTEXT_FUN("fulltext"),
    VAL_FUN("val"),
    SUM_FUN("sum"),
    BETWEEN_FUN("between"),
    UID_FUN("uid"),
    UID_IN_FUN("uid_in")
}

abstract class FilterFun: DQLizer {}

class FilterExpression(val funType: FunType, val value: Any) : DQLizer {
    override fun toDQL(): Pair<String, Map<String, Any>> {
        var placeHolder: String

        TODO("Not yet implemented")
    }
}

typealias FilterKV = Map<String, Any>